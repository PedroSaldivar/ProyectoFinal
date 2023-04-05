
package dentista;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Universidad Politécnica de San Luis Potosí
 * @author 174074
 * Pedro Antonio Saldívar Juárez 174074
 * 
 */
public class Dentista {

    public static void main(String[] args) {
        Conexion obj = new Conexion();
        Connection con = obj.Conexion("MySQL");
        try{
            new LogIn(con).setVisible(true);        
        }catch(SQLException e){
            System.out.println(e);
        }
    }

}
