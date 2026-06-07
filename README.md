# Taller 3 - Sistema de Gestión de Magia

## Autor

* Laura García
* RUT: 26.427.429-K
* Paralelo: C2

## Descripción

Este proyecto corresponde al desarrollo de un sistema de gestión de magia realizado en Java utilizando Programación Orientada a Objetos.

El sistema permite administrar magos y hechizos, además de realizar consultas y análisis sobre la información almacenada.

La información es persistida mediante archivos de texto, permitiendo mantener los datos entre ejecuciones, En este taller utilicé Lenguaje regular "Regex" aprendido en la clase de ciencia de datos para validar de manera correcta la entrada de caracteres. 

## Funcionalidades

### Módulo Administrador

* Agregar magos.
* Modificar magos.
* Eliminar magos.
* Agregar hechizos.
* Modificar hechizos.
* Eliminar hechizos.

### Módulo Analista

* Mostrar Top 10 de hechizos con mayor puntuación.
* Mostrar Top 3 de magos con mayor puntuación.
* Mostrar todos los hechizos.
* Mostrar todos los magos.
* Mostrar hechizos junto a su puntuación.
* Mostrar magos junto a su puntuación.

## Tipos de Hechizos

El sistema considera los siguientes tipos de hechizos:

* Hechizo Agua
* Hechizo Fuego
* Hechizo Tierra
* Hechizo Planta

Cada tipo de hechizo implementa su propia fórmula de cálculo de puntuación mediante herencia y polimorfismo.

## Conceptos de POO Utilizados

* Encapsulamiento
* Herencia
* Polimorfismo
* Clases abstractas
* Interfaces
* Colecciones ArrayList
* Lectura y escritura de archivos
* UML
* JavaDoc

## Estructura del Proyecto

### Package dominio

Contiene las entidades principales del sistema:

* Mago
* Hechizo
* HechizoAgua
* HechizoFuego
* HechizoTierra
* HechizoPlanta

### Package logica

Contiene la lógica de negocio:

* Sistema
* Administrador
* AdministradoImple
* Analista
* AnalistaImple
* LectorArchivo
* EscritorArchivo
* Main

## Archivos Utilizados

* Magos.txt
* Hechizos.txt

## Diagramas

El proyecto incluye:

* Diagrama UML
* Diagrama de Dominio

## Documentación

El proyecto se encuentra documentado mediante JavaDoc en las clases y métodos principales.

## Ejecución

Ejecutar la clase:

Main.java

Desde esta clase se inicia el sistema y se despliegan los distintos menús disponibles.
