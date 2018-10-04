package com.example.sp1.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Tarea {
    private int idTarea;
    private int idRecurso;
    private int idCurso;
    private Timestamp fechLimitEntrega;
    private Timestamp fechLimitEvaluacion;
    private double porcentaje;
    private Collection<Entrega> entregasByIdTarea;
    private Collection<Formulario> formulariosByIdTarea;
    private Recurso recursoByIdRecurso;
    private Curso cursoByIdCurso;

    @Id
    @Column(name = "id_tarea", nullable = false)
    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    @Basic
    @Column(name = "id_recurso", nullable = false)
    public int getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(int idRecurso) {
        this.idRecurso = idRecurso;
    }

    @Basic
    @Column(name = "id_curso", nullable = false)
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    @Basic
    @Column(name = "fech_limit_entrega", nullable = false)
    public Timestamp getFechLimitEntrega() {
        return fechLimitEntrega;
    }

    public void setFechLimitEntrega(Timestamp fechLimitEntrega) {
        this.fechLimitEntrega = fechLimitEntrega;
    }

    @Basic
    @Column(name = "fech_limit_evaluacion", nullable = false)
    public Timestamp getFechLimitEvaluacion() {
        return fechLimitEvaluacion;
    }

    public void setFechLimitEvaluacion(Timestamp fechLimitEvaluacion) {
        this.fechLimitEvaluacion = fechLimitEvaluacion;
    }

    @Basic
    @Column(name = "porcentaje", nullable = false, precision = 2)
    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarea tarea = (Tarea) o;
        return idTarea == tarea.idTarea &&
                idRecurso == tarea.idRecurso &&
                idCurso == tarea.idCurso &&
                Double.compare(tarea.porcentaje, porcentaje) == 0 &&
                Objects.equals(fechLimitEntrega, tarea.fechLimitEntrega) &&
                Objects.equals(fechLimitEvaluacion, tarea.fechLimitEvaluacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTarea, idRecurso, idCurso, fechLimitEntrega, fechLimitEvaluacion, porcentaje);
    }

    @OneToMany(mappedBy = "tareaByIdTarea")
    public Collection<Entrega> getEntregasByIdTarea() {
        return entregasByIdTarea;
    }

    public void setEntregasByIdTarea(Collection<Entrega> entregasByIdTarea) {
        this.entregasByIdTarea = entregasByIdTarea;
    }

    @OneToMany(mappedBy = "tareaByIdTarea")
    public Collection<Formulario> getFormulariosByIdTarea() {
        return formulariosByIdTarea;
    }

    public void setFormulariosByIdTarea(Collection<Formulario> formulariosByIdTarea) {
        this.formulariosByIdTarea = formulariosByIdTarea;
    }

    @ManyToOne
    @JoinColumn(name = "id_recurso", referencedColumnName = "id_recurso", nullable = false)
    public Recurso getRecursoByIdRecurso() {
        return recursoByIdRecurso;
    }

    public void setRecursoByIdRecurso(Recurso recursoByIdRecurso) {
        this.recursoByIdRecurso = recursoByIdRecurso;
    }

    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso", nullable = false)
    public Curso getCursoByIdCurso() {
        return cursoByIdCurso;
    }

    public void setCursoByIdCurso(Curso cursoByIdCurso) {
        this.cursoByIdCurso = cursoByIdCurso;
    }
}
