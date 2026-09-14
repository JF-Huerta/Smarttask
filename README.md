# SmartTask — Gestor de tareas

Proyecto académico desarrollado 
durante mi formación en desarrollo Full Stack Java.

## Descripción y objetivo

SmartTask es una aplicación de consola que permite organizar
tareas y registrar su estado de avance.

El objetivo fue aplicar programación orientada a objetos,
separar responsabilidades y escribir pruebas unitarias.

## Funcionalidades

- Agregar tareas normales o urgentes.
- Registrar identificador, nombre y prioridad.
- Listar las tareas registradas.
- Marcar una tarea como completada mediante su ID.
- Eliminar una tarea mediante su ID.

## Tecnologías utilizadas

- Java.
- JUnit Jupiter.
- Javadoc.

## Organización del proyecto

- `src/app`: clase principal y menú de consola.
- `src/modelo`: clases Tarea, TareaNormal y TareaUrgente.
- `src/contrato`: interfaz Accionable.
- `src/servicio`: administración de las tareas.
- `test`: pruebas unitarias.
- `doc`: documentación generada con Javadoc.

## Cómo ejecutar la aplicación

Necesitas un JDK de Java instalado y los comandos
`javac` y `java` disponibles en la terminal.

Descarga el repositorio, descomprímelo y abre una terminal
en la carpeta que contiene `src`, `test` y `doc`.

Compila el código:

```bash
javac -encoding UTF-8 -d out src/app/*.java src/modelo/*.java src/contrato/*.java src/servicio/*.java
```

Ejecuta la aplicación:

```bash
java -cp out app.Main
```

Utiliza las opciones del menú para administrar las tareas.

## Pruebas unitarias

La carpeta `test` contiene 11 métodos de prueba distribuidos
en cuatro clases:

- TareaTest.
- TareaNormalTest.
- TareaUrgenteTest.
- GestorTareasTest.

Incluyen comprobaciones de creación y completado de tareas,
administración de la lista y operaciones con IDs inexistentes.

Para ejecutarlas en un IDE, configura `src` y `test` como
carpetas de código e incorpora JUnit Jupiter al proyecto.
Luego ejecuta las clases de prueba como pruebas JUnit.

Los comandos de ejecución anteriores compilan únicamente
la aplicación; no ejecutan las pruebas.

## Documentación

Para consultar la documentación Javadoc, descarga el proyecto
y abre `doc/index.html` en tu navegador.

## Aprendizajes

Durante el desarrollo practiqué:

- Encapsulación mediante atributos privados y métodos de acceso.
- Herencia para representar distintos tipos de tareas.
- Definición e implementación de interfaces.
- Uso de ArrayList para administrar objetos.
- Separación del menú y la lógica de gestión.
- Escritura de pruebas unitarias y documentación del código.

## Alcance y mejoras pendientes

Esta versión corresponde a un ejercicio académico:

- Las tareas se almacenan en memoria y se pierden al cerrar.
- Las tareas normales y urgentes comparten el comportamiento
  de completado; no existe una ordenación automática por prioridad.
- Queda pendiente validar IDs duplicados y campos vacíos.
- Queda pendiente manejar entradas de texto en campos numéricos.

## Autora

**Javiera Huerta**

[Volver al portafolio](https://github.com/JF-Huerta/Portafolio)
