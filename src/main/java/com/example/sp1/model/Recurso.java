package com.example.sp1.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Recurso {
    private int idRecurso;
    private String nombre;
    private String url;
    private int tipoRecurso;
    private int recursoPadre;
    private int visibl;
    private int secuencia;
    private String notas;
    private int estado;
    private int semana;
    private int rol;
    private TipoRecurso tipoRecursoByTipoRecurso;
    private Semana semanaBySemana;
    private Rol rolByRol;
    private Collection<Tarea> tareasByIdRecurso;

    @Id
    @Column(name = "id_recurso", nullable = false)
    public int getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(int idRecurso) {
        this.idRecurso = idRecurso;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 150)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    @Column(name = "tipo_recurso", nullable = false)
    public int getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(int tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    @Basic
    @Column(name = "recurso_padre", nullable = false)
    public int getRecursoPadre() {
        return recursoPadre;
    }

    public void setRecursoPadre(int recursoPadre) {
        this.recursoPadre = recursoPadre;
    }

    @Basic
    @Column(name = "visibl", nullable = false)
    public int getVisibl() {
        return visibl;
    }

    public void setVisibl(int visibl) {
        this.visibl = visibl;
    }

    @Basic
    @Column(name = "secuencia", nullable = false)
    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    @Basic
    @Column(name = "notas", nullable = true, length = 255)
    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    @Basic
    @Column(name = "estado", nullable = false)
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "semana", nullable = false)
    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
    }

    @Basic
    @Column(name = "rol", nullable = false)
    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recurso recurso = (Recurso) o;
        return idRecurso == recurso.idRecurso &&
                tipoRecurso == recurso.tipoRecurso &&
                recursoPadre == recurso.recursoPadre &&
                visibl == recurso.visibl &&
                secuencia == recurso.secuencia &&
                estado == recurso.estado &&
                semana == recurso.semana &&
                rol == recurso.rol &&
                Objects.equals(nombre, recurso.nombre) &&
                Objects.equals(url, recurso.url) &&
                Objects.equals(notas, recurso.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRecurso, nombre, url, tipoRecurso, recursoPadre, visibl, secuencia, notas, estado, semana, rol);
    }

    @ManyToOne
    @JoinColumn(name = "tipo_recurso", referencedColumnName = "id_tipo_recurso", nullable = false)
    public TipoRecurso getTipoRecursoByTipoRecurso() {
        return tipoRecursoByTipoRecurso;
    }

    public void setTipoRecursoByTipoRecurso(TipoRecurso tipoRecursoByTipoRecurso) {
        this.tipoRecursoByTipoRecurso = tipoRecursoByTipoRecurso;
    }

    @ManyToOne
    @JoinColumn(name = "semana", referencedColumnName = "id_semana", nullable = false)
    public Semana getSemanaBySemana() {
        return semanaBySemana;
    }

    public void setSemanaBySemana(Semana semanaBySemana) {
        this.semanaBySemana = semanaBySemana;
    }

    @ManyToOne
    @JoinColumn(name = "rol", referencedColumnName = "id_rol", nullable = false)
    public Rol getRolByRol() {
        return rolByRol;
    }

    public void setRolByRol(Rol rolByRol) {
        this.rolByRol = rolByRol;
    }

    @OneToMany(mappedBy = "recursoByIdRecurso")
    public Collection<Tarea> getTareasByIdRecurso() {
        return tareasByIdRecurso;
    }

    public void setTareasByIdRecurso(Collection<Tarea> tareasByIdRecurso) {
        this.tareasByIdRecurso = tareasByIdRecurso;
    }
}
