<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Login</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
  </head>
  <body
    class="bg-light d-flex justify-content-center align-items-center vh-100"
  >
    <div class="card p-4 shadow" style="width: 25rem">
      <h3 class="text-center mb-3">Iniciar Sesión</h3>
      <form action="LoginServlet" method="post">
        <div class="mb-3">
          <label class="form-label">Usuario</label>
          <input type="text" name="usuario" class="form-control" required />
        </div>
        <div class="mb-3">
          <label class="form-label">Clave</label>
          <input type="password" name="clave" class="form-control" required />
        </div>
        <div class="d-grid gap-2">
          <button type="submit" class="btn btn-primary">Ingresar</button>
        </div>
        <% if (request.getParameter("error") != null) { %>
        <div class="alert alert-danger mt-3">
          Usuario o contraseña incorrectos.
        </div>
        <% } %>
      </form>
      <div class="text-center mt-3">
        <p>
          ¿No tienes cuenta? <br />
          <a href="registro.jsp" class="btn btn-outline-secondary btn-sm mt- 2"
            >Registrarse</a
          >
        </p>
      </div>
    </div>
  </body>
</html>
