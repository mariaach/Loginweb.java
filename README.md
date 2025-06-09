Version de JAVA 21


Pasos para generar el compilado
1. Instalar dependencias (ver que las libreris esten instaladas con mvn install)
2. Compilar y generar el archivo .war mvn clean package
3. busco el  archivo .war y lo pego en el directorio del servidor webapps
4. reinicio servidor apache Tomcat para que tome los cambios que realice en el codigo docker restart tomcat9

5. validar cambio desplegado en el servidor  http://localhost:8080/LoginWeb/login.jsp


##-------Creacion de BD
CREATE DATABASE usuarios;
USE usuarios;
CREATE TABLE usuarios (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100),
telefono VARCHAR(20),
direccion VARCHAR(200),
usuario VARCHAR(50) UNIQUE,
clave VARCHAR(100)
);