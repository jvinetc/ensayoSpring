/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.service;

import com.negocio.inter.UsuarioDao;
import com.negocio.inter.UsuarioServicio;
import com.negocio.model.Usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("usuarioServicio")
@Transactional
public class UsuarioServicioImpl implements UsuarioServicio{

    @Autowired(required=true)
    private UsuarioDao usuarioDao;
    @Override
    public Usuarios buscarId(int id) {
        return usuarioDao.buscarId(id);
    }

    @Override
    public Usuarios buscarPassUser(String userbame, String Pass) {
        Usuarios usuarios=usuarioDao.buscarPassUser(userbame, Pass);
        return usuarios;
    }

    @Override
    public void grabarUsuario(Usuarios usuarios) {
        usuarioDao.grabarUsuario(usuarios);
    }

    @Override
    public List<Usuarios> listarUsuarios() {
        return usuarioDao.listarUsuarios();
    }

    @Override
    public Usuarios buscarRut(String rut) {
        Usuarios us= usuarioDao.buscarRut(rut);
        return us;
    }

    @Override
    public void actualizarUsuario(int id, Usuarios usuarios) {
        usuarioDao.actualizarUsuario(id, usuarios);
    }

    @Override
    public boolean rutUnico(String rut) {
        Usuarios usuarios= buscarRut(rut);
        boolean existe= false;
        if(usuarios== null)
            existe=true;
        return existe;
    }
    
}
