package dao;

import entidade.Cliente;
import java.util.List;

public class ClienteDao extends UtilDao{
   
    public List<Cliente> listarCliente(){
        
        this.abreConexao();
        
        List<Cliente> clientes;
        clientes = em.createQuery("SELECT c from Cliente as c").getResultList();
        this.fechaConexao();
        
        return clientes;        
    }
    
    public Cliente buscarClienteId(int idCliente){
        this.abreConexao();
        
        Cliente cliente = em.find(Cliente.class, idCliente);
        this.fechaConexao();
        
        return cliente;
    }
        
}
