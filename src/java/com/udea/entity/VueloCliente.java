/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FRANKLIN
 */
@Entity
@Table(name = "vuelo_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VueloCliente.findAll", query = "SELECT v FROM VueloCliente v")
    , @NamedQuery(name = "VueloCliente.findById", query = "SELECT v FROM VueloCliente v WHERE v.id = :id")
    , @NamedQuery(name = "VueloCliente.findByIdPasajero", query = "SELECT v FROM VueloCliente v WHERE v.idPasajero = :idPasajero")
    , @NamedQuery(name = "VueloCliente.findByIdVuelo", query = "SELECT v FROM VueloCliente v WHERE v.idVuelo = :idVuelo")
    , @NamedQuery(name = "VueloCliente.findByIdEstado", query = "SELECT v FROM VueloCliente v WHERE v.idEstado = :idEstado")
    , @NamedQuery(name = "VueloCliente.findByEstado", query = "SELECT v FROM VueloCliente v WHERE v.estado = :estado")
    , @NamedQuery(name = "VueloCliente.findBySilla", query = "SELECT v FROM VueloCliente v WHERE v.silla = :silla")})
public class VueloCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "idPasajero")
    private Integer idPasajero;
    @Column(name = "idVuelo")
    private Integer idVuelo;
    @Column(name = "idEstado")
    private Integer idEstado;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "silla")
    private Integer silla;

    public VueloCliente() {
    }

    public VueloCliente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(Integer idPasajero) {
        this.idPasajero = idPasajero;
    }

    public Integer getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(Integer idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getSilla() {
        return silla;
    }

    public void setSilla(Integer silla) {
        this.silla = silla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VueloCliente)) {
            return false;
        }
        VueloCliente other = (VueloCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.VueloCliente[ id=" + id + " ]";
    }
    
}
