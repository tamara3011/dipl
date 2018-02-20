/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tamara
 */
@Entity
@Table(name = "vrednost")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vrednost.findAll", query = "SELECT v FROM Vrednost v")
    , @NamedQuery(name = "Vrednost.findByVrednostID", query = "SELECT v FROM Vrednost v WHERE v.vrednostID = :vrednostID")
    , @NamedQuery(name = "Vrednost.findByStringVrednost", query = "SELECT v FROM Vrednost v WHERE v.stringVrednost = :stringVrednost")
    , @NamedQuery(name = "Vrednost.findByIntegerVrednost", query = "SELECT v FROM Vrednost v WHERE v.integerVrednost = :integerVrednost")
    , @NamedQuery(name = "Vrednost.findByDoubleVrednost", query = "SELECT v FROM Vrednost v WHERE v.doubleVrednost = :doubleVrednost")
    , @NamedQuery(name = "Vrednost.findByBooleanVrednost", query = "SELECT v FROM Vrednost v WHERE v.booleanVrednost = :booleanVrednost")})
public class Vrednost implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vrednostID")
    private Integer vrednostID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "stringVrednost")
    private String stringVrednost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "integerVrednost")
    private int integerVrednost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "doubleVrednost")
    private double doubleVrednost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "booleanVrednost")
    private boolean booleanVrednost;
    @JoinColumn(name = "proizvodID", referencedColumnName = "proizvodID")
    @ManyToOne(optional = false)
    private Proizvod proizvod;
    @JoinColumns({
        @JoinColumn(name = "tipProizvodaID", referencedColumnName = "tipID")
        , @JoinColumn(name = "svojstvoID", referencedColumnName = "svojstvoID")})
    @ManyToOne(optional = false)
    private Svojstvo svojstvo;
    

    public Vrednost() {
        
    }

    public Vrednost(Integer vrednostID) {
        this.vrednostID = vrednostID;
    }

    public Vrednost(Integer vrednostID, String stringVrednost, int integerVrednost, double doubleVrednost, boolean booleanVrednost,Proizvod proizvod,Svojstvo svojstvo) {
        this.vrednostID = vrednostID;
        this.stringVrednost = stringVrednost;
        this.integerVrednost = integerVrednost;
        this.doubleVrednost = doubleVrednost;
        this.booleanVrednost = booleanVrednost;
        this.proizvod = proizvod;
        this.svojstvo = svojstvo;
    }

    public Integer getVrednostID() {
        return vrednostID;
    }

    public void setVrednostID(Integer vrednostID) {
        this.vrednostID = vrednostID;
    }

    public String getStringVrednost() {
        return stringVrednost;
    }

    public void setStringVrednost(String stringVrednost) {
        this.stringVrednost = stringVrednost;
    }

    public int getIntegerVrednost() {
        return integerVrednost;
    }

    public void setIntegerVrednost(int integerVrednost) {
        this.integerVrednost = integerVrednost;
    }

    public double getDoubleVrednost() {
        return doubleVrednost;
    }

    public void setDoubleVrednost(double doubleVrednost) {
        this.doubleVrednost = doubleVrednost;
    }

    public boolean getBooleanVrednost() {
        return booleanVrednost;
    }

    public void setBooleanVrednost(boolean booleanVrednost) {
        this.booleanVrednost = booleanVrednost;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public Svojstvo getSvojstvo() {
        return svojstvo;
    }

    public void setSvojstvo(Svojstvo svojstvo) {
        this.svojstvo = svojstvo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vrednostID != null ? vrednostID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vrednost)) {
            return false;
        }
        Vrednost other = (Vrednost) object;
        if ((this.vrednostID == null && other.vrednostID != null) || (this.vrednostID != null && !this.vrednostID.equals(other.vrednostID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Vrednost[ vrednostID=" + vrednostID + " ]";
    }
    
}
