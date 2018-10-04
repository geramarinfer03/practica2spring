package com.example.sp1.configurations;


import com.example.sp1.model.*;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@EnableAspectJAutoProxy
@ComponentScans(value = {
        @ComponentScan("com.example.sp1.model"),
        @ComponentScan("com.example.sp1.dao"),
        @ComponentScan("com.example.sp1.service")


})
public class RootConfig {

    @Autowired
    private Environment env;

    @Bean
    public DataSource getDataSource(){

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName(env.getProperty("db.driver"));
        dataSource.setUrl(env.getProperty("db.url"));
        dataSource.setUsername(env.getProperty("db.username"));
        dataSource.setPassword(env.getProperty("db.password"));

        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean getSessionFactory(){
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(getDataSource());

        Properties props = new Properties();
        props.put("hibernate.show_sql",env.getProperty("hibernate.show_sql"));
        props.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        props.put("hibernate.dialect", env.getProperty("hibernate.dialect"));

        factoryBean.setHibernateProperties(props);
        factoryBean.setAnnotatedClasses(Usuario.class, Colaboracion.class, Curso.class, Entrega.class, Formulario.class,
                Matricula.class, Recurso.class, Rol.class, Semana.class, Tarea.class, TipoColaboracion.class, TipoRecurso.class);

        return factoryBean;
    }

    @Bean
    public HibernateTransactionManager getTransactionManager(){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;

    }
}
