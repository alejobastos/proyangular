/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.ProyectoEquipoApp.entidades;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mauro Parra
 */
@Entity
@Table(name = "jugador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugador.findAll", query = "SELECT j FROM Jugador j")
    , @NamedQuery(name = "Jugador.findByJugadorid", query = "SELECT j FROM Jugador j WHERE j.jugadorid = :jugadorid")
    , @NamedQuery(name = "Jugador.findByNombre", query = "SELECT j FROM Jugador j WHERE j.nombre = :nombre")
    , @NamedQuery(name = "Jugador.findByPosicion", query = "SELECT j FROM Jugador j WHERE j.posicion = :posicion")
    , @NamedQuery(name = "Jugador.findByCiudad", query = "SELECT j FROM Jugador j WHERE j.ciudad = :ciudad")
    , @NamedQuery(name = "Jugador.findByNumero", query = "SELECT j FROM Jugador j WHERE j.numero = :numero")})
public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "jugadorid")
    private Integer jugadorid;
    @Size(max = 10)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "posicion")
    private String posicion;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "numero")
    private String numero;

    public Jugador() {
    }

    public Jugador(Integer jugadorid) {
        this.jugadorid = jugadorid;
    }

    public Integer getJugadorid() {
        return jugadorid;
    }

    public void setJugadorid(Integer jugadorid) {
        this.jugadorid = jugadorid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jugadorid != null ? jugadorid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.jugadorid == null && other.jugadorid != null) || (this.jugadorid != null && !this.jugadorid.equals(other.jugadorid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.co.ProyectoEquipoApp.entidades.Jugador[ jugadorid=" + jugadorid + " ]";
    }
    
}
