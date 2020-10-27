package entidade;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.*;
import org.postgresql.util.PGobject;

@Converter(autoApply = true)
public class Conversor implements AttributeConverter<Endereco, PGobject> {
    @Override
    public PGobject convertToDatabaseColumn(Endereco endereco){
        try{
            return endereco.inserirBD();
            
        }catch (SQLException ex){
            Logger.getLogger(Conversor.class.getName()).log(Level.SEVERE, null,ex);
        }
        return null;
    }
    
    @Override
    public Endereco convertToEntityAttribute(PGobject dbData){
        try {
            return Endereco.retirarBD(dbData);
        } catch (SQLException ex) {
            Logger.getLogger(Conversor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public Date converter(String data) {
        java.sql.Date sql = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date parsed = format.parse(data);
            sql = new java.sql.Date(parsed.getTime());
            System.out.println("sql: " + sql);

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return sql;
    }
    
    public static BigDecimal StringToBigDecimal(String strPreco) {
        
        BigDecimal preco = new BigDecimal(strPreco);
        
        return preco;
    }
    
    public Date StringToDate(String data) {
                
    try {
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date parsed = formato.parse(data);
        
        
                    
        return parsed;
    }catch (ParseException ex) {
        ex.printStackTrace();
    }
    return null;
}
    
    public Date DateToSqlDate(Date data){

        java.sql.Date sql;
        sql = new java.sql.Date(data.getTime());

        return sql;
    }
    
}
