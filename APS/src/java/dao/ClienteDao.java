package dao;
import entidade.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteDao {
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
    
    public void salvar(Cliente cliente){
        this.abreConexao();
        em.persist(cliente);
        this.fechaConexao();
    }
        
}
