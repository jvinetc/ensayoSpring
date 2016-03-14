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
@Table(name = "modulos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modulos.findAll", query = "SELECT m FROM Modulos m"),
    @NamedQuery(name = "Modulos.findByNombreModulos", query = "SELECT m FROM Modulos m WHERE m.nombreModulos = :nombreModulos"),
    @NamedQuery(name = "Modulos.findById", query = "SELECT m FROM Modulos m WHERE m.id = :id")})
public class Modulos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "nombre_modulos")
    private String nombreModulos;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
     @Size(max = 255)
    @Column(name = "ruta_modulos")
    private String rutaModulos;

    
    
    public Modulos() {
    }

    public Modulos(Integer id) {
        this.id = id;
    }
    public String getRutaModulos() {
        return rutaModulos;
    }

    public void setRutaModulos(String rutaModulos) {
        this.rutaModulos = rutaModulos;
    }
    public String getNombreModulos() {
        return nombreModulos;
    }

    public void setNombreModulos(String nombreModulos) {
        this.nombreModulos = nombreModulos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modulos)) {
            return false;
        }
        Modulos other = (Modulos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.negocio.model.Modulos[ id=" + id + " ]";
    }
    
}
