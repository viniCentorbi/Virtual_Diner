package dao;


import entidade.Ingredientes;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class IngredientesDao {
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public void abreConexao(){
        emf = Persistence.createEntityManagerFactory("APSPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }
    
    public void fechaConexao(){
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    

}
