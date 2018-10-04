package com.example.sp1.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Tipo_Recurso", schema = "elearning3", catalog = "")
public class TipoRecurso {
    private int idTipoRecurso;
    private String nombre;
    private Collection<Recurso> recursosByIdTipoRecurso;

    @Id
    @Column(name = "id_tipo_recurso", nullable = false)
    public int getIdTipoRecurso() {
        return idTipoRecurso;
    }

    public void setIdTipoRecurso(int idTipoRecurso) {
        this.idTipoRecurso = idTipoRecurso;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoRecurso that = (TipoRecurso) o;
        return idTipoRecurso == that.idTipoRecurso &&
                Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoRecurso, nombre);
    }

    @OneToMany(mappedBy = "tipoRecursoByTipoRecurso")
    public Collection<Recurso> getRecursosByIdTipoRecurso() {
        return recursosByIdTipoRecurso;
    }

    public void setRecursosByIdTipoRecurso(Collection<Recurso> recursosByIdTipoRecurso) {
        this.recursosByIdTipoRecurso = recursosByIdTipoRecurso;
    }
}
