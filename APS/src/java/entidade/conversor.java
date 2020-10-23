package entidade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.*;
import org.postgresql.util.PGobject;

@Converter(autoApply = true)
public class conversor implements AttributeConverter< Endereco, PGobject> {
    @Override
    public PGobject convertToDatabaseColumn(Endereco endereco){
        try{
            return endereco.ToDBData();
        }catch (SQLException ex){
            Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, null,ex);
        }
        return null;
    }
    
    @Override
    public Endereco convertToEntityAttribute(PGobject dbData){
        return Endereco.FromDNData(dbData);
    }
    
}
