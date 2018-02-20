/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tamara
 */
@Entity
@Table(name = "tipproizvoda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipproizvoda.findAll", query = "SELECT t FROM Tipproizvoda t")
    , @NamedQuery(name = "Tipproizvoda.findByTipProizvodaID", query = "SELECT t FROM Tipproizvoda t WHERE t.tipProizvodaID = :tipProizvodaID")
    , @NamedQuery(name = "Tipproizvoda.findByNazivTipa", query = "SELECT t FROM Tipproizvoda t WHERE t.nazivTipa = :nazivTipa")})
public class Tipproizvoda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tipProizvodaID")
    private Integer tipProizvodaID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nazivTipa")
    private String nazivTipa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipproizvoda")
    private List<Svojstvo> svojstvoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipProizvodaID")
    private List<Proizvod> proizvodList;

    public Tipproizvoda() {
    }

    public Tipproizvoda(Integer tipProizvodaID) {
        this.tipProizvodaID = tipProizvodaID;
    }

    public Tipproizvoda(Integer tipProizvodaID, String nazivTipa) {
        this.tipProizvodaID = tipProizvodaID;
        this.nazivTipa = nazivTipa;
    }

    public Integer getTipProizvodaID() {
        return tipProizvodaID;
    }

    public void setTipProizvodaID(Integer tipProizvodaID) {
        this.tipProizvodaID = tipProizvodaID;
    }

    public String getNazivTipa() {
        return nazivTipa;
    }

    public void setNazivTipa(String nazivTipa) {
        this.nazivTipa = nazivTipa;
    }

    @XmlTransient
    public List<Svojstvo> getSvojstvoList() {
        return svojstvoList;
    }

    public void setSvojstvoList(List<Svojstvo> svojstvoList) {
        this.svojstvoList = svojstvoList;
    }

    @XmlTransient
    public List<Proizvod> getProizvodList() {
        return proizvodList;
    }

    public void setProizvodList(List<Proizvod> proizvodList) {
        this.proizvodList = proizvodList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipProizvodaID != null ? tipProizvodaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipproizvoda)) {
            return false;
        }
        Tipproizvoda other = (Tipproizvoda) object;
        if ((this.tipProizvodaID == null && other.tipProizvodaID != null) || (this.tipProizvodaID != null && !this.tipProizvodaID.equals(other.tipProizvodaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Tipproizvoda[ tipProizvodaID=" + tipProizvodaID + " ]";
    }
    
}
