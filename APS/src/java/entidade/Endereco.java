package entidade;

import org.postgresql.util.PGobject;
import java.sql.SQLException;

public class Endereco {

    public Endereco(String rua, int numero, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }    
        
    public PGobject inserirBD() throws SQLException{
        
        PGobject object = new PGobject();  
        
        String endereco = "(\"" + rua + "\", " + numero + ", \"" + cep + "\")";
   
        object.setType("endereco");
        object.setValue(endereco);
        
        return object;
    }
    
    public static Endereco retirarBD(PGobject object) throws SQLException{
        String str = object.toString();
        str = str.substring(1, str.length()-1);
        String[] endereco = str.split(",");

        String rua = endereco[0].substring(1, endereco[0].length()-1);
        Integer num = Integer.parseInt(endereco[1]);
        String cep = endereco[2];
        
        return new Endereco(rua, num, cep);
    }
    
    
        
    
    private String rua;
    private int numero;
    private String cep;

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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
}
