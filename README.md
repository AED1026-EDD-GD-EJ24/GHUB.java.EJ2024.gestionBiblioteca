
# Sistema de Gestión de Biblioteca

Este proyecto es un sistema de gestión de biblioteca simple pero eficaz, implementado en Java. Utiliza varias estructuras de datos de Java, incluyendo TreeSet, LinkedList, ArrayList y Hashtable.

## Estructuras de Datos

- **TreeSet**: Se utiliza para almacenar los libros en la biblioteca. Los libros se ordenan automáticamente por su título.

- **LinkedList**: Se utiliza para manejar una lista de usuarios que están esperando para tomar prestado un libro que actualmente está prestado.

- **ArrayList**: Se utiliza para almacenar una lista de todos los libros que un usuario específico ha tomado prestado.

- **Hashtable**: Se utiliza para almacenar los usuarios de la biblioteca. La clave es el ID del usuario y el valor es el objeto del usuario.

## Clases

- **Libro**: Representa un libro en la biblioteca. Implementa la interfaz Comparable para permitir la ordenación en un TreeSet.

- **Usuario**: Representa a un usuario de la biblioteca. Mantiene una lista de los libros que el usuario está esperando y los libros que ha tomado prestados.

- **Biblioteca**: La clase principal que mantiene los TreeSets de libros y las Hashtables de usuarios.

## Diagrama de clases
```mermaid
classDiagram
    class Biblioteca {
        -TreeSet<Libro> libros
        -Hashtable<String, Usuario> usuarios
        +Biblioteca()
        +TreeSet<Libro> getLibros()
        +void agregarLibro(Libro libro)
    }
    class Usuario {
        -TreeSet<Libro> libros
        -Hashtable<String, Usuario> usuarios
        +Biblioteca()
        +TreeSet<Libro> getLibros()
        +void agregarLibro(Libro libro)
    }
    class Libro {
        -String titulo
        -String autor
        -String isbn
        +Libro(String titulo, String autor, String isbn)
        +String getTitulo()
        +String getAutor()
        +String getIsbn()
    }
    class Menu {
        -List<MenuOpciones> opciones
        +Menu()
        +void mostrarMenu()
        +void seleccionarOpcion(int opcion)
    }
    class MenuOpciones {
        -List<MenuOpciones> opciones
        +Menu()
        +void mostrarMenu()
        +void seleccionarOpcion(int opcion)
    }
    Biblioteca --> Usuario : contiene
    Biblioteca --> Libro : contiene
    Usuario --> Libro : toma prestado
    Menu --> MenuOpciones : contiene
```mermaid
classDiagram
    class Biblioteca {
        -TreeSet<Libro> libros
        -Hashtable<String, Usuario> usuarios
        +Biblioteca()
        +TreeSet<Libro> getLibros()
        +void agregarLibro(Libro libro)
    }
    class Usuario {
        +S-TreeSet<Libro> libros
        -Hashtable<String, Usuario> usuarios
        +Biblioteca()
        +TreeSet<Libro> getLibros()
        +void agregarLibro(Libro libro)
    }
    class Libro {
        -String titulo
        -String autor
        -String isbn
        +Libro(String titulo, String autor, String isbn)
        +String getTitulo()
        +String getAutor()
        +String getIsbn()
    }
    class Menu {
        -List<MenuOpciones> opciones
        +Menu()
        +void mostrarMenu()
        +void seleccionarOpcion(int opcion)
    }
    class MenuOpciones {
        -List<MenuOpciones> opciones
        +Menu()
        +void mostrarMenu()
        +void seleccionarOpcion(int opcion)
    }
    Biblioteca --> Usuario : contiene
    Biblioteca --> Libro : contiene
    Usuario --> Libro : toma prestado
    Menu --> MenuOpciones : contiene

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
### Ejecutar ambos comandos en 1 sólo paso:
```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```

### Ejecutar Todas la pruebas locales de 1 Test Case
```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case
```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
