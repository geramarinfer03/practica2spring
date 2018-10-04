package com.example.sp1.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Curso {
    private int idCurso;
    private String nombre;
    private int duracion;
    private Timestamp fechaInicio;
    private Timestamp fechaFinal;
    private int estado;
    private double evaluado;
    private Integer creadoPdf;
    private Collection<Matricula> matriculasByIdCurso;
    private Collection<Semana> semanasByIdCurso;
    private Collection<Tarea> tareasByIdCurso;

    @Id
    @Column(name = "id_curso", nullable = false)
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
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
    @Column(name = "duracion", nullable = false)
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Basic
    @Column(name = "fecha_inicio", nullable = false)
    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "fecha_final", nullable = false)
    public Timestamp getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Timestamp fechaFinal) {
        this.fechaFinal = fechaFinal;
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
    @Column(name = "evaluado", nullable = false, precision = 2)
    public double getEvaluado() {
        return evaluado;
    }

    public void setEvaluado(double evaluado) {
        this.evaluado = evaluado;
    }

    @Basic
    @Column(name = "creadoPDF", nullable = true)
    public Integer getCreadoPdf() {
        return creadoPdf;
    }

    public void setCreadoPdf(Integer creadoPdf) {
        this.creadoPdf = creadoPdf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return idCurso == curso.idCurso &&
                duracion == curso.duracion &&
                estado == curso.estado &&
                Double.compare(curso.evaluado, evaluado) == 0 &&
                Objects.equals(nombre, curso.nombre) &&
                Objects.equals(fechaInicio, curso.fechaInicio) &&
                Objects.equals(fechaFinal, curso.fechaFinal) &&
                Objects.equals(creadoPdf, curso.creadoPdf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurso, nombre, duracion, fechaInicio, fechaFinal, estado, evaluado, creadoPdf);
    }

    @OneToMany(mappedBy = "cursoByCurso")
    public Collection<Matricula> getMatriculasByIdCurso() {
        return matriculasByIdCurso;
    }

    public void setMatriculasByIdCurso(Collection<Matricula> matriculasByIdCurso) {
        this.matriculasByIdCurso = matriculasByIdCurso;
    }

    @OneToMany(mappedBy = "cursoByCurso")
    public Collection<Semana> getSemanasByIdCurso() {
        return semanasByIdCurso;
    }

    public void setSemanasByIdCurso(Collection<Semana> semanasByIdCurso) {
        this.semanasByIdCurso = semanasByIdCurso;
    }

    @OneToMany(mappedBy = "cursoByIdCurso")
    public Collection<Tarea> getTareasByIdCurso() {
        return tareasByIdCurso;
    }

    public void setTareasByIdCurso(Collection<Tarea> tareasByIdCurso) {
        this.tareasByIdCurso = tareasByIdCurso;
    }
}
