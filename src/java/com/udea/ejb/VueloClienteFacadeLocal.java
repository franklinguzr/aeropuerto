/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.entity.VueloCliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface VueloClienteFacadeLocal {

    void create(VueloCliente vueloCliente);

    void edit(VueloCliente vueloCliente);

    void remove(VueloCliente vueloCliente);

    VueloCliente find(Object id);

    List<VueloCliente> findAll();

    List<VueloCliente> findRange(int[] range);

    int count();
    
}
