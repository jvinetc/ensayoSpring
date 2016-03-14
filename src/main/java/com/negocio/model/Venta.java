/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author STM1
 */
@Entity
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v"),
    @NamedQuery(name = "Venta.findByVentCod", query = "SELECT v FROM Venta v WHERE v.ventCod = :ventCod"),
    @NamedQuery(name = "Venta.findByVentUsuId", query = "SELECT v FROM Venta v WHERE v.ventUsuId = :ventUsuId"),
    @NamedQuery(name = "Venta.findByVentFecha", query = "SELECT v FROM Venta v WHERE v.ventFecha = :ventFecha"),
    @NamedQuery(name = "Venta.findByVentTotal", query = "SELECT v FROM Venta v WHERE v.ventTotal = :ventTotal"),
    @NamedQuery(name = "Venta.findByVentNegId", query = "SELECT v FROM Venta v WHERE v.ventNegId = :ventNegId")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "vent_cod")
    private String ventCod;
    @Column(name = "vent_usu_id")
    private Integer ventUsuId;
    @Column(name = "vent_fecha")
    @Temporal(TemporalType.DATE)
    private Date ventFecha;
    @Column(name = "vent_total")
    private Integer ventTotal;
    @Column(name = "vent_neg_id")
    private Integer ventNegId;

    public Venta() {
    }

    public Venta(String ventCod) {
        this.ventCod = ventCod;
    }

    public String getVentCod() {
        return ventCod;
    }

    public void setVentCod(String ventCod) {
        this.ventCod = ventCod;
    }

    public Integer getVentUsuId() {
        return ventUsuId;
    }

    public void setVentUsuId(Integer ventUsuId) {
        this.ventUsuId = ventUsuId;
    }

    public Date getVentFecha() {
        return ventFecha;
    }

    public void setVentFecha(Date ventFecha) {
        this.ventFecha = ventFecha;
    }

    public Integer getVentTotal() {
        return ventTotal;
    }

    public void setVentTotal(Integer ventTotal) {
        this.ventTotal = ventTotal;
    }

    public Integer getVentNegId() {
        return ventNegId;
    }

    public void setVentNegId(Integer ventNegId) {
        this.ventNegId = ventNegId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ventCod != null ? ventCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.ventCod == null && other.ventCod != null) || (this.ventCod != null && !this.ventCod.equals(other.ventCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.negocio.model.Venta[ ventCod=" + ventCod + " ]";
    }
    
}
