/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.controller;

import com.negocio.inter.ModuloServicio;
import com.negocio.inter.ProductosServicio;
import com.negocio.inter.UsuarioServicio;
import com.negocio.model.Usuarios;
import com.negocio.model.Modulos;
import com.negocio.model.Producto;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Base64;
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/")
@SessionAttributes({"sesion"})
public class LoginController {
    @Autowired
    UsuarioServicio usuarioServicio;
    @Autowired
    ProductosServicio productoServicio;
    @Autowired
    MessageSource messageSource;
    @Autowired
    ModuloServicio moduloServicio;
    
    @RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
    public String loginUser(SessionStatus status,ModelMap model){
        if(model.containsAttribute("sesion")){
            status.setComplete();
            model.remove("sesion");
        }            
        Usuarios usu= new Usuarios();
        model.addAttribute("usuarios",usu);
        return "vistaLogin/login";
    }
    
    @RequestMapping(value = {"/inicioSesion"}, method = RequestMethod.POST)
    public String ejecuteLogin(@Valid @ModelAttribute("usuarios") Usuarios usuarios,ModelMap model, BindingResult result){
       
        if(result.hasErrors()){
            return "vistaLogin/login"; 
        }
        System.out.println("pass: "+Base64.getEncoder().encodeToString(usuarios.getUsuPass().getBytes()));
        Usuarios usuarios1= usuarioServicio.buscarPassUser(usuarios.getUsuUsername(),
               Base64.getEncoder().encodeToString(usuarios.getUsuPass().getBytes()));
        if(usuarios1==null){
            model.addAttribute("mensaje","usuario y pass no existe");
            return "vistaLogin/login";
        }
        //model.addAttribute("mensaje","Bienvenido "+usuarios1.getUsuDisplay()+ " su login es correcto");
        model.addAttribute("usuarioSesion",usuarios1);
        model.addAttribute("sesion",usuarios1);
        return "vistaInicio/bienvenido";
    }
    
    @ModelAttribute("modulos")
    public List<Modulos> listaModulos(){
        return moduloServicio.listarModulos();
    }
    
    @ModelAttribute("productos")
   public List<Producto> listaProductos(){
       return productoServicio.listarProducto();
   }
}
