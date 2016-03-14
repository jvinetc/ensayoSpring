/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author STM1
 */
@Entity
@Table(name = "contactos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contactos.findAll", query = "SELECT c FROM Contactos c"),
    @NamedQuery(name = "Contactos.findByContId", query = "SELECT c FROM Contactos c WHERE c.contId = :contId"),
    @NamedQuery(name = "Contactos.findByContEmail", query = "SELECT c FROM Contactos c WHERE c.contEmail = :contEmail"),
    @NamedQuery(name = "Contactos.findByContMovil", query = "SELECT c FROM Contactos c WHERE c.contMovil = :contMovil"),
    @NamedQuery(name = "Contactos.findByContFijo", query = "SELECT c FROM Contactos c WHERE c.contFijo = :contFijo"),
    @NamedQuery(name = "Contactos.findByContFaceboock", query = "SELECT c FROM Contactos c WHERE c.contFaceboock = :contFaceboock"),
    @NamedQuery(name = "Contactos.findByContGoogleplus", query = "SELECT c FROM Contactos c WHERE c.contGoogleplus = :contGoogleplus"),
    @NamedQuery(name = "Contactos.findByContTwiter", query = "SELECT c FROM Contactos c WHERE c.contTwiter = :contTwiter"),
    @NamedQuery(name = "Contactos.findByContDireccion", query = "SELECT c FROM Contactos c WHERE c.contDireccion = :contDireccion"),
    @NamedQuery(name = "Contactos.findByContMovil2", query = "SELECT c FROM Contactos c WHERE c.contMovil2 = :contMovil2"),
    @NamedQuery(name = "Contactos.findByContFijo2", query = "SELECT c FROM Contactos c WHERE c.contFijo2 = :contFijo2"),
    @NamedQuery(name = "Contactos.findByContProvId", query = "SELECT c FROM Contactos c WHERE c.contProvId = :contProvId"),
    @NamedQuery(name = "Contactos.findByContUsuId", query = "SELECT c FROM Contactos c WHERE c.contUsuId = :contUsuId"),
    @NamedQuery(name = "Contactos.findByContEstado", query = "SELECT c FROM Contactos c WHERE c.contEstado = :contEstado")})
public class Contactos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cont_id")
    private Integer contId;
    @Size(max = 45)
    @Column(name = "cont_email")
    private String contEmail;
    @Size(max = 45)
    @Column(name = "cont_movil")
    private String contMovil;
    @Size(max = 45)
    @Column(name = "cont_fijo")
    private String contFijo;
    @Size(max = 45)
    @Column(name = "cont_faceboock")
    private String contFaceboock;
    @Size(max = 45)
    @Column(name = "cont_googleplus")
    private String contGoogleplus;
    @Size(max = 45)
    @Column(name = "cont_twiter")
    private String contTwiter;
    @Size(max = 45)
    @Column(name = "cont_direccion")
    private String contDireccion;
    @Size(max = 45)
    @Column(name = "cont_movil2")
    private String contMovil2;
    @Size(max = 45)
    @Column(name = "cont_fijo2")
    private String contFijo2;
    @Column(name = "cont_prov_id")
    private Integer contProvId;
    @Column(name = "cont_usu_id")
    private Integer contUsuId;
    @Size(max = 45)
    @Column(name = "cont_estado")
    private String contEstado;

    public Contactos() {
    }

    public Contactos(Integer contId) {
        this.contId = contId;
    }

    public Integer getContId() {
        return contId;
    }

    public void setContId(Integer contId) {
        this.contId = contId;
    }

    public String getContEmail() {
        return contEmail;
    }

    public void setContEmail(String contEmail) {
        this.contEmail = contEmail;
    }

    public String getContMovil() {
        return contMovil;
    }

    public void setContMovil(String contMovil) {
        this.contMovil = contMovil;
    }

    public String getContFijo() {
        return contFijo;
    }

    public void setContFijo(String contFijo) {
        this.contFijo = contFijo;
    }

    public String getContFaceboock() {
        return contFaceboock;
    }

    public void setContFaceboock(String contFaceboock) {
        this.contFaceboock = contFaceboock;
    }

    public String getContGoogleplus() {
        return contGoogleplus;
    }

    public void setContGoogleplus(String contGoogleplus) {
        this.contGoogleplus = contGoogleplus;
    }

    public String getContTwiter() {
        return contTwiter;
    }

    public void setContTwiter(String contTwiter) {
        this.contTwiter = contTwiter;
    }

    public String getContDireccion() {
        return contDireccion;
    }

    public void setContDireccion(String contDireccion) {
        this.contDireccion = contDireccion;
    }

    public String getContMovil2() {
        return contMovil2;
    }

    public void setContMovil2(String contMovil2) {
        this.contMovil2 = contMovil2;
    }

    public String getContFijo2() {
        return contFijo2;
    }

    public void setContFijo2(String contFijo2) {
        this.contFijo2 = contFijo2;
    }

    public Integer getContProvId() {
        return contProvId;
    }

    public void setContProvId(Integer contProvId) {
        this.contProvId = contProvId;
    }

    public Integer getContUsuId() {
        return contUsuId;
    }

    public void setContUsuId(Integer contUsuId) {
        this.contUsuId = contUsuId;
    }

    public String getContEstado() {
        return contEstado;
    }

    public void setContEstado(String contEstado) {
        this.contEstado = contEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contId != null ? contId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contactos)) {
            return false;
        }
        Contactos other = (Contactos) object;
        if ((this.contId == null && other.contId != null) || (this.contId != null && !this.contId.equals(other.contId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.negocio.model.Contactos[ contId=" + contId + " ]";
    }
    
}
