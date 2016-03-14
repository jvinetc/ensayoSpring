/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.dao;

import com.negocio.abs.AbstractDao;
import com.negocio.inter.ProductosDao;
import com.negocio.model.Producto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author STM1
 */
@Repository("productosDao")
public class ProductosDaoImpl extends AbstractDao<Integer,Producto> implements ProductosDao{

    public List<Producto> listarProducto() {
        Criteria crit= createEntityCriteria();
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<Producto> productos=(List<Producto>)crit.list();
        return productos;
    }

    public Producto buscarPorCodigo(String codigo) {
        Criteria crit= createEntityCriteria();
        crit.add(Restrictions.eq("prodCod",codigo));
        Producto producto= (Producto)crit.uniqueResult();
        if(producto!= null){
            Hibernate.initialize(producto.getProdId());
        }
        return producto;
    }

    public List<Producto> listarPorMarca(int idMarca) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("prodMarcaId", idMarca));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<Producto> productos= (List<Producto>)crit.list();
        return productos;
    }

    public void grabarProducto(Producto producto) {
        persist(producto);
    }

    public void actualizarProducto(Producto producto) {
        getSession().update(producto);
        
    }

   
}
