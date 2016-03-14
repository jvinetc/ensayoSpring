/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.model;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * @author STM1
 */
@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "usu_id")
    private Integer usuId;
    @Size(max = 45)
    @Column(name = "usu_nombre")
    private String usuNombre;
    @Size(max = 45)
    @Column(name = "usu_apellido")
    private String usuApellido;
    @Size(max = 45)
    @Column(name = "usu_rut")
    private String usuRut;
    @Column(name = "usu_id_rol")
    private Integer usuIdRol;
    @Size(max = 45)
    @Column(name = "usu_estado")
    private String usuEstado;
    @Size(max = 45)
    @Column(name = "usu_direccion")
    private String usuDireccion;
    
    @NotNull
    @Size(max = 45)
    @Column(name = "usu_username")
    private String usuUsername;
    
    @NotNull
    @Size(max = 45)
    @Column(name = "usu_pass")
    private String usuPass;
    @Size(max = 45)
    @Column(name = "usu_mail")
    private String usuMail;
    @Size(max = 45)
    @Column(name = "usu_display")
    private String usuDisplay;
    @Column(name = "usu_neg_id")
    private Integer usuNegId;

    public Usuarios() {
    }

    public Usuarios(Integer usuId) {
        this.usuId = usuId;
    }

    public Integer getUsuId() {
        return usuId;
    }

    public void setUsuId(Integer usuId) {
        this.usuId = usuId;
    }

    public String getUsuNombre() {
        return usuNombre;
    }

    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }

    public String getUsuApellido() {
        return usuApellido;
    }

    public void setUsuApellido(String usuApellido) {
        this.usuApellido = usuApellido;
    }

    public String getUsuRut() {
        return usuRut;
    }

    public void setUsuRut(String usuRut) {
        this.usuRut = usuRut;
    }

    public Integer getUsuIdRol() {
        return usuIdRol;
    }

    public void setUsuIdRol(Integer usuIdRol) {
        this.usuIdRol = usuIdRol;
    }

    public String getUsuEstado() {
        return usuEstado;
    }

    public void setUsuEstado(String usuEstado) {
        this.usuEstado = usuEstado;
    }

    public String getUsuDireccion() {
        return usuDireccion;
    }

    public void setUsuDireccion(String usuDireccion) {
        this.usuDireccion = usuDireccion;
    }

    public String getUsuUsername() {
        return usuUsername;
    }

    public void setUsuUsername(String usuUsername) {
        this.usuUsername = usuUsername;
    }

    public String getUsuPass() {
        return usuPass;
    }

    public void setUsuPass(String usuPass) {
        this.usuPass = usuPass;
    }

    public String getUsuMail() {
        return usuMail;
    }

    public void setUsuMail(String usuMail) {
        this.usuMail = usuMail;
    }

    public String getUsuDisplay() {
        return usuDisplay;
    }

    public void setUsuDisplay(String usuDisplay) {
        this.usuDisplay = usuDisplay;
    }

    public Integer getUsuNegId() {
        return usuNegId;
    }

    public void setUsuNegId(Integer usuNegId) {
        this.usuNegId = usuNegId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuId != null ? usuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.usuId == null && other.usuId != null) || (this.usuId != null && !this.usuId.equals(other.usuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.negocio.model.Usuarios[ usuId=" + usuId + " ]";
    }
    
}
