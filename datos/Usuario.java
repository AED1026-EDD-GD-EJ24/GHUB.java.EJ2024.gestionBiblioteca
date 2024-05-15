package datos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Usuario {
    private String id;
    private String nombre;
    //crea una LinkedList de libros que el usuario espera y nómbrela librosEsperando

    //crea un ArrayList de libros que el usuario tiene prestados y nómbrela librosPrestados
   

    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.librosEsperando = new LinkedList<>();
        this.librosPrestados = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    //retorne una LinkedList de libros que el usuario espera

    public <coloque el código faltabte> getLibrosEsperando() {
        return librosEsperando;
    }

    //retorne un ArrayList de libros que el usuario tiene prestados
    public <coloque el código faltante> getLibrosPrestados() {
        return librosPrestados;
    }

    public void tomarPrestado(Libro libro) {
        
        //agregue el libro a la lista de libros prestados
       
    }

    public void devolver(Libro libro) {
        //remueva el libro de la lista de libros prestados
        
    }

    public void esperarLibro(Libro libro) {
        //agregue el libro a la lista de libros esperando
        
    }

    public void recibirLibro() {
        if (!librosEsperando.isEmpty()) {
            tomarPrestado(librosEsperando.removeFirst());
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", librosEsperando=" + librosEsperando +
                ", librosPrestados=" + librosPrestados +
                '}';
    }
}