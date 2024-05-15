package miTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datos.Biblioteca;
import datos.Libro;
import datos.Usuario;

import static org.junit.jupiter.api.Assertions.*;


class AppTest {
    private Biblioteca biblioteca;
    private Usuario usuario;
    private Libro libro;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        usuario = new Usuario("idUsuario", "Nombre");
        libro = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-3-16-148410-0");
        biblioteca.registrarUsuario(usuario);
        biblioteca.agregarLibro(libro);
    }

    @Test
    void testTomarPrestado() {
        biblioteca.prestarLibro("idUsuario", libro);
        assertTrue(usuario.getLibrosPrestados().contains(libro));
    }

    @Test
    void testTomarPrestadoLibroNoDisponible() throws Exception{
        Libro libroNoDisponible = new Libro("Libro no disponible", "Autor", "123-4-56-789012-3");
        assertThrows(IllegalArgumentException.class, () -> {
            biblioteca.prestarLibro("idUsuario", libroNoDisponible);
        });
    }

    @Test
    void testTomarPrestadoUsuarioNoExistente() {
        assertThrows(IllegalArgumentException.class, () -> {
            biblioteca.prestarLibro("idUsuarioNoExistente", libro);
        });
    }
    
    

    
}