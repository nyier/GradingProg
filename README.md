# Estatus:
![Build Status](https://app.travis-ci.com/nyier/GradingProg.svg?branch=main)
# Resumen Ejecutivo
- Descripción:
  Aplicación web la cual te permite hacer promedios / consultar los promedios realizados, usando un sistema de login para identificarte como profesor o como alumno.
- Problemática:
La gestión manual de calificaciones por parte de los docentes en el nivel de educación secundaria conlleva desafíos significativos. Los procesos tradicionales para calcular promedios y evaluar el rendimiento de los estudiantes son laboriosos, propensos a errores y consumen mucho tiempo. Esto puede generar:
     1. Ineficiencia en la Gestión de Calificaciones: El   cálculo manual de promedios y la organización de datos de calificaciones de múltiples asignaturas y estudiantes resulta tedioso y propenso a errores, consumiendo tiempo valioso de los docentes.
    2. Falta de Claridad y Retroalimentación Instantánea: La demora en la generación de promedios puede obstaculizar la retroalimentación oportuna a los estudiantes, lo que dificulta su comprensión del progreso académico y la identificación de áreas de mejora.
    3. Dificultades en el Análisis y Seguimiento del Rendimiento: Los docentes pueden enfrentar desafíos para analizar el rendimiento de los estudiantes de manera eficiente, lo que limita su capacidad para identificar patrones de aprendizaje y ofrecer intervenciones personalizadas.
- Arquitectura:
![image](https://github.com/nyier/GradingProg/assets/108092383/5882d2c3-49d3-41c2-9a24-70ddcf3d4f53)

# Tabla de contenidos
PROYECTO
- src
  -- main
    --- java
      ---- area
        ------  imc.java
        ------ usuario.java
      ---- controller
        ------  LoginServlet.java
        ------  ServletMain.java
        ------  ServletRegister.java
    --- webapp
        ------  calculo.jsp
        ------  error.jsp
        ------  index.jsp
        ------  login.jsp
        ------  register.jsp
        ------  CSS
          -------  brooke.jpg
          ------- estilos.css
        ------  META-INF
          -------  context.xml
        ------  WEB-INF
          -------  beans.xml
          -------  web.xml

# Requerimentos:

Consulta de calificaciones
Agregar y modificar la información
Guardar los cambios
Agregar profesores y alumnos

- Diseño

Login.
Interfaz para visualizar la información.
Register.
Interfaz de error.

- Servidor de aplicación:

Apache Tomcat 10.0

- Version de java

Java 18.0 (JavaEE)

- Base de datos

mySQL

# Instalación
  Descargar proyecto desde el repositorio.
  Se configura el ambiente en el IDE NetBeans con Tomcat.
  Se inicia mySQL con el archivo ya instalado.
  Se inicia desde el IDE.
  
# Configuración:
  Se usa la ultima version de Java.
  Se instala netbeans junto con Tomcat.
  Se instala mySQL y se usa el archivo.
  Se configura desde la app los usuarios que se usaran

# Uso:
El software es de uso personal para docentes y es posible usarlo en una escuela secundaria. Cada usuario va a tener un permiso, ya sea de profesor o de estudiantes, con cada una sus funciones.

# Contribución:
- Clonar el Repositorio:
Abre tu terminal o línea de comandos.
Usa el comando git clone <URL_DEL_REPOSITORIO> para clonar el repositorio en tu máquina local.
- Crear un Nuevo Branch:
Accede al directorio del repositorio clonado: cd nombre_del_repositorio.
Crea un nuevo branch para tu contribución: git checkout -b nombre_de_tu_branch.
- Realizar Cambios:
Realiza tus modificaciones y/o adiciones en el código.
Usa git add nombre_del_archivo_modificado para agregar los archivos modificados al área de preparación.
Utiliza git commit -m "Mensaje descriptivo" para hacer un commit con un mensaje claro y descriptivo.
- Enviar tus Cambios:
Sube tus cambios al repositorio remoto: git push origin nombre_de_tu_branch.
Ve a la página del repositorio en tu navegador.
Abre un Pull Request (PR) haciendo clic en el botón correspondiente.
Completa la información necesaria para describir tu PR y por qué se debe fusionar.
- Esperar la Revisión y Fusión:
Espera la revisión de tu PR por parte de los colaboradores o el propietario del repositorio.
Si se solicitan cambios adicionales, realiza las modificaciones y actualiza tu PR.
- Hacer Merge del PR:
Una vez aprobado, un colaborador con permisos de merge fusionará tu PR con la rama principal.
Elimina tu branch localmente si ya no se necesita: git branch -d nombre_de_tu_branch.

# Roadmap:
Conforme pasa el tiempo voy a ir implementando funciones y arreglar bugs para mejorar la experiencia de usuario, el feedback de los usuarios me van a dar nuevas ideas para implementar y expandir esta app. Se le dara prioridad en su mantenimiento por 2 meses.
