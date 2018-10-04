package com.example.sp1.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String password;
    private int idRol;
    private String genero;
    private String pais;
    private Timestamp fechaUltimoIngreso;
    private String ip;
    private String os;
    private String navegador;
    private String lenguaje;
    private String rememberToken;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<Colaboracion> colaboracionsById;
    private Collection<Entrega> entregasById;
    private Collection<Matricula> matriculasById;
    private Rol rolByIdRol;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 250)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 250)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 60)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "id_rol", nullable = false)
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "genero", nullable = false, length = 10)
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Basic
    @Column(name = "pais", nullable = false, length = 100)
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Basic
    @Column(name = "fecha_ultimo_ingreso", nullable = false)
    public Timestamp getFechaUltimoIngreso() {
        return fechaUltimoIngreso;
    }

    public void setFechaUltimoIngreso(Timestamp fechaUltimoIngreso) {
        this.fechaUltimoIngreso = fechaUltimoIngreso;
    }

    @Basic
    @Column(name = "ip", nullable = false, length = 12)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "os", nullable = false, length = 10)
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Basic
    @Column(name = "navegador", nullable = false, length = 20)
    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    @Basic
    @Column(name = "lenguaje", nullable = true, length = 10)
    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Basic
    @Column(name = "remember_token", nullable = true, length = 100)
    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    @Basic
    @Column(name = "created_at", nullable = false)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = false)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id &&
                idRol == usuario.idRol &&
                Objects.equals(nombre, usuario.nombre) &&
                Objects.equals(email, usuario.email) &&
                Objects.equals(password, usuario.password) &&
                Objects.equals(genero, usuario.genero) &&
                Objects.equals(pais, usuario.pais) &&
                Objects.equals(fechaUltimoIngreso, usuario.fechaUltimoIngreso) &&
                Objects.equals(ip, usuario.ip) &&
                Objects.equals(os, usuario.os) &&
                Objects.equals(navegador, usuario.navegador) &&
                Objects.equals(lenguaje, usuario.lenguaje) &&
                Objects.equals(rememberToken, usuario.rememberToken) &&
                Objects.equals(createdAt, usuario.createdAt) &&
                Objects.equals(updatedAt, usuario.updatedAt);
    }

    public Usuario() {
    }

    public Usuario(int id, String nombre, String email, String password, int idRol, String genero, String pais,
                   Timestamp fechaUltimoIngreso, String ip, String os, String navegador, String lenguaje,
                   String rememberToken, Timestamp createdAt, Timestamp updatedAt,
                   Collection<Colaboracion> colaboracionsById, Collection<Entrega> entregasById,
                   Collection<Matricula> matriculasById, Rol rolByIdRol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.idRol = idRol;
        this.genero = genero;
        this.pais = pais;
        this.fechaUltimoIngreso = fechaUltimoIngreso;
        this.ip = ip;
        this.os = os;
        this.navegador = navegador;
        this.lenguaje = lenguaje;
        this.rememberToken = rememberToken;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.colaboracionsById = colaboracionsById;
        this.entregasById = entregasById;
        this.matriculasById = matriculasById;
        this.rolByIdRol = rolByIdRol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, email, password, idRol, genero, pais, fechaUltimoIngreso, ip, os, navegador, lenguaje, rememberToken, createdAt, updatedAt);
    }

    @OneToMany(mappedBy = "usuarioByIdUsuarioCalifica", fetch = FetchType.LAZY)
    public Collection<Colaboracion> getColaboracionsById() {
        return colaboracionsById;
    }

    public void setColaboracionsById(Collection<Colaboracion> colaboracionsById) {
        this.colaboracionsById = colaboracionsById;
    }

    @OneToMany(mappedBy = "usuarioByIdUsuario", fetch = FetchType.LAZY)
    public Collection<Entrega> getEntregasById() {
        return entregasById;
    }

    public void setEntregasById(Collection<Entrega> entregasById) {
        this.entregasById = entregasById;
    }

    @OneToMany(mappedBy = "usuarioByUsuario", fetch = FetchType.LAZY)
    public Collection<Matricula> getMatriculasById() {
        return matriculasById;
    }

    public void setMatriculasById(Collection<Matricula> matriculasById) {
        this.matriculasById = matriculasById;
    }

    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol", nullable = false)
    public Rol getRolByIdRol() {
        return rolByIdRol;
    }

    public void setRolByIdRol(Rol rolByIdRol) {
        this.rolByIdRol = rolByIdRol;
    }
}
