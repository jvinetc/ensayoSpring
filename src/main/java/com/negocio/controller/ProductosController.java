/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.controller;

import com.negocio.inter.ModuloServicio;
import com.negocio.model.Producto;
import com.negocio.inter.ProductosServicio;
import com.negocio.model.Modulos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/")
@SessionAttributes({"sesion"})
public class ProductosController {

    @Autowired
    ProductosServicio productoServicio;
    @Autowired
    ModuloServicio moduloServicio;
    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = {"/verPrecio"}, method = RequestMethod.GET)
    public String articulos(SessionStatus status, ModelMap model) {
        String pagina = "";
        if (model.containsAttribute("sesion")) {
            //model.addAttribute("usuario","sesion");
            pagina = "vistaProductos/productos";
             Producto producto = new Producto();
            model.addAttribute("producto", producto);
        }else{
            pagina = "vistaLogin/login";
        }
        return pagina;
    }

    @RequestMapping(value = {"/volver"}, method = RequestMethod.GET)
    public String volver(SessionStatus status, ModelMap model) {
        String pagina = "";
        if (model.containsAttribute("sesion")) {
            //model.addAttribute("usuario","sesion");
            pagina = "vistaInicio/bienvenido";
           
        } else {
            pagina = "vistaLogin/login";
        }
        return pagina;
    }
    
    @RequestMapping(value = {"buscar/{codigo}"}, method = RequestMethod.GET)
    @ResponseBody
    public Producto producto(@PathVariable String codigo){
        return productoServicio.buscarPorCodigo(codigo);
    }

    @ModelAttribute("modulos")
    public List<Modulos> listaModulos() {
        return moduloServicio.listarModulos();
    }
}
