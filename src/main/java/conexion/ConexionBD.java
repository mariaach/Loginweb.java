package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {

    public static Connection conectar() {

        try {
            String url = "jdbc:mysql://mysql:3306/usuarios";
            String user = "maria";
            String pass = "Maria1991#";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();// indica a que bd se va a conectar
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa.");
            return con;
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

/*Este método:
Intenta conectarse a una base de datos MySQL.
Usa JDBC.
Devuelve una conexión si tiene éxito o null si ocurre un error.
Registra errores con Logger y también muestra algunos mensajes en consola.*/