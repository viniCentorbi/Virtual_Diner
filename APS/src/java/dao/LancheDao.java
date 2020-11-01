package dao;
import entidade.Lanche;
import java.util.List;


public class LancheDao extends UtilDao {
    public List<Lanche> listarLanche(){
        
        this.abreConexao();
        
        List<Lanche> lanche;
        lanche = em.createQuery("SELECT i from lanche as c").getResultList();
        this.fechaConexao();
        
        return lanche;        
    }
}
