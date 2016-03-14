/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.dao;

import com.negocio.abs.AbstractDao;
import com.negocio.inter.ModuloDao;
import com.negocio.model.Modulos;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

/**
 *
 * @author STM1
 */
@Repository("moduloDao")
public class ModuloDaoImpl extends AbstractDao<Integer,Modulos> implements ModuloDao{

    public List<Modulos> listarModulos() {
       Criteria crit= createEntityCriteria();
       crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
       List<Modulos> modulos= (List<Modulos>) crit.list();
       return modulos;
    }
    
}
