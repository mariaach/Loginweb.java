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