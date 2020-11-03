/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "lanche")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lanche.findAll", query = "SELECT l FROM Lanche l")
    , @NamedQuery(name = "Lanche.findByIdLanche", query = "SELECT l FROM Lanche l WHERE l.idLanche = :idLanche")})
public class Lanche implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lanche")
    private Collection<Pedido> pedidoCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lanche")
    private Integer idLanche;
    @JoinColumn(name = "id_carne", referencedColumnName = "id_ingredientes")
    @ManyToOne(optional = false)
    private Ingredientes idCarne;
    @JoinColumn(name = "id_molho", referencedColumnName = "id_ingredientes")
    @ManyToOne
    private Ingredientes idMolho;
    @JoinColumn(name = "id_pao", referencedColumnName = "id_ingredientes")
    @ManyToOne(optional = false)
    private Ingredientes idPao;
    @JoinColumn(name = "id_salada", referencedColumnName = "id_ingredientes")
    @ManyToOne
    private Ingredientes idSalada;

    public Lanche() {
    }

    public Lanche(Integer idLanche) {
        this.idLanche = idLanche;
    }

    public Integer getIdLanche() {
        return idLanche;
    }

    public void setIdLanche(Integer idLanche) {
        this.idLanche = idLanche;
    }

    public Ingredientes getIdCarne() {
        return idCarne;
    }

    public void setIdCarne(Ingredientes idCarne) {
        this.idCarne = idCarne;
    }

    public Ingredientes getIdMolho() {
        return idMolho;
    }

    public void setIdMolho(Ingredientes idMolho) {
        this.idMolho = idMolho;
    }

    public Ingredientes getIdPao() {
        return idPao;
    }

    public void setIdPao(Ingredientes idPao) {
        this.idPao = idPao;
    }

    public Ingredientes getIdSalada() {
        return idSalada;
    }

    public void setIdSalada(Ingredientes idSalada) {
        this.idSalada = idSalada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLanche != null ? idLanche.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lanche)) {
            return false;
        }
        Lanche other = (Lanche) object;
        if ((this.idLanche == null && other.idLanche != null) || (this.idLanche != null && !this.idLanche.equals(other.idLanche))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Lanche[ idLanche=" + idLanche + " ]";
    }

    @XmlTransient
    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }
    
}
