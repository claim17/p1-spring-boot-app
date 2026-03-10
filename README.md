# Aplicación inicial Spring Boot

Aplicación básica usando Spring Boot y plantillas Thymeleaf.

## Requisitos

Necesitas tener instalado en tu sistema:

- Java 8

## Ejecución

Puedes ejecutar la aplicación usando el _goal_ `run` del _plugin_ Maven 
de Spring Boot:

```
$ ./mvnw spring-boot:run 
```   

También puedes generar un `jar` y ejecutarlo:

```
$ ./mvnw package
$ java -jar target/demoapp-0.0.1-SNAPSHOT.jar 
```

Una vez lanzada la aplicación puedes abrir un navegador y probar los distintos _controllers_:

- [http://localhost:8080](http://localhost:8080)
- [http://localhost:8080/saludo/Pepito](http://localhost:8080/saludo/Pepito)
- [http://localhost:8080/saludoplantilla/Pepito](http://localhost:8080/saludoplantilla/Pepito)
- [http://localhost:8080/saludoform](http://localhost:8080/saludoform)
  
PARTE DE LA PRACTICA 
- 

- [http://localhost:8080/palindrome](http://localhost:8080/palindrome)
  Palíndromo (/palindrome) :Comprueba si una palabra se lee igual al revés.
  Lógica: Limpia el texto (quita espacios y mayúsculas) y usa StringBuilder.reverse() para compararlo con el original.
  
- [http://localhost:8080/par-impar](http://localhost:8080/par-impar)
  Dice si un número es par o no.
  Lógica: Usa el operador módulo (% 2). Si el resto es 0, es par; si es 1, es impar.

- [http://localhost:8080/cuadrado](http://localhost:8080/cuadrado)
  Verifica si $y$ es el cuadrado de $x$ ($y = x^2$).
  Lógica: Multiplica $x \cdot x$ y comprueba si el resultado coincide con $y$.

- [http://localhost:8080/calculadora](http://localhost:8080/calculadora)
  Suma, resta, multiplica o divide dos números.
  Lógica: Un switch selecciona la operación según el símbolo
  enviado ($+$, $-$, $*$, $/$). Incluye control para que no explote si divides por cero.

- [link de repo github](https://github.com/claim17/p1-spring-boot-app) REPO DE GITHUB

- [link dokerhub con la imagen](https://hub.docker.com/layers/clim17/spring-boot-demoapp/latest/images/sha256:52e4442d1bbe2a8fa72417e64a07b982edea97a3ef66ff5fa613a01adba0543f?uuid=8913017A-921F-4B73-A4E2-FE7C0662FFF4) REPO DE DOKERHUB