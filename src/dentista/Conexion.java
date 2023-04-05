package dentista;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Universidad Politécnica de San Luis Potosí
 * @author 174074
 * Pedro Antonio Saldivar Juarez 174074
 * Programación II 7-8
 */

public class Conexion{
    Connection con;
    public Connection Conexion (String tipo){
        try
        {
            if(tipo.equals("MySQL"))
            {
                //Class.forName("com.mysql.jdbc.Driver");
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dentista","root","");
                System.out.println("Se conecto :) ");
            }else
            {
                if(tipo.equals("Derby"))
                {
                    con = DriverManager.getConnection("jdbc:derby://localhost/upslp;create=true;user=root;password=1234");
                    System.out.println("Se conecto :) ");
                }else
                {
                    System.out.println("No es posible realizar la conexion :( ");
                }
            }
        }catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Error"+ e);
        }
        return con;
    }
}
