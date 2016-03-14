/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.inter;

import com.negocio.model.Usuarios;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioServicio {
    Usuarios buscarId(int id);
    Usuarios buscarPassUser(String userbame, String Pass);
    void grabarUsuario(Usuarios usuarios);
    List<Usuarios> listarUsuarios();
    Usuarios buscarRut(String rut);
    void actualizarUsuario(int id, Usuarios usuarios);
    boolean rutUnico(String rut);
}
