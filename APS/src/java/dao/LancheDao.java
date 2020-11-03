package dao;
import entidade.Lanche;
import java.util.List;


public class LancheDao extends UtilDao {
    public List<Lanche> listarLanche(){
        
        this.abreConexao();
        
        List<Lanche> lanches;
        lanches = em.createQuery("SELECT l from Lanche as l").getResultList();
        this.fechaConexao();
        
        return lanches;        
    }
    
    public Lanche buscarLancheId(int idLanche){
        this.abreConexao();
        
        Lanche lanche = em.find(Lanche.class, idLanche);
        this.fechaConexao();
        
        return lanche;
    }
}
