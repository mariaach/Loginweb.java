package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.UsuarioDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        UsuarioDAO dao = new UsuarioDAO();
        boolean valido = dao.validarLogin(usuario, clave);
        if (valido) {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("usuario", usuario);
            response.sendRedirect("menu.jsp");
        } else {
            response.sendRedirect("login.jsp?error=1");
        }
    }
}