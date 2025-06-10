package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modelo.UsuarioDAO;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        Usuario u = new Usuario(nombre, telefono, direccion, usuario, clave);
        UsuarioDAO dao = new UsuarioDAO();
        try {
            boolean resultado = dao.registrar(u);
            if (resultado) {
                System.out.println("Usuario registrado correctamente.");
                response.sendRedirect("login.jsp?registrado=1");
            } else {
                System.out.println("No se pudo registrar el usuario.");
                response.sendRedirect("registro.jsp?error=" + URLEncoder.encode("No se pudo registrar. Verifica los datos.", StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            e.printStackTrace(); // muestra error completo en consola
            String mensajeError = e.getMessage();
            response.sendRedirect("registro.jsp?error=" + URLEncoder.encode(mensajeError, StandardCharsets.UTF_8));
        }
    }
}

/*Recoge los datos del formulario (nombre, teléfono, dirección, usuario, clave).
Crea un objeto Usuario con esos datos.
Llama al método registrar() del UsuarioDAO, que intenta guardar ese usuario en la base de datos.
Dependiendo del resultado:
✅ Si el registro es exitoso, redirige a login.jsp?registrado=1.
❌ Si falla, redirige a registro.jsp?error=mensaje. */