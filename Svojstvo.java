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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "svojstvo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Svojstvo.findAll", query = "SELECT s FROM Svojstvo s")
    , @NamedQuery(name = "Svojstvo.findByTipID", query = "SELECT s FROM Svojstvo s WHERE s.svojstvoPK.tipID = :tipID")
    , @NamedQuery(name = "Svojstvo.findBySvojstvoID", query = "SELECT s FROM Svojstvo s WHERE s.svojstvoPK.svojstvoID = :svojstvoID")
    , @NamedQuery(name = "Svojstvo.findBySvojstvoNaziv", query = "SELECT s FROM Svojstvo s WHERE s.svojstvoNaziv = :svojstvoNaziv")
    , @NamedQuery(name = "Svojstvo.findByTipSvojstva", query = "SELECT s FROM Svojstvo s WHERE s.tipSvojstva = :tipSvojstva")})
public class Svojstvo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SvojstvoPK svojstvoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "svojstvoNaziv")
    private String svojstvoNaziv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tipSvojstva")
    private String tipSvojstva;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "svojstvo")
    private List<Vrednost> vrednostList;
    @JoinColumn(name = "tipID", referencedColumnName = "tipProizvodaID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tipproizvoda tipproizvoda;

    public Svojstvo() {
    }

    public Svojstvo(SvojstvoPK svojstvoPK) {
        this.svojstvoPK = svojstvoPK;
    }

    public Svojstvo(int tipID, int svojstvoID, String svojstvoNaziv, String tipSvojstva) {
        this.svojstvoPK  = new SvojstvoPK(tipID, svojstvoID);
        this.svojstvoNaziv = svojstvoNaziv;
        this.tipSvojstva = tipSvojstva;
    }

    public Svojstvo(int tipID, int svojstvoID) {
        this.svojstvoPK = new SvojstvoPK(tipID, svojstvoID);
    }

    public SvojstvoPK getSvojstvoPK() {
        return svojstvoPK;
    }

    public void setSvojstvoPK(SvojstvoPK svojstvoPK) {
        this.svojstvoPK = svojstvoPK;
    }

    public String getSvojstvoNaziv() {
        return svojstvoNaziv;
    }

    public void setSvojstvoNaziv(String svojstvoNaziv) {
        this.svojstvoNaziv = svojstvoNaziv;
    }

    public String getTipSvojstva() {
        return tipSvojstva;
    }

    public void setTipSvojstva(String tipSvojstva) {
        this.tipSvojstva = tipSvojstva;
    }

    @XmlTransient
    public List<Vrednost> getVrednostList() {
        return vrednostList;
    }

    public void setVrednostList(List<Vrednost> vrednostList) {
        this.vrednostList = vrednostList;
    }

    public Tipproizvoda getTipproizvoda() {
        return tipproizvoda;
    }

    public void setTipproizvoda(Tipproizvoda tipproizvoda) {
        this.tipproizvoda = tipproizvoda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (svojstvoPK != null ? svojstvoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Svojstvo)) {
            return false;
        }
        Svojstvo other = (Svojstvo) object;
        if ((this.svojstvoPK == null && other.svojstvoPK != null) || (this.svojstvoPK != null && !this.svojstvoPK.equals(other.svojstvoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Svojstvo[ svojstvoPK=" + svojstvoPK + " ]";
    }
    
}
