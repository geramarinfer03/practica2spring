package com.example.sp1.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Matricula {
    private int idMatricula;
    private int periodo;
    private Date ano;
    private int curso;
    private int usuario;
    private int rol;
    private Timestamp fechaMatricula;
    private Double promedioFinal;
    private String url;
    private Integer generarPdf;
    private Timestamp fechaCreado;
    private Collection<Entrega> entregasByIdMatricula;
    private Curso cursoByCurso;
    private Usuario usuarioByUsuario;
    private Rol rolByRol;

    @Id
    @Column(name = "id_matricula", nullable = false)
    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    @Basic
    @Column(name = "periodo", nullable = false)
    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Basic
    @Column(name = "ano", nullable = false)
    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    @Basic
    @Column(name = "curso", nullable = false)
    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Basic
    @Column(name = "usuario", nullable = false)
    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "rol", nullable = false)
    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    @Basic
    @Column(name = "fecha_matricula", nullable = false)
    public Timestamp getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Timestamp fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    @Basic
    @Column(name = "promedio_final", nullable = true, precision = 2)
    public Double getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(Double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "generarPDF", nullable = true)
    public Integer getGenerarPdf() {
        return generarPdf;
    }

    public void setGenerarPdf(Integer generarPdf) {
        this.generarPdf = generarPdf;
    }

    @Basic
    @Column(name = "fecha_creado", nullable = true)
    public Timestamp getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(Timestamp fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return idMatricula == matricula.idMatricula &&
                periodo == matricula.periodo &&
                curso == matricula.curso &&
                usuario == matricula.usuario &&
                rol == matricula.rol &&
                Objects.equals(ano, matricula.ano) &&
                Objects.equals(fechaMatricula, matricula.fechaMatricula) &&
                Objects.equals(promedioFinal, matricula.promedioFinal) &&
                Objects.equals(url, matricula.url) &&
                Objects.equals(generarPdf, matricula.generarPdf) &&
                Objects.equals(fechaCreado, matricula.fechaCreado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMatricula, periodo, ano, curso, usuario, rol, fechaMatricula, promedioFinal, url, generarPdf, fechaCreado);
    }

    @OneToMany(mappedBy = "matriculaByIdMatricula")
    public Collection<Entrega> getEntregasByIdMatricula() {
        return entregasByIdMatricula;
    }

    public void setEntregasByIdMatricula(Collection<Entrega> entregasByIdMatricula) {
        this.entregasByIdMatricula = entregasByIdMatricula;
    }

    @ManyToOne
    @JoinColumn(name = "curso", referencedColumnName = "id_curso", nullable = false)
    public Curso getCursoByCurso() {
        return cursoByCurso;
    }

    public void setCursoByCurso(Curso cursoByCurso) {
        this.cursoByCurso = cursoByCurso;
    }

    @ManyToOne
    @JoinColumn(name = "usuario", referencedColumnName = "id", nullable = false)
    public Usuario getUsuarioByUsuario() {
        return usuarioByUsuario;
    }

    public void setUsuarioByUsuario(Usuario usuarioByUsuario) {
        this.usuarioByUsuario = usuarioByUsuario;
    }

    @ManyToOne
    @JoinColumn(name = "rol", referencedColumnName = "id_rol", nullable = false)
    public Rol getRolByRol() {
        return rolByRol;
    }

    public void setRolByRol(Rol rolByRol) {
        this.rolByRol = rolByRol;
    }
}
