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
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByProdId", query = "SELECT p FROM Producto p WHERE p.prodId = :prodId"),
    @NamedQuery(name = "Producto.findByProdNombre", query = "SELECT p FROM Producto p WHERE p.prodNombre = :prodNombre"),
    @NamedQuery(name = "Producto.findByProdDescri", query = "SELECT p FROM Producto p WHERE p.prodDescri = :prodDescri"),
    @NamedQuery(name = "Producto.findByProdPrecio", query = "SELECT p FROM Producto p WHERE p.prodPrecio = :prodPrecio"),
    @NamedQuery(name = "Producto.findByProdStock", query = "SELECT p FROM Producto p WHERE p.prodStock = :prodStock"),
    @NamedQuery(name = "Producto.findByProdCod", query = "SELECT p FROM Producto p WHERE p.prodCod = :prodCod"),
    @NamedQuery(name = "Producto.findByProdProvId", query = "SELECT p FROM Producto p WHERE p.prodProvId = :prodProvId"),
    @NamedQuery(name = "Producto.findByProdEstado", query = "SELECT p FROM Producto p WHERE p.prodEstado = :prodEstado"),
    @NamedQuery(name = "Producto.findByProdMarcaId", query = "SELECT p FROM Producto p WHERE p.prodMarcaId = :prodMarcaId"),
    @NamedQuery(name = "Producto.findByProdCosto", query = "SELECT p FROM Producto p WHERE p.prodCosto = :prodCosto"),
    @NamedQuery(name = "Producto.findByProdNegId", query = "SELECT p FROM Producto p WHERE p.prodNegId = :prodNegId")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prod_id")
    private Integer prodId;
    @Size(max = 45)
    @Column(name = "prod_nombre")
    private String prodNombre;
    @Size(max = 45)
    @Column(name = "prod_descri")
    private String prodDescri;
    @Column(name = "prod_precio")
    private Integer prodPrecio;
    @Column(name = "prod_stock")
    private Integer prodStock;
    @Size(max = 100)
    @Column(name = "prod_cod")
    private String prodCod;
    @Column(name = "prod_prov_id")
    private Integer prodProvId;
    @Size(max = 45)
    @Column(name = "prod_estado")
    private String prodEstado;
    @Column(name = "prod_marca_id")
    private Integer prodMarcaId;
    @Column(name = "prod_costo")
    private Integer prodCosto;
    @Column(name = "prod_neg_id")
    private Integer prodNegId;

    public Producto() {
    }

    public Producto(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdNombre() {
        return prodNombre;
    }

    public void setProdNombre(String prodNombre) {
        this.prodNombre = prodNombre;
    }

    public String getProdDescri() {
        return prodDescri;
    }

    public void setProdDescri(String prodDescri) {
        this.prodDescri = prodDescri;
    }

    public Integer getProdPrecio() {
        return prodPrecio;
    }

    public void setProdPrecio(Integer prodPrecio) {
        this.prodPrecio = prodPrecio;
    }

    public Integer getProdStock() {
        return prodStock;
    }

    public void setProdStock(Integer prodStock) {
        this.prodStock = prodStock;
    }

    public String getProdCod() {
        return prodCod;
    }

    public void setProdCod(String prodCod) {
        this.prodCod = prodCod;
    }

    public Integer getProdProvId() {
        return prodProvId;
    }

    public void setProdProvId(Integer prodProvId) {
        this.prodProvId = prodProvId;
    }

    public String getProdEstado() {
        return prodEstado;
    }

    public void setProdEstado(String prodEstado) {
        this.prodEstado = prodEstado;
    }

    public Integer getProdMarcaId() {
        return prodMarcaId;
    }

    public void setProdMarcaId(Integer prodMarcaId) {
        this.prodMarcaId = prodMarcaId;
    }

    public Integer getProdCosto() {
        return prodCosto;
    }

    public void setProdCosto(Integer prodCosto) {
        this.prodCosto = prodCosto;
    }

    public Integer getProdNegId() {
        return prodNegId;
    }

    public void setProdNegId(Integer prodNegId) {
        this.prodNegId = prodNegId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodId != null ? prodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.prodId == null && other.prodId != null) || (this.prodId != null && !this.prodId.equals(other.prodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.negocio.model.Producto[ prodId=" + prodId + " ]";
    }
    
}
