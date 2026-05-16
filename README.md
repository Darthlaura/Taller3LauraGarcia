\# Taller 3 - Programación Orientada a Objetos



Repositorio correspondiente al Taller 3 de Programación Orientada a Objetos.



\## Integrante



\- Laura García; rut 26427429-k



\## Descripción general



Este proyecto desarrolla un sistema basado en magos y hechizos.



Cada mago puede dominar uno o varios hechizos. Cada hechizo pertenece a un tipo específico:



\- Agua

\- Fuego

\- Tierra

\- Planta



El sistema utiliza Programación Orientada a Objetos, aplicando separación por paquetes, herencia, clases abstractas, interfaces, lectura de archivos y escritura de archivos.



\## Estructura del proyecto



El proyecto está dividido principalmente en dos paquetes:



```text

src/

&#x20;├── dominio/

&#x20;└── logica/

```



\## Paquete dominio



En este paquete se encuentran las clases que representan las entidades principales del problema.



\### Clase Hechizo



Clase abstracta que representa un hechizo general.



Contiene los datos comunes de todos los hechizos:



\- nombre del hechizo

\- tipo

\- daño



De esta clase heredan los distintos tipos de hechizos.



\### Clase HechizoAgua



Clase hija de Hechizo.



Representa los hechizos de tipo Agua.



\### Clase HechizoFuego



Clase hija de Hechizo.



Representa los hechizos de tipo Fuego.



\### Clase HechizoTierra



Clase hija de Hechizo.



Representa los hechizos de tipo Tierra.



\### Clase HechizoPlanta



Clase hija de Hechizo.



Representa los hechizos de tipo Planta.



\### Clase Mago



Representa a un mago dentro del sistema.



Cada mago posee una lista de hechizos que domina.



\## Paquete logica



En este paquete se encuentran las clases encargadas de manejar la lógica del sistema.



\### Clase LectorArchivo



Clase encargada de leer los archivos de texto del proyecto.



Actualmente se trabaja en la lectura de:



\- archivo de hechizos

\- archivo de magos



\### Clase EscritorArchivo



Clase pensada para guardar los cambios realizados en los archivos de texto.



Será utilizada para reflejar las operaciones de agregar, modificar o eliminar datos.



\### Interface Administrador



Interface que define las operaciones principales del panel administrador.



Incluye acciones como:



\- agregar mago

\- modificar mago

\- eliminar mago

\- agregar hechizo

\- modificar hechizo

\- eliminar hechizo



\### Clase AdministradorImpl



Clase que implementa la interface Administrador.



Aquí se desarrollará la lógica concreta de las operaciones administrativas.



\### Clase Analista



Clase pensada para generar los reportes del sistema.



Entre sus responsabilidades estarán:



\- mostrar todos los hechizos

\- mostrar todos los magos

\- calcular ranking de hechizos

\- calcular ranking de magos

\- mostrar hechizos con su puntuación

\- mostrar magos con su puntuación



\### Clase Sistema



Clase encargada de coordinar el funcionamiento general del programa.



El objetivo es que el Main quede simple y que la lógica principal se maneje desde esta clase.



\## Conceptos de POO utilizados



En este proyecto se utilizarán los siguientes conceptos:



\- clases y objetos

\- encapsulamiento

\- herencia

\- clase abstracta

\- interfaces

\- polimorfismo

\- ArrayList

\- lectura de archivos

\- escritura de archivos

\- separación por paquetes



\## Estado actual del proyecto



Actualmente el proyecto cuenta con:



\- creación de paquetes dominio y logica

\- diseño inicial de las clases principales

\- clase abstracta Hechizo

\- clases hijas para los tipos de hechizo

\- clase Mago

\- lectura inicial de archivos

\- estructura inicial para administrador, analista y sistema



\## Pendiente



\- completar la lectura de hechizos

\- completar la lectura de magos

\- relacionar los magos con sus hechizos correspondientes

\- implementar cálculo de puntuaciones

\- implementar panel administrador

\- implementar panel analista

\- implementar escritura de archivos

\- crear modelo de dominio en PDF

\- crear diagrama de clases en PDF



\## Estado



Proyecto en desarrollo.



