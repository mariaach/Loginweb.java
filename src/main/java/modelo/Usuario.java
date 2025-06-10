package modelo;

public class Usuario {
private String nombre;
private String telefono;
private String direccion;
private String usuario;
private String clave;
public Usuario() {}
public Usuario(String nombre, String telefono, String direccion, String usuario, String clave) {
this.nombre = nombre;
this.telefono = telefono;
this.direccion = direccion;
this.usuario = usuario;
this.clave = clave;
}
public String getNombre() {
return nombre;
}
public String getTelefono() {
return telefono;
}
public String getDireccion() {
return direccion;
}
public String getUsuario() {
return usuario;
}
public String getClave() {
return clave;
}
}

/*Atributos privados:
nombre: nombre del usuario
telefono: número de teléfono
direccion: dirección del usuario
usuario: nombre de usuario (login)
clave: contraseña
Constructores:
Un constructor vacío (Usuario()): necesario para algunas herramientas o frameworks.
Un constructor con parámetros: permite crear un objeto con todos los datos desde el principio.
Métodos getters (como getNombre(), getUsuario(), etc.):
Permiten acceder a los valores de los atributos desde otras clases.
📌 ¿Para qué sirve esta clase?
Sirve para transportar datos del usuario dentro del sistema, por ejemplo:
Desde el formulario de registro hasta el DAO.
Desde la base de datos hacia el servlet.
Para mostrar datos del usuario en una página JSP. */