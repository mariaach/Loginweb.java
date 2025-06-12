package modelo;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDAO {

    public boolean registrar(Usuario usuario) {
        Connection con = ConexionBD.conectar();
        if (con == null) {
            System.out.println("No se pudo establecer conexión en UsuarioDAO.");
            return false;
        }

        String sql = "INSERT INTO usuarios (nombre, telefono, direccion, usuario, clave) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = con.prepareStatement(sql)) { //permite inyectar sql y hace dinamico
            stmt.setString(1, usuario.getNombre()); 
            stmt.setString(2, usuario.getTelefono());
            stmt.setString(3, usuario.getDireccion());
            stmt.setString(4, usuario.getUsuario());
            stmt.setString(5, usuario.getClave());

            int filas = stmt.executeUpdate();
            System.out.println("Registro insertado. Filas afectadas: " + filas);
            return filas > 0;
             // si sale un error pasa al catch y entrega el mesaje
        } catch (SQLException e) {
            System.out.println("Error al ejecutar INSERT en UsuarioDAO: " + e.getMessage());
            return false;
        }
    }

    public boolean validarLogin(String usuario, String clave) {
        Connection con = ConexionBD.conectar();// abre la conexion
        if (con == null) {
            System.out.println("No se pudo establecer conexión al validar login.");
            return false;
        }

        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND clave = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, usuario);
            stmt.setString(2, clave);

            ResultSet rs = stmt.executeQuery();
            boolean existe = rs.next();
            System.out.println("Resultado login: " + (existe ? "Usuario válido" : "No encontrado"));
            return existe;

        } catch (SQLException e) {
            System.out.println("Error al validar login: " + e.getMessage());
            return false;
        }
    }
}
