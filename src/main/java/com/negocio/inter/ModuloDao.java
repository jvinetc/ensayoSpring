/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.inter;

import java.util.List;
import com.negocio.model.Modulos;
import org.springframework.stereotype.Component;
/**
 *
 * @author STM1
 */
@Component
public interface ModuloDao {
    List<Modulos> listarModulos();
}
