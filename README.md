# Verificación y Validación del Software 2021
GRUPO IWM-41-Grupo 9

## Instrucciones para utilizar este proyecto

Se deben seguir las mismas instrucciones que en el proyecto de caja negra para ejecutar las pruebas:

## Instrucciones para poder ejecutar las pruebas en ECLIPSE:
Run > Run Configurations… > Maven Build
Seleccionamos el proyecto clonado en Base directory.
En goals añadimos lo siguiente, sustituyendo "/my/path" por el directorio donde hayamos guardado el JAR al descargarlo:
"install:install-file -Dfile=/my/path/SingleList.jar -DgroupId=com.singleList -DartifactId=SingleList -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar"
Tener en cuenta que en este proyecto la librería SingleList.jar se encuentra dentro de la carpeta: "Libraries".

## Instrucciones para poder ejecutar las pruebas en IntelliJ:
En Working Directory seleccionamos el proyecto clonado.
En Command line añadimos el siguiente comando, sustituyendo "/my/path" por el directorio donde hayamos guardado el JAR al descargarlo
"install:install-file -Dfile=/my/path/SingleList.jar -DgroupId=com.singleList -DartifactId=SingleList -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar"
Si el path tiene espacios podemos ponerlo entre comillas: 
-Dfile=”C:/Users/pepe/Validación y Verificación/SingleList.jar” ….
Tener en cuenta que en este proyecto la librería SingleList.jar se encuentra dentro de la carpeta: "Libraries".

Una vez realizado esto, se podrán ejecutar como JUnit tests los que figuran en el archivo Prueba.java 
Puede encontrar la documentacion de los tests en la Memoria del proyecto adjunta en moodle en formato pdf, dentro del .zip que contiene tales archivos
