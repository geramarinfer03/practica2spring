package com.example.sp1.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Entrega {
    private int idEntrega;
    private int idTarea;
    private int idUsuario;
    private int idMatricula;
    private String url;
    private double nota;
    private Collection<Colaboracion> colaboracionsByIdEntrega;
    private Tarea tareaByIdTarea;
    private Usuario usuarioByIdUsuario;
    private Matricula matriculaByIdMatricula;

    @Id
    @Column(name = "id_entrega", nullable = false)
    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
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
    @Column(name = "id_usuario", nullable = false)
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "id_matricula", nullable = false)
    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    @Basic
    @Column(name = "url", nullable = false, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "nota", nullable = false, precision = 2)
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrega entrega = (Entrega) o;
        return idEntrega == entrega.idEntrega &&
                idTarea == entrega.idTarea &&
                idUsuario == entrega.idUsuario &&
                idMatricula == entrega.idMatricula &&
                Double.compare(entrega.nota, nota) == 0 &&
                Objects.equals(url, entrega.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEntrega, idTarea, idUsuario, idMatricula, url, nota);
    }

    @OneToMany(mappedBy = "entregaByIdEntrega")
    public Collection<Colaboracion> getColaboracionsByIdEntrega() {
        return colaboracionsByIdEntrega;
    }

    public void setColaboracionsByIdEntrega(Collection<Colaboracion> colaboracionsByIdEntrega) {
        this.colaboracionsByIdEntrega = colaboracionsByIdEntrega;
    }

    @ManyToOne
    @JoinColumn(name = "id_tarea", referencedColumnName = "id_tarea", nullable = false)
    public Tarea getTareaByIdTarea() {
        return tareaByIdTarea;
    }

    public void setTareaByIdTarea(Tarea tareaByIdTarea) {
        this.tareaByIdTarea = tareaByIdTarea;
    }

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id", nullable = false)
    public Usuario getUsuarioByIdUsuario() {
        return usuarioByIdUsuario;
    }

    public void setUsuarioByIdUsuario(Usuario usuarioByIdUsuario) {
        this.usuarioByIdUsuario = usuarioByIdUsuario;
    }

    @ManyToOne
    @JoinColumn(name = "id_matricula", referencedColumnName = "id_matricula", nullable = false)
    public Matricula getMatriculaByIdMatricula() {
        return matriculaByIdMatricula;
    }

    public void setMatriculaByIdMatricula(Matricula matriculaByIdMatricula) {
        this.matriculaByIdMatricula = matriculaByIdMatricula;
    }
}
