/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.entity.EstadoPasajero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface EstadoPasajeroFacadeLocal {

    void create(EstadoPasajero estadoPasajero);

    void edit(EstadoPasajero estadoPasajero);

    void remove(EstadoPasajero estadoPasajero);

    EstadoPasajero find(Object id);

    List<EstadoPasajero> findAll();

    List<EstadoPasajero> findRange(int[] range);

    int count();
    
}
