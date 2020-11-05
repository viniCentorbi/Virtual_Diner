package dao;

import static dao.UtilDao.em;
import entidade.Pedido;
import entidade.PedidoPK;
import java.util.List;

public class PedidoDao extends UtilDao{
    
    public List<Pedido> listarPedidos(){
        
        this.abreConexao();
        
        List<Pedido> pedidos;
        pedidos = em.createQuery("SELECT p FROM Pedido as p").getResultList();
        this.fechaConexao();
        
        return pedidos;        
    }
    
    public Pedido buscarPedidoId(PedidoPK idPedido){
        this.abreConexao();
        
        Pedido pedido = em.find(Pedido.class, idPedido);
        this.fechaConexao();
        
        return pedido;
    }
    
}
