/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vinicius
 */
@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findByIdUsuario", query = "SELECT p FROM Pedido p WHERE p.pedidoPK.idUsuario = :idUsuario")
    , @NamedQuery(name = "Pedido.findByIdLanche", query = "SELECT p FROM Pedido p WHERE p.pedidoPK.idLanche = :idLanche")
    , @NamedQuery(name = "Pedido.findByPrecoPedido", query = "SELECT p FROM Pedido p WHERE p.precoPedido = :precoPedido")
    , @NamedQuery(name = "Pedido.findByDtHoraPedido", query = "SELECT p FROM Pedido p WHERE p.dtHoraPedido = :dtHoraPedido")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PedidoPK pedidoPK;
    @Column(name = "preco_pedido")
    private BigDecimal precoPedido;
    @Column(name = "dt_hora_pedido")
    private String dtHoraPedido;
    @JoinColumn(name = "id_lanche", referencedColumnName = "id_lanche", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lanche lanche;

    public Pedido() {
    }

    public Pedido(PedidoPK pedidoPK) {
        this.pedidoPK = pedidoPK;
    }

    public Pedido(int idUsuario, int idLanche) {
        this.pedidoPK = new PedidoPK(idUsuario, idLanche);
    }

    public PedidoPK getPedidoPK() {
        return pedidoPK;
    }

    public void setPedidoPK(PedidoPK pedidoPK) {
        this.pedidoPK = pedidoPK;
    }

    
    public BigDecimal getPrecoPedido() {
        return precoPedido;
    }

    public void setPrecoPedido(BigDecimal precoPedido) {
        this.precoPedido = precoPedido;
    }

    public String getDtHoraPedido() {
        return dtHoraPedido;
    }

    public void setDtHoraPedido(String dtHoraPedido) {
        this.dtHoraPedido = dtHoraPedido;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidoPK != null ? pedidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.pedidoPK == null && other.pedidoPK != null) || (this.pedidoPK != null && !this.pedidoPK.equals(other.pedidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Pedido[ pedidoPK=" + pedidoPK + " ]";
    }
    
}
