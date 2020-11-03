/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Vinicius
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
    , @NamedQuery(name = "Ingredientes.findByPreco", query = "SELECT i FROM Ingredientes i WHERE i.preco = :preco")
    , @NamedQuery(name = "Ingredientes.findByTipo", query = "SELECT i FROM Ingredientes i WHERE i.tipo = :tipo")})
public class Ingredientes implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarne")
    private Collection<Lanche> lancheCollection;
    @OneToMany(mappedBy = "idMolho")
    private Collection<Lanche> lancheCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPao")
    private Collection<Lanche> lancheCollection2;
    @OneToMany(mappedBy = "idSalada")
    private Collection<Lanche> lancheCollection3;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ingredientes")
    private Integer idIngredientes;
    @Column(name = "estoque")
    private Integer estoque;
    @Column(name = "dt_fabricacao")
    private String dtFabricacao;
    @Column(name = "dt_validade")
    private String dtValidade;
    @Column(name = "descricao")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private BigDecimal preco;
    @Column(name = "tipo")
    private String tipo;

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

    public String getDtFabricacao() {
        return dtFabricacao;
    }

    public void setDtFabricacao(String dtFabricacao) {
        this.dtFabricacao = dtFabricacao;
    }

    public String getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(String dtValidade) {
        this.dtValidade = dtValidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @XmlTransient
    public Collection<Lanche> getLancheCollection() {
        return lancheCollection;
    }

    public void setLancheCollection(Collection<Lanche> lancheCollection) {
        this.lancheCollection = lancheCollection;
    }

    @XmlTransient
    public Collection<Lanche> getLancheCollection1() {
        return lancheCollection1;
    }

    public void setLancheCollection1(Collection<Lanche> lancheCollection1) {
        this.lancheCollection1 = lancheCollection1;
    }

    @XmlTransient
    public Collection<Lanche> getLancheCollection2() {
        return lancheCollection2;
    }

    public void setLancheCollection2(Collection<Lanche> lancheCollection2) {
        this.lancheCollection2 = lancheCollection2;
    }

    @XmlTransient
    public Collection<Lanche> getLancheCollection3() {
        return lancheCollection3;
    }

    public void setLancheCollection3(Collection<Lanche> lancheCollection3) {
        this.lancheCollection3 = lancheCollection3;
    }
    
}
