package ui;

import java.util.Scanner;


public class Menu {
    static Scanner entrada = new  Scanner(System.in);
	
	static MenuOpciones  iOpc = new MenuOpciones();
	static int opcion;
		
	public void lectura() throws Exception {
			
		imprimirMenu();	
				
	}
    private static void imprimirMenu() throws Exception {
        String opcion;

        while (true) {
              System.out.println("\t ***************************************");
              System.out.println("\t              MENU PRINCIPAL");
              System.out.println("\t ***************************************");
              System.out.println("\t 1. Agregar libro a la biblioteca");
              System.out.println("\t 2. Eliminar libro de la biblioteca");
              System.out.println("\t 3. Modificar libros de la biblioteca");
              System.out.println("\t 4. Registrar usuario en la biblioteca");
              System.out.println("\t 5. Buscar usuario en la biblioteca");
              System.out.println("\t 6. Eliminar usuario de la biblioteca");
              System.out.println("\t 7. Prestar libro de la biblioteca");
              System.out.println("\t 8. Devolver libro a la biblioteca");
              System.out.println("\t 9. Buscar un libro de la biblioteca");
              System.out.println("\t10. Mostrar libros de la biblioteca");
              System.out.println();
              System.out.println("\t99. Salir");
              System.out.print("Seleccione una opción: ");
              opcion = entrada.nextLine();
  
              switch (opcion) {
                    case "1":
                        iOpc.agregarLibro();
                        break;
                    case "2":
                       iOpc.eliminarLibro();                       
                        break;
                    case "3":
                        iOpc.modificarLibros();
                        break;
                    case "4":
                        iOpc.registrarUsuario();
                        break;
                    case "5":
                        iOpc.buscarUsuario();
                        break;
                    case "6":
                        iOpc.eliminarUsuario();
                        break;
                    case "7":
                        iOpc.prestarLibro();
                        break;
                    case "8":
                        iOpc.devolverLibro();
                        break;
                    case "9":
                        iOpc.buscarLibro();
                        break;
                    case "10":
                        iOpc.mostrarTodosLibros();
                        break;
                  case "99":
                      salir();
                  default:
                      System.out.println("Opción no válida. Por favor, intente de nuevo.");
              }
          } 

    
        }
    private static void salir() {
        System.out.println("Sesion Finalizada");
        System.out.println("Adios!");
        System.exit(0);
    }

}
    

