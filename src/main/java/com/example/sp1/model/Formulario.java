package com.example.sp1.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Formulario {
    private int idFormulario;
    private int idTarea;
    private String url;
    private int totalPuntos;
    private Collection<Colaboracion> colaboracionsByIdFormulario;
    private Tarea tareaByIdTarea;

    @Id
    @Column(name = "id_formulario", nullable = false)
    public int getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }

    @Basic
    @Column(name = "id_tarea", nullable = false)
    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
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
    @Column(name = "totalPuntos", nullable = false)
    public int getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formulario that = (Formulario) o;
        return idFormulario == that.idFormulario &&
                idTarea == that.idTarea &&
                totalPuntos == that.totalPuntos &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFormulario, idTarea, url, totalPuntos);
    }

    @OneToMany(mappedBy = "formularioByIdFormulario")
    public Collection<Colaboracion> getColaboracionsByIdFormulario() {
        return colaboracionsByIdFormulario;
    }

    public void setColaboracionsByIdFormulario(Collection<Colaboracion> colaboracionsByIdFormulario) {
        this.colaboracionsByIdFormulario = colaboracionsByIdFormulario;
    }

    @ManyToOne
    @JoinColumn(name = "id_tarea", referencedColumnName = "id_tarea", nullable = false)
    public Tarea getTareaByIdTarea() {
        return tareaByIdTarea;
    }

    public void setTareaByIdTarea(Tarea tareaByIdTarea) {
        this.tareaByIdTarea = tareaByIdTarea;
    }
}
