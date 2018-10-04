package com.example.sp1.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Colaboracion {
    private int idColaboracion;
    private int idUsuarioCalifica;
    private int idTipoColaboracion;
    private int idEntrega;
    private int idFormulario;
    private Object respuestas;
    private double nota;
    private String comentario;
    private Usuario usuarioByIdUsuarioCalifica;
    private TipoColaboracion tipoColaboracionByIdTipoColaboracion;
    private Entrega entregaByIdEntrega;
    private Formulario formularioByIdFormulario;

    @Id
    @Column(name = "id_colaboracion", nullable = false)
    public int getIdColaboracion() {
        return idColaboracion;
    }

    public void setIdColaboracion(int idColaboracion) {
        this.idColaboracion = idColaboracion;
    }

    @Basic
    @Column(name = "id_usuario_califica", nullable = false)
    public int getIdUsuarioCalifica() {
        return idUsuarioCalifica;
    }

    public void setIdUsuarioCalifica(int idUsuarioCalifica) {
        this.idUsuarioCalifica = idUsuarioCalifica;
    }

    @Basic
    @Column(name = "id_tipo_colaboracion", nullable = false)
    public int getIdTipoColaboracion() {
        return idTipoColaboracion;
    }

    public void setIdTipoColaboracion(int idTipoColaboracion) {
        this.idTipoColaboracion = idTipoColaboracion;
    }

    @Basic
    @Column(name = "id_entrega", nullable = false)
    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    @Basic
    @Column(name = "id_formulario", nullable = false)
    public int getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }

    @Basic
    @Column(name = "respuestas", nullable = true)
    public Object getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(Object respuestas) {
        this.respuestas = respuestas;
    }

    @Basic
    @Column(name = "nota", nullable = false, precision = 2)
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Basic
    @Column(name = "comentario", nullable = true, length = 255)
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colaboracion that = (Colaboracion) o;
        return idColaboracion == that.idColaboracion &&
                idUsuarioCalifica == that.idUsuarioCalifica &&
                idTipoColaboracion == that.idTipoColaboracion &&
                idEntrega == that.idEntrega &&
                idFormulario == that.idFormulario &&
                Double.compare(that.nota, nota) == 0 &&
                Objects.equals(respuestas, that.respuestas) &&
                Objects.equals(comentario, that.comentario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idColaboracion, idUsuarioCalifica, idTipoColaboracion, idEntrega, idFormulario, respuestas, nota, comentario);
    }

    @ManyToOne
    @JoinColumn(name = "id_usuario_califica", referencedColumnName = "id", nullable = false)
    public Usuario getUsuarioByIdUsuarioCalifica() {
        return usuarioByIdUsuarioCalifica;
    }

    public void setUsuarioByIdUsuarioCalifica(Usuario usuarioByIdUsuarioCalifica) {
        this.usuarioByIdUsuarioCalifica = usuarioByIdUsuarioCalifica;
    }

    @ManyToOne
    @JoinColumn(name = "id_tipo_colaboracion", referencedColumnName = "id_tipo_colaboracion", nullable = false)
    public TipoColaboracion getTipoColaboracionByIdTipoColaboracion() {
        return tipoColaboracionByIdTipoColaboracion;
    }

    public void setTipoColaboracionByIdTipoColaboracion(TipoColaboracion tipoColaboracionByIdTipoColaboracion) {
        this.tipoColaboracionByIdTipoColaboracion = tipoColaboracionByIdTipoColaboracion;
    }

    @ManyToOne
    @JoinColumn(name = "id_entrega", referencedColumnName = "id_entrega", nullable = false)
    public Entrega getEntregaByIdEntrega() {
        return entregaByIdEntrega;
    }

    public void setEntregaByIdEntrega(Entrega entregaByIdEntrega) {
        this.entregaByIdEntrega = entregaByIdEntrega;
    }

    @ManyToOne
    @JoinColumn(name = "id_formulario", referencedColumnName = "id_formulario", nullable = false)
    public Formulario getFormularioByIdFormulario() {
        return formularioByIdFormulario;
    }

    public void setFormularioByIdFormulario(Formulario formularioByIdFormulario) {
        this.formularioByIdFormulario = formularioByIdFormulario;
    }
}
