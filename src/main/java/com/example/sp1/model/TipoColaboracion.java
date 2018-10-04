package com.example.sp1.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Tipo_Colaboracion", schema = "elearning3", catalog = "")
public class TipoColaboracion {
    private int idTipoColaboracion;
    private String descripcion;
    private Collection<Colaboracion> colaboracionsByIdTipoColaboracion;

    @Id
    @Column(name = "id_tipo_colaboracion", nullable = false)
    public int getIdTipoColaboracion() {
        return idTipoColaboracion;
    }

    public void setIdTipoColaboracion(int idTipoColaboracion) {
        this.idTipoColaboracion = idTipoColaboracion;
    }

    @Basic
    @Column(name = "descripcion", nullable = false, length = 150)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoColaboracion that = (TipoColaboracion) o;
        return idTipoColaboracion == that.idTipoColaboracion &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoColaboracion, descripcion);
    }

    @OneToMany(mappedBy = "tipoColaboracionByIdTipoColaboracion")
    public Collection<Colaboracion> getColaboracionsByIdTipoColaboracion() {
        return colaboracionsByIdTipoColaboracion;
    }

    public void setColaboracionsByIdTipoColaboracion(Collection<Colaboracion> colaboracionsByIdTipoColaboracion) {
        this.colaboracionsByIdTipoColaboracion = colaboracionsByIdTipoColaboracion;
    }
}
