/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aboullaite.bookstore.model;

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
 * @author jjaguilal
 */
@Entity
@Table(name = "Demobook")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Demobook.findAll", query = "SELECT d FROM Demobook d"),
    @NamedQuery(name = "Demobook.findById", query = "SELECT d FROM Demobook d WHERE d.id = :id"),
    @NamedQuery(name = "Demobook.findByName", query = "SELECT d FROM Demobook d WHERE d.name = :name")})
public class Demobook implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Column(name = "precio") /**/
    private Integer precio; /**/
    

    public Demobook() {
    }

    public Demobook(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getPrecio() {/**/
        return precio;/**/
    }/**/

    /**
     *
     * @param precio
     */
    public void setPrecio(Integer precio) {/**/
        this.precio = precio;/**/
    }/**/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Demobook)) {
            return false;
        }
        Demobook other = (Demobook) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "me.aboullaite.bookstore.Demobook[ id=" + id + " ]";
    }
    
}