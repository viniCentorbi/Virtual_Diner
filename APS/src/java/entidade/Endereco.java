package entidade;

import org.postgresql.util.PGobject;
import java.sql.SQLException;

public class Endereco {

    public Endereco(String rua, int numero, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }    
        
    public static PGobject inserirBD() throws SQLException{
        
        PGobject typeEndereco = new PGobject();  
        
        typeEndereco.setType("Endereco");
        return typeEndereco;
    }
    
    public static Endereco retirarBD(PGobject typeString) throws SQLException{
                
        System.out.println(typeString.toString());
        
        Endereco endereco = new Endereco("",0,"");
        
        return endereco;
    }
    
    
        
    
    private String rua;
    private int numero;
    private String bairro;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
    
}
