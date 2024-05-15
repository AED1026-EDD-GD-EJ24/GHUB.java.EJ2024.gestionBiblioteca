package datos;
//coloque la directiva de importación necesaria

public class Biblioteca {
    //crea un TreeSet de libros y nómbrelo libros

    //crea una Hashtable de usuarios y nómbrela usuarios
   
    private Hashtable<String, Usuario> usuarios;


    public Biblioteca() {
        this.libros = new TreeSet<>();
        this.usuarios = new Hashtable<>();
    }

    public TreeSet<Libro> getLibros() {
        return this.libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public void eliminarUsuario(String id) {
        usuarios.remove(id);
    }

    public void prestarLibro(String idUsuario, Libro libro) {
        //obtenga el usuario con el id proporcionado
        Usuario usuario = <coloque el código faltante>;
        if (usuario == null) {
            throw new IllegalArgumentException("El usuario no existe");
        }
    
        boolean libroEncontrado = false;
        for (Libro libroEnBiblioteca : libros) {
            if (libroEnBiblioteca.getIsbn().equals(libro.getIsbn())) {
                usuario.tomarPrestado(libroEnBiblioteca);
                libros.remove(libroEnBiblioteca);
                libroEncontrado = true;
                break;
            }
        }
    
        if (!libroEncontrado) {
            throw new IllegalArgumentException("El libro no está disponible");
        }
        
        

    }

    public void devolverLibro(String idUsuario, Libro libro) {
        usuarios.get(idUsuario).devolver(libro);
        //agregue el libro a la lista de libros de la biblioteca
       
    }

    public Usuario buscarUsuario(String id) {
        return this.getUsuarios().get(id);
       
    }

    public Libro buscarLibro(String isbn) {
        for (Libro libro : this.getLibros()) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public Hashtable<String, Usuario> getUsuarios() {
        return this.usuarios;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "libros=" + libros +
                ", usuarios=" + usuarios +
                '}';
    }
}