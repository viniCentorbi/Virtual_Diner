/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "ingredientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ingredientes.findAll", query = "SELECT i FROM Ingredientes i")
    , @NamedQuery(name = "Ingredientes.findByIdIngredientes", query = "SELECT i FROM Ingredientes i WHERE i.idIngredientes = :idIngredientes")
    , @NamedQuery(name = "Ingredientes.findByEstoque", query = "SELECT i FROM Ingredientes i WHERE i.estoque = :estoque")
    , @NamedQuery(name = "Ingredientes.findByDtFabricacao", query = "SELECT i FROM Ingredientes i WHERE i.dtFabricacao = :dtFabricacao")
    , @NamedQuery(name = "Ingredientes.findByDtValidade", query = "SELECT i FROM Ingredientes i WHERE i.dtValidade = :dtValidade")
    , @NamedQuery(name = "Ingredientes.findByDescricao", query = "SELECT i FROM Ingredientes i WHERE i.descricao = :descricao")
    , @NamedQuery(name = "Ingredientes.findByPreco", query = "SELECT i FROM Ingredientes i WHERE i.preco = :preco")})
public class Ingredientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_ingredientes")
    private Integer idIngredientes;
    @Column(name = "estoque")
    private Integer estoque;
    @Column(name = "dt_fabricacao")
    @Temporal(TemporalType.DATE)
    private Date dtFabricacao;
    @Column(name = "dt_validade")
    @Temporal(TemporalType.DATE)
    private Date dtValidade;
    @Column(name = "descricao")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Float preco;

    public Ingredientes() {
    }

    public Ingredientes(Integer idIngredientes) {
        this.idIngredientes = idIngredientes;
    }

    public Integer getIdIngredientes() {
        return idIngredientes;
    }

    public void setIdIngredientes(Integer idIngredientes) {
        this.idIngredientes = idIngredientes;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Date getDtFabricacao() {
        return dtFabricacao;
    }

    public void setDtFabricacao(Date dtFabricacao) {
        this.dtFabricacao = dtFabricacao;
    }

    public Date getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIngredientes != null ? idIngredientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingredientes)) {
            return false;
        }
        Ingredientes other = (Ingredientes) object;
        if ((this.idIngredientes == null && other.idIngredientes != null) || (this.idIngredientes != null && !this.idIngredientes.equals(other.idIngredientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Ingredientes[ idIngredientes=" + idIngredientes + " ]";
    }
    
}
