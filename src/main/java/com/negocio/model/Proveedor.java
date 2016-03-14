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
@Table(name = "proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p"),
    @NamedQuery(name = "Proveedor.findByProvId", query = "SELECT p FROM Proveedor p WHERE p.provId = :provId"),
    @NamedQuery(name = "Proveedor.findByProvNombre", query = "SELECT p FROM Proveedor p WHERE p.provNombre = :provNombre"),
    @NamedQuery(name = "Proveedor.findByProvDescri", query = "SELECT p FROM Proveedor p WHERE p.provDescri = :provDescri"),
    @NamedQuery(name = "Proveedor.findByProvEstado", query = "SELECT p FROM Proveedor p WHERE p.provEstado = :provEstado"),
    @NamedQuery(name = "Proveedor.findByProvNegId", query = "SELECT p FROM Proveedor p WHERE p.provNegId = :provNegId")})
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prov_id")
    private Integer provId;
    @Size(max = 45)
    @Column(name = "prov_nombre")
    private String provNombre;
    @Size(max = 45)
    @Column(name = "prov_descri")
    private String provDescri;
    @Size(max = 45)
    @Column(name = "prov_estado")
    private String provEstado;
    @Column(name = "prov_neg_id")
    private Integer provNegId;

    public Proveedor() {
    }

    public Proveedor(Integer provId) {
        this.provId = provId;
    }

    public Integer getProvId() {
        return provId;
    }

    public void setProvId(Integer provId) {
        this.provId = provId;
    }

    public String getProvNombre() {
        return provNombre;
    }

    public void setProvNombre(String provNombre) {
        this.provNombre = provNombre;
    }

    public String getProvDescri() {
        return provDescri;
    }

    public void setProvDescri(String provDescri) {
        this.provDescri = provDescri;
    }

    public String getProvEstado() {
        return provEstado;
    }

    public void setProvEstado(String provEstado) {
        this.provEstado = provEstado;
    }

    public Integer getProvNegId() {
        return provNegId;
    }

    public void setProvNegId(Integer provNegId) {
        this.provNegId = provNegId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (provId != null ? provId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.provId == null && other.provId != null) || (this.provId != null && !this.provId.equals(other.provId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.negocio.model.Proveedor[ provId=" + provId + " ]";
    }
    
}
