package dao;

import entidade.Ingredientes;
import java.util.List;

public class IngredientesDao extends UtilDao{
      
    public List<Ingredientes> listarIngredientes(){
        
        this.abreConexao();
        
        List<Ingredientes> ingredientes;
        ingredientes = em.createQuery("SELECT i from ingredientes as i").getResultList();
        this.fechaConexao();
        
        return ingredientes;        
    }
    
    public Ingredientes buscarIngredienteId(int idIngredientes){
        this.abreConexao();
        
        Ingredientes ingredientes = em.find(Ingredientes.class, idIngredientes);
        this.fechaConexao();
        
        return ingredientes;
    } 
        
        

}
