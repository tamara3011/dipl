/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tamara
 */
@Entity
@Table(name = "proizvod")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proizvod.findAll", query = "SELECT p FROM Proizvod p")
    , @NamedQuery(name = "Proizvod.findByProizvodID", query = "SELECT p FROM Proizvod p WHERE p.proizvodID = :proizvodID")
    , @NamedQuery(name = "Proizvod.findByNaziv", query = "SELECT p FROM Proizvod p WHERE p.naziv = :naziv")
    , @NamedQuery(name = "Proizvod.findByDatumUnosa", query = "SELECT p FROM Proizvod p WHERE p.datumUnosa = :datumUnosa")
    , @NamedQuery(name = "Proizvod.findByCena", query = "SELECT p FROM Proizvod p WHERE p.cena = :cena")
    , @NamedQuery(name = "Proizvod.findByBrend", query = "SELECT p FROM Proizvod p WHERE p.brend = :brend")
    , @NamedQuery(name = "Proizvod.findByPol", query = "SELECT p FROM Proizvod p WHERE p.pol = :pol")})
public class Proizvod implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "proizvodID")
    private Integer proizvodID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "naziv")
    private String naziv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datumUnosa")
    @Temporal(TemporalType.DATE)
    private Date datumUnosa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cena")
    private double cena;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "brend")
    private String brend;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "pol")
    private String pol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proizvodID")
    private List<Vrednost> vrednostList;
    @JoinColumn(name = "tipProizvodaID", referencedColumnName = "tipProizvodaID")
    @ManyToOne(optional = false)
    private Tipproizvoda tipProizvoda;

    public Proizvod() {
    }

    public Proizvod(Integer proizvodID, String naziv, Date datumUnosa, double cena, String brend, String pol, List<Vrednost> vrednostList, Tipproizvoda tipProizvoda) {
        this.proizvodID = proizvodID;
        this.naziv = naziv;
        this.datumUnosa = datumUnosa;
        this.cena = cena;
        this.brend = brend;
        this.pol = pol;
        this.vrednostList = vrednostList;
        this.tipProizvoda = tipProizvoda;
    }
    
    

    public Proizvod(Integer proizvodID) {
        this.proizvodID = proizvodID;
    }

    public Integer getProizvodID() {
        return proizvodID;
    }

    public void setProizvodID(Integer proizvodID) {
        this.proizvodID = proizvodID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumUnosa() {
        return datumUnosa;
    }

    public void setDatumUnosa(Date datumUnosa) {
        this.datumUnosa = datumUnosa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    @XmlTransient
    public List<Vrednost> getVrednostList() {
        return vrednostList;
    }

    public void setVrednostList(List<Vrednost> vrednostList) {
        this.vrednostList = vrednostList;
    }

    public Tipproizvoda getTipProizvoda() {
        return tipProizvoda;
    }

    public void setTipProizvoda(Tipproizvoda tipProizvoda) {
        this.tipProizvoda = tipProizvoda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proizvodID != null ? proizvodID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proizvod)) {
            return false;
        }
        Proizvod other = (Proizvod) object;
        if ((this.proizvodID == null && other.proizvodID != null) || (this.proizvodID != null && !this.proizvodID.equals(other.proizvodID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Proizvod[ proizvodID=" + proizvodID + " ]";
    }
    
}
