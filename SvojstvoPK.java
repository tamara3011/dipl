/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Tamara
 */
@Embeddable
public class SvojstvoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "tipID")
    private int tipID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "svojstvoID")
    private int svojstvoID;

    public SvojstvoPK() {
    }

    public SvojstvoPK(int tipID, int svojstvoID) {
        this.tipID = tipID;
        this.svojstvoID = svojstvoID;
    }

    public int getTipID() {
        return tipID;
    }

    public void setTipID(int tipID) {
        this.tipID = tipID;
    }

    public int getSvojstvoID() {
        return svojstvoID;
    }

    public void setSvojstvoID(int svojstvoID) {
        this.svojstvoID = svojstvoID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tipID;
        hash += (int) svojstvoID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SvojstvoPK)) {
            return false;
        }
        SvojstvoPK other = (SvojstvoPK) object;
        if (this.tipID != other.tipID) {
            return false;
        }
        if (this.svojstvoID != other.svojstvoID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.SvojstvoPK[ tipID=" + tipID + ", svojstvoID=" + svojstvoID + " ]";
    }
    
}
