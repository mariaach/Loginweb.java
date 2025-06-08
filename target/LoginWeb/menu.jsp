<%@ page session="true" %> <% String usuario = (String)
session.getAttribute("usuario"); if (usuario == null) {
response.sendRedirect("login.jsp"); } %>
<!DOCTYPE html>
<html>
  <head>
    <title>Bienvenido</title>
  </head>
  <body>
    <h1>Aplicación Login Web ADSO Funcionando!</h1>
    <p>¡Bienvenido, usuario!</p>
  </body>
</html>
