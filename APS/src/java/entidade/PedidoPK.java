/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Vinicius
 */
@Embeddable
public class PedidoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_usuario")
    private int idUsuario;
    @Basic(optional = false)
    @Column(name = "id_lanche")
    private int idLanche;

    public PedidoPK() {
    }

    public PedidoPK(int idUsuario, int idLanche) {
        this.idUsuario = idUsuario;
        this.idLanche = idLanche;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLanche() {
        return idLanche;
    }

    public void setIdLanche(int idLanche) {
        this.idLanche = idLanche;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUsuario;
        hash += (int) idLanche;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoPK)) {
            return false;
        }
        PedidoPK other = (PedidoPK) object;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (this.idLanche != other.idLanche) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.PedidoPK[ idUsuario=" + idUsuario + ", idLanche=" + idLanche + " ]";
    }
    
}
