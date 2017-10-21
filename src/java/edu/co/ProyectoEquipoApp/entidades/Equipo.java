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
@Table(name = "equipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e")
    , @NamedQuery(name = "Equipo.findByEquipoid", query = "SELECT e FROM Equipo e WHERE e.equipoid = :equipoid")
    , @NamedQuery(name = "Equipo.findByNombre", query = "SELECT e FROM Equipo e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Equipo.findByCiudad", query = "SELECT e FROM Equipo e WHERE e.ciudad = :ciudad")
    , @NamedQuery(name = "Equipo.findByCategoria", query = "SELECT e FROM Equipo e WHERE e.categoria = :categoria")
    , @NamedQuery(name = "Equipo.findByFundado", query = "SELECT e FROM Equipo e WHERE e.fundado = :fundado")})
public class Equipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "equipoid")
    private Integer equipoid;
    @Size(max = 10)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "categoria")
    private String categoria;
    @Size(max = 50)
    @Column(name = "fundado")
    private String fundado;

    public Equipo() {
    }

    public Equipo(Integer equipoid) {
        this.equipoid = equipoid;
    }

    public Integer getEquipoid() {
        return equipoid;
    }

    public void setEquipoid(Integer equipoid) {
        this.equipoid = equipoid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFundado() {
        return fundado;
    }

    public void setFundado(String fundado) {
        this.fundado = fundado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equipoid != null ? equipoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.equipoid == null && other.equipoid != null) || (this.equipoid != null && !this.equipoid.equals(other.equipoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.co.ProyectoEquipoApp.entidades.Equipo[ equipoid=" + equipoid + " ]";
    }
    
}
