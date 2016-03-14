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
@Table(name = "marca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marca.findAll", query = "SELECT m FROM Marca m"),
    @NamedQuery(name = "Marca.findByMarcaId", query = "SELECT m FROM Marca m WHERE m.marcaId = :marcaId"),
    @NamedQuery(name = "Marca.findByMarcaNombre", query = "SELECT m FROM Marca m WHERE m.marcaNombre = :marcaNombre")})
public class Marca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "marca_id")
    private Integer marcaId;
    @Size(max = 45)
    @Column(name = "marca_nombre")
    private String marcaNombre;

    public Marca() {
    }

    public Marca(Integer marcaId) {
        this.marcaId = marcaId;
    }

    public Integer getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Integer marcaId) {
        this.marcaId = marcaId;
    }

    public String getMarcaNombre() {
        return marcaNombre;
    }

    public void setMarcaNombre(String marcaNombre) {
        this.marcaNombre = marcaNombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marcaId != null ? marcaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marca)) {
            return false;
        }
        Marca other = (Marca) object;
        if ((this.marcaId == null && other.marcaId != null) || (this.marcaId != null && !this.marcaId.equals(other.marcaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.negocio.model.Marca[ marcaId=" + marcaId + " ]";
    }
    
}
