package ui;

import java.util.Scanner;
import java.util.TreeSet;

import datos.Biblioteca;
import datos.Libro;
import datos.Usuario;

public class MenuOpciones {
    // Crear una nueva biblioteca y nómbrela biblioteca
   
    Scanner scanner = new Scanner(System.in);
    String opcion;
    Libro libro1 = null,libro2 = null,libro3 = null;
    public void agregarLibro(){
        
        libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-3-16-148410-0");
        libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-3-16-148411-7");
        libro3 = new Libro("1984", "George Orwell", "978-3-16-148412-4");
        // Agregar libros a la biblioteca
       

    }
    public void eliminarLibro(){
        //Eliminar libro de la biblioteca");
        // Obtener el libro con un ISBN específico
        Libro libroAEliminar = biblioteca.buscarLibro("978-3-16-148410-0");

        // Eliminar el libro de la biblioteca
        if (libroAEliminar != null) {
            biblioteca.eliminarLibro(libroAEliminar);
            System.out.println("Libro eliminado");
        } else {
            System.out.println("Libro no encontrado");
        }
    }
    public void modificarLibros(){
        //Modificar libros de la biblioteca");
        // Modificar los campos de un libro existente
        libro1.setTitulo("Nuevo título");
        libro1.setAutor("Nuevo autor");
        libro1.setIsbn("Nuevo ISBN");
        System.out.println("Libro modificado: "+libro1.getTitulo() + " " + libro1.getAutor() + " " + libro1.getIsbn());
    }  
    public void registrarUsuario(){
        //Registrar usuario en la biblioteca");
        // Aquí va el código para registrar un usuario
        Usuario usuario1 = new Usuario("1", "Juan Pérez");
        Usuario usuario2 = new Usuario("2", "Ana Sánchez");
        // Registrar los usuarios en la biblioteca
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);
        System.out.println("se agregó el usuario: "+usuario1.getNombre() + " " + usuario1.getId());
        System.out.println("se agregó el usuario: "+usuario2.getNombre() + " " + usuario2.getId());

    }   
    public void buscarUsuario(){
        //Buscar usuario en la biblioteca");
        //consultar usuario
        //primero agragar usuario
        Usuario usuario1 = new Usuario("1", "Juan Pérez");
        Usuario usuario2 = new Usuario("2", "Ana Sánchez");
        // Registrar los usuarios en la biblioteca
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);
        System.out.println("se agregó el usuario: "+usuario1.getNombre() + " " + usuario1.getId());
        System.out.println("se agregó el usuario: "+usuario2.getNombre() + " " + usuario2.getId());
        Usuario usuarioBuscado = biblioteca.buscarUsuario("1");
        if (usuarioBuscado != null) {
            System.out.println("ID: " + usuarioBuscado.getId());
            System.out.println("Nombre: " + usuarioBuscado.getNombre());
        } else {
            System.out.println("Usuario no encontrado");
        }
    }   
    public void eliminarUsuario(){
        Usuario usuario1 = new Usuario("1", "Juan Pérez");
        Usuario usuario2 = new Usuario("2", "Ana Sánchez");
        // Registrar los usuarios en la biblioteca
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);


        //Eliminar usuario de la biblioteca");
        // Obtener el usuario con un ID específico

        Usuario usuarioAEliminar = biblioteca.buscarUsuario("1");
        String idUsuarioAEliminar = usuarioAEliminar.getId();

        // Eliminar el usuario de la biblioteca
        if (usuarioAEliminar != null) {
            biblioteca.eliminarUsuario(idUsuarioAEliminar);
            System.out.println("Usuario eliminado");
        }
       
        
    }   
    public void prestarLibro(){
       //registro un usuario
        Usuario usuario2 = new Usuario("2", "Ana Sánchez");
        // Registrar los usuarios en la biblioteca
        //invoque al método registrarUsuario de la biblioteca
       
        
        //Prestar libro de la biblioteca");
        Usuario usuarioAprestar = new Usuario("2", "Ana Sánchez");
        System.out.println("el usuario "+usuarioAprestar.getNombre() + " con Id: " + usuarioAprestar.getId() + " solicitá un préstamo" ) ;
                         
       
                         
        
        // Prestar un libro a un usuario
        //busque el libro con isbn 978-3-16-148410-0
        Libro libroAPrestar = <coloque el código faltante>

        Usuario usuarioAPrestar = biblioteca.buscarUsuario("2");
        String idUsuarioAPrestar = usuarioAPrestar.getId();

        // Prestar el libro al usuario
        if (libroAPrestar != null && usuarioAPrestar != null) {
            biblioteca.prestarLibro(idUsuarioAPrestar, libroAPrestar);
            System.out.println("Libro prestado" + libroAPrestar.getTitulo() + " " + libroAPrestar.getAutor() + " " + libroAPrestar.getIsbn() + " " + usuarioAPrestar.getNombre() + " " + usuarioAPrestar.getId());

                           
        } else {
            System.out.println("Libro o usuario no encontrado");
        }
                  
    }   
    public void devolverLibro(){
        //Devolver libro a la biblioteca");
        // Buscar un libro en la biblioteca
        Libro libroBuscadoEstatus = biblioteca.buscarLibro("978-3-16-148410-0");
        

        // Comprobar el estado del libro
        if (libroBuscadoEstatus != null) {
            if (libroBuscadoEstatus.estaPrestado()) {
                System.out.println("El libro está prestado");
            } else {
                System.out.println("El libro está disponible");
            }
        } else {
            System.out.println("Libro no encontrado");
        }
    }   
    public void buscarLibro(){
        //Buscar un libro de la biblioteca");
        // Buscar un libro en la biblioteca
        Libro libroBuscado = biblioteca.buscarLibro("978-3-16-148410-0");

        // Comprobar el estado del libro
        if (libroBuscado != null) {
            if (libroBuscado.estaPrestado()) {
                System.out.println("El libro está prestado");
            } else {
                System.out.println("El libro está disponible");
            }
        } else {
            System.out.println("Libro no encontrado");
        }
    }   
    public void mostrarTodosLibros(){
        //Mostrar libros de la biblioteca");
        // Obtener todos los libros de la biblioteca
        TreeSet<Libro> libros = biblioteca.getLibros();

        // Mostrar cada libro y su estado
        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("ISBN: " + libro.getIsbn());
            if (libro.estaPrestado()) {
                System.out.println("Estado: Prestado");
            } else {
                System.out.println("Estado: Disponible");
            }
            System.out.println();
        }
    }   


    

}
