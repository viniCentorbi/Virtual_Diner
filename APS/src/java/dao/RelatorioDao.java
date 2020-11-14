package dao;

import java.util.List;

public class RelatorioDao extends UtilDao{
    
    
    public String qtdPedido1(){
        
        this.abreConexao();
        
        String qtdPedido = (String) em.createQuery("SELECT p.dt_hora_pedido " +
                                                    "FROM Pedido as p " +
                                                    "WHERE p.dt_hora_pedido > '13:00' " +
                                                    "AND p.dt_hora_pedido < '16:00' ").getSingleResult();
        
        this.fechaConexao();
        
        return qtdPedido;
        
    }
    
    
}
