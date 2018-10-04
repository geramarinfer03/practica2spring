package com.example.sp1.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Rol {
    private int idRol;
    private String nombre;
    private int estado;
    private Collection<Matricula> matriculasByIdRol;
    private Collection<Recurso> recursosByIdRol;
    private Collection<Usuario> usuariosByIdRol;

    @Id
    @Column(name = "id_rol", nullable = false)
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 30)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "estado", nullable = false)
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rol rol = (Rol) o;
        return idRol == rol.idRol &&
                estado == rol.estado &&
                Objects.equals(nombre, rol.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRol, nombre, estado);
    }

    @OneToMany(mappedBy = "rolByRol")
    public Collection<Matricula> getMatriculasByIdRol() {
        return matriculasByIdRol;
    }

    public void setMatriculasByIdRol(Collection<Matricula> matriculasByIdRol) {
        this.matriculasByIdRol = matriculasByIdRol;
    }

    @OneToMany(mappedBy = "rolByRol")
    public Collection<Recurso> getRecursosByIdRol() {
        return recursosByIdRol;
    }

    public void setRecursosByIdRol(Collection<Recurso> recursosByIdRol) {
        this.recursosByIdRol = recursosByIdRol;
    }

    @OneToMany(mappedBy = "rolByIdRol")
    public Collection<Usuario> getUsuariosByIdRol() {
        return usuariosByIdRol;
    }

    public void setUsuariosByIdRol(Collection<Usuario> usuariosByIdRol) {
        this.usuariosByIdRol = usuariosByIdRol;
    }
}
