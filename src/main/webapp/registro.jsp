<% @page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
rel="stylesheet">
</head>
<body class="bg-light d-flex justify-content-center align-items-center vh-100">
<div class="card p-4 shadow" style="width: 30rem;">
<h3 class="text-center mb-3">Registrar Usuario</h3>
<form action="RegistroServlet" method="post">
<div class="mb-3">
<label class="form-label">Nombre</label>
<input type="text" name="nombre" class="form-control" required>
</div>
<div class="mb-3">
<label class="form-label">Teléfono</label>
<input type="text" name="telefono" class="form-control" required>
</div>
<div class="mb-3">
<label class="form-label">Dirección</label>
<input type="text" name="direccion" class="form-control" required>
</div>
<div class="mb-3">
<label class="form-label">Usuario</label>
<input type="text" name="usuario" class="form-control" required>
</div>
<div class="mb-3">
<label class="form-label">Clave</label>
<input type="password" name="clave" class="form-control" required>
</div>
<div class="d-grid gap-2">
<button type="submit" class="btn btn-success">Registrar</button>
</div>
</form>
<div class="text-center mt-3">
<a href="login.jsp" class="btn btn-outline-secondary btn-sm">Volver al login</a>
</div>
</div>
</body>
</html>