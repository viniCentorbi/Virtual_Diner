package dao;

import entidade.Ingredientes;
import java.util.List;

public class IngredientesDao extends UtilDao{
      
    public List<Ingredientes> listarIngredientes(){
        
        this.abreConexao();
        
        List<Ingredientes> ingredientes;
        ingredientes = em.createQuery("SELECT i from Ingredientes as i").getResultList();
        this.fechaConexao();
        
        return ingredientes;        
    }
    
    public List<Ingredientes> listarPaes(){
        
        this.abreConexao();
        
        List<Ingredientes> paes;
        paes = em.createQuery("SELECT i "
                            + "FROM Ingredientes as i "
                            + "WHERE i.tipo='Pao'"
                            + "AND i.estoque > 0").getResultList();
        this.fechaConexao();
        
        return paes;        
    }
    
    public List<Ingredientes> listarCarnes(){
        
        this.abreConexao();
        
        List<Ingredientes> carnes;
        carnes = em.createQuery("SELECT i "
                            + "FROM Ingredientes as i "
                            + "WHERE i.tipo='Carne'"
                            + "AND i.estoque > 0").getResultList();
        this.fechaConexao();
        
        return carnes;        
    }
    
    public List<Ingredientes> listarSaladas(){
        
        this.abreConexao();
        
        List<Ingredientes> saladas;
        saladas = em.createQuery("SELECT i "
                            + "FROM Ingredientes as i "
                            + "WHERE i.tipo='Salada'"
                            + "AND i.estoque > 0").getResultList();
        this.fechaConexao();
        
        return saladas;        
    }
    
    public List<Ingredientes> listarMolhos(){
        
        this.abreConexao();
        
        List<Ingredientes> molhos;
        molhos = em.createQuery("SELECT i "
                            + "FROM Ingredientes as i "
                            + "WHERE i.tipo='Molho'"
                            + "AND i.estoque > 0").getResultList();
        this.fechaConexao();
        
        return molhos;        
    }
    
    public Ingredientes buscarIngredienteId(int idIngredientes){
        this.abreConexao();
        
        Ingredientes ingredientes = em.find(Ingredientes.class, idIngredientes);
        this.fechaConexao();
        
        return ingredientes;
    } 
        
        

}
