package datos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Usuario {
    private String id;
    private String nombre;
    private LinkedList<Libro> librosEsperando;
    private ArrayList<Libro> librosPrestados;

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

    public LinkedList<Libro> getLibrosEsperando() {
        return librosEsperando;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void tomarPrestado(Libro libro) {
        
        librosPrestados.add(libro);
    }

    public void devolver(Libro libro) {
        librosPrestados.remove(libro);
    }

    public void esperarLibro(Libro libro) {
        librosEsperando.add(libro);
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