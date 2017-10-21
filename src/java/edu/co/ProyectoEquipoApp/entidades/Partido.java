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
@Table(name = "partido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partido.findAll", query = "SELECT p FROM Partido p")
    , @NamedQuery(name = "Partido.findByPartidoid", query = "SELECT p FROM Partido p WHERE p.partidoid = :partidoid")
    , @NamedQuery(name = "Partido.findByEstadio", query = "SELECT p FROM Partido p WHERE p.estadio = :estadio")
    , @NamedQuery(name = "Partido.findByFecha", query = "SELECT p FROM Partido p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Partido.findByHora", query = "SELECT p FROM Partido p WHERE p.hora = :hora")})
public class Partido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "partidoid")
    private Integer partidoid;
    @Size(max = 10)
    @Column(name = "estadio")
    private String estadio;
    @Size(max = 50)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 50)
    @Column(name = "hora")
    private String hora;

    public Partido() {
    }

    public Partido(Integer partidoid) {
        this.partidoid = partidoid;
    }

    public Integer getPartidoid() {
        return partidoid;
    }

    public void setPartidoid(Integer partidoid) {
        this.partidoid = partidoid;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partidoid != null ? partidoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partido)) {
            return false;
        }
        Partido other = (Partido) object;
        if ((this.partidoid == null && other.partidoid != null) || (this.partidoid != null && !this.partidoid.equals(other.partidoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.co.ProyectoEquipoApp.entidades.Partido[ partidoid=" + partidoid + " ]";
    }
    
}
