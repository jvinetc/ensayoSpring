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
@Table(name = "det_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetVenta.findAll", query = "SELECT d FROM DetVenta d"),
    @NamedQuery(name = "DetVenta.findByDetId", query = "SELECT d FROM DetVenta d WHERE d.detId = :detId"),
    @NamedQuery(name = "DetVenta.findByDetProdCod", query = "SELECT d FROM DetVenta d WHERE d.detProdCod = :detProdCod"),
    @NamedQuery(name = "DetVenta.findByDetVentCod", query = "SELECT d FROM DetVenta d WHERE d.detVentCod = :detVentCod"),
    @NamedQuery(name = "DetVenta.findByDetCant", query = "SELECT d FROM DetVenta d WHERE d.detCant = :detCant"),
    @NamedQuery(name = "DetVenta.findByDetPrecioVenta", query = "SELECT d FROM DetVenta d WHERE d.detPrecioVenta = :detPrecioVenta"),
    @NamedQuery(name = "DetVenta.findByDetNegId", query = "SELECT d FROM DetVenta d WHERE d.detNegId = :detNegId")})
public class DetVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "det_id")
    private Integer detId;
    @Size(max = 100)
    @Column(name = "det_prod_cod")
    private String detProdCod;
    @Size(max = 100)
    @Column(name = "det_vent_cod")
    private String detVentCod;
    @Column(name = "det_cant")
    private Integer detCant;
    @Column(name = "det_precio_venta")
    private Integer detPrecioVenta;
    @Column(name = "det_neg_id")
    private Integer detNegId;

    public DetVenta() {
    }

    public DetVenta(Integer detId) {
        this.detId = detId;
    }

    public Integer getDetId() {
        return detId;
    }

    public void setDetId(Integer detId) {
        this.detId = detId;
    }

    public String getDetProdCod() {
        return detProdCod;
    }

    public void setDetProdCod(String detProdCod) {
        this.detProdCod = detProdCod;
    }

    public String getDetVentCod() {
        return detVentCod;
    }

    public void setDetVentCod(String detVentCod) {
        this.detVentCod = detVentCod;
    }

    public Integer getDetCant() {
        return detCant;
    }

    public void setDetCant(Integer detCant) {
        this.detCant = detCant;
    }

    public Integer getDetPrecioVenta() {
        return detPrecioVenta;
    }

    public void setDetPrecioVenta(Integer detPrecioVenta) {
        this.detPrecioVenta = detPrecioVenta;
    }

    public Integer getDetNegId() {
        return detNegId;
    }

    public void setDetNegId(Integer detNegId) {
        this.detNegId = detNegId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detId != null ? detId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetVenta)) {
            return false;
        }
        DetVenta other = (DetVenta) object;
        if ((this.detId == null && other.detId != null) || (this.detId != null && !this.detId.equals(other.detId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.negocio.model.DetVenta[ detId=" + detId + " ]";
    }
    
}
