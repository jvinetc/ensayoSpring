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
@Table(name = "negocio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Negocio.findAll", query = "SELECT n FROM Negocio n"),
    @NamedQuery(name = "Negocio.findByNegId", query = "SELECT n FROM Negocio n WHERE n.negId = :negId"),
    @NamedQuery(name = "Negocio.findByNegNombre", query = "SELECT n FROM Negocio n WHERE n.negNombre = :negNombre")})
public class Negocio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "neg_id")
    private Integer negId;
    @Size(max = 45)
    @Column(name = "neg_nombre")
    private String negNombre;

    public Negocio() {
    }

    public Negocio(Integer negId) {
        this.negId = negId;
    }

    public Integer getNegId() {
        return negId;
    }

    public void setNegId(Integer negId) {
        this.negId = negId;
    }

    public String getNegNombre() {
        return negNombre;
    }

    public void setNegNombre(String negNombre) {
        this.negNombre = negNombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (negId != null ? negId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Negocio)) {
            return false;
        }
        Negocio other = (Negocio) object;
        if ((this.negId == null && other.negId != null) || (this.negId != null && !this.negId.equals(other.negId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.negocio.model.Negocio[ negId=" + negId + " ]";
    }
    
}
