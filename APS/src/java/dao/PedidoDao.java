package dao;

import static dao.UtilDao.em;
import entidade.Pedido;
import java.util.List;

public class PedidoDao extends UtilDao{
    
    public List<Pedido> listarIngredientes(){
        
        this.abreConexao();
        
        List<Pedido> pedidos;
        pedidos = em.createQuery("SELECT p FROM pedido as p").getResultList();
        this.fechaConexao();
        
        return pedidos;        
    }
    
}
