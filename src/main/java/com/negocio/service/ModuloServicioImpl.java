/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.service;

import com.negocio.inter.ModuloServicio;
import com.negocio.model.Modulos;
import com.negocio.inter.ModuloDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author STM1
 */
@Service("moduloServicio")
@Transactional
public class ModuloServicioImpl implements ModuloServicio{

    @Autowired(required=true)
    private ModuloDao moduloDao;
    public List<Modulos> listarModulos() {
        return moduloDao.listarModulos();
    }
    
}
