/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.service;

import com.negocio.inter.ProductosDao;
import com.negocio.inter.ProductosServicio;
import com.negocio.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author STM1
 */
@Service("productosServicios")
@Transactional
public class ProductosServiciosImpl implements ProductosServicio{

    @Autowired(required = true)
    ProductosDao productosDao;
    
    public List<Producto> listarProducto() {
        return productosDao.listarProducto();
    }

    public Producto buscarPorCodigo(String codigo) {
        return productosDao.buscarPorCodigo(codigo);
    }

    public List<Producto> listarPorMarca(int idMarca) {
        return productosDao.listarPorMarca(idMarca);
    }

    public void grabarProducto(Producto producto) {
        productosDao.grabarProducto(producto);
    }

    public void actualizarProducto(Producto producto) {
        productosDao.actualizarProducto(producto);
    }
    
}
