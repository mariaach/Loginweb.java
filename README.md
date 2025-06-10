Version de JAVA 21

Pasos para generar el compilado

1. Instalar dependencias (ver que las libreris esten instaladas con el comando mvn install)
2. Compilar y generar el archivo .war: mvn clean package
3. busco el  archivo .war y lo pego en el directorio del servidor webapps
4. reinicio servidor apache Tomcat para que tome los cambios que realice en el codigo. docker restart tomcat9
5. validar cambio desplegado en el servidor  http://localhost:8080/LoginWeb/login.jsp


  String url = "jdbc:mysql://localhost:3306/usuarios";