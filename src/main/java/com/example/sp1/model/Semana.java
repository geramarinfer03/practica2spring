package com.example.sp1.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Semana {
    private int idSemana;
    private String tema;
    private int visible;
    private int estado;
    private int curso;
    private int secuencia;
    private Collection<Recurso> recursosByIdSemana;
    private Curso cursoByCurso;

    @Id
    @Column(name = "id_semana", nullable = false)
    public int getIdSemana() {
        return idSemana;
    }

    public void setIdSemana(int idSemana) {
        this.idSemana = idSemana;
    }

    @Basic
    @Column(name = "tema", nullable = false, length = 30)
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Basic
    @Column(name = "visible", nullable = false)
    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
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
    @Column(name = "curso", nullable = false)
    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Basic
    @Column(name = "secuencia", nullable = false)
    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Semana semana = (Semana) o;
        return idSemana == semana.idSemana &&
                visible == semana.visible &&
                estado == semana.estado &&
                curso == semana.curso &&
                secuencia == semana.secuencia &&
                Objects.equals(tema, semana.tema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSemana, tema, visible, estado, curso, secuencia);
    }

    @OneToMany(mappedBy = "semanaBySemana")
    public Collection<Recurso> getRecursosByIdSemana() {
        return recursosByIdSemana;
    }

    public void setRecursosByIdSemana(Collection<Recurso> recursosByIdSemana) {
        this.recursosByIdSemana = recursosByIdSemana;
    }

    @ManyToOne
    @JoinColumn(name = "curso", referencedColumnName = "id_curso", nullable = false)
    public Curso getCursoByCurso() {
        return cursoByCurso;
    }

    public void setCursoByCurso(Curso cursoByCurso) {
        this.cursoByCurso = cursoByCurso;
    }
}
