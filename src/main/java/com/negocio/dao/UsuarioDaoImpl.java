/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.dao;

import com.negocio.abs.AbstractDao;
import com.negocio.inter.UsuarioDao;
import com.negocio.model.Usuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("usuarioDao")
public class UsuarioDaoImpl extends AbstractDao<Integer, Usuarios> implements UsuarioDao {

    @Override
    public Usuarios buscarId(int id) {
        Usuarios usuarios= getByKey(id);
        if(usuarios!= null){
            Hibernate.initialize(usuarios.getUsuId());
        }
        return usuarios;
    }

    @Override
    public Usuarios buscarPassUser(String username, String pass) {
        Criteria crit= createEntityCriteria();
        crit.add(Restrictions.and(Restrictions.eq("usuUsername", username),
                Restrictions.eq("usuPass", pass)));
        Usuarios usu= (Usuarios)crit.uniqueResult();
        if(usu!=null){
            Hibernate.initialize(usu.getUsuId());
        }
        return usu;
    }
//criteria se utiliza para consultas por criterio se inicializa en abstracdao
    @Override
    public void grabarUsuario(Usuarios usuarios) {
        persist(usuarios);
    }

    @Override
    public List<Usuarios> listarUsuarios() {
        Criteria crit= createEntityCriteria();
        crit.addOrder(Order.asc("usuApellido"));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<Usuarios> usuarios=(List<Usuarios>)crit.list();
        return usuarios;
    }

    @Override
    public Usuarios buscarRut(String rut) {
        Criteria crit=createEntityCriteria();
        crit.add(Restrictions.eq("usuRut",rut));
        Usuarios usuarios= (Usuarios)crit.uniqueResult();
        return usuarios;
    }

    @Override
    public void actualizarUsuario(int id, Usuarios usuarios) {
        
        Usuarios usu= getByKey(id);        
            persist(usu);       
    }
    
}
