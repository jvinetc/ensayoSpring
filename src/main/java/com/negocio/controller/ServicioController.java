/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.controller;

import com.negocio.inter.ProductosServicio;
import com.negocio.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@RequestMapping("/")
@SessionAttributes({"sesion"})
public class ServicioController {

    @Autowired
    ProductosServicio productoServicio;

    
    @RequestMapping(value = {"buscar/{codigo}"}, method = RequestMethod.GET, produces = "application/json")
    public Producto producto(@PathVariable String codigo) {
        return productoServicio.buscarPorCodigo(codigo);
    }

    @RequestMapping(value={"buscar/"},method = RequestMethod.GET, produces="application/json") 
    public List<Producto> listarProductos(){
        List<Producto> productos= productoServicio.listarProducto();
        return productos;
    }
}
