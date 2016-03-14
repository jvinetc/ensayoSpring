/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.inter;

import com.negocio.model.Producto;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author STM1
 */
@Component
public interface ProductosDao {
  List<Producto> listarProducto();
  Producto buscarPorCodigo(String codigo);
  List<Producto> listarPorMarca(int idMarca);
  void grabarProducto(Producto producto);
  void actualizarProducto(Producto producto);
}
