package com.example.sp1.dao;

import com.example.sp1.model.Usuario;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class UsuarioDaoImp implements UsuarioDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Usuario> getAll_Usuario() {
       List<Usuario> users;
        CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();

        CriteriaQuery<Usuario> query = builder.createQuery(Usuario.class);

        users = sessionFactory.getCurrentSession().createQuery(query).getResultList();

        return users;
    }

    @Override
    public Usuario findById(int id) {
        Usuario user = sessionFactory.getCurrentSession().get(Usuario.class, id);

        return user;

    }

    @Override
    public Usuario add_Usuario(Usuario newUsuario) {
       return (Usuario) sessionFactory.getCurrentSession().save(newUsuario);
    }

    @Override
    public Usuario findByEmail(String email) {


        CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<Usuario> query = builder.createQuery(Usuario.class);

        Root<Usuario> userRoot = query.from(Usuario.class);
        query.select(userRoot);
        query.where(builder.equal(userRoot.get("email"), email));

        return sessionFactory.getCurrentSession().createQuery(query).getSingleResult();
    }

    @Override
    public boolean update_Usuario(int id, Usuario newUsuario) {
       Usuario user = findById(id);
       if(user != null){
           sessionFactory.getCurrentSession().merge(newUsuario);
       }else{
           return false;
       }
       return true;

    }

    @Override
    public boolean delete_Usuario(int id) {
        return false;
    }
}

/*https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/*/