/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.entity.CategoriaCliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface CategoriaClienteFacadeLocal {

    void create(CategoriaCliente categoriaCliente);

    void edit(CategoriaCliente categoriaCliente);

    void remove(CategoriaCliente categoriaCliente);

    CategoriaCliente find(Object id);

    List<CategoriaCliente> findAll();

    List<CategoriaCliente> findRange(int[] range);

    int count();
    
}
