/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.inter;

import java.util.List;
import org.springframework.stereotype.Component;
import com.negocio.model.Producto;
/**
 *
 * @author STM1
 */
@Component
public interface ProductosServicio {
List<Producto> listarProducto();
  Producto buscarPorCodigo(String codigo);
  List<Producto> listarPorMarca(int idMarca);
  void grabarProducto(Producto producto);
  void actualizarProducto(Producto producto);
}
