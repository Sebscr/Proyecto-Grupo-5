/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       //instancia de la clase RegistroVisitantes
        RegistroVisitantes registro = new RegistroVisitantes();
        
        //cadenas que contiene las opciones del menú
        String[] opciones = {"Agregar visitante", "Mostrar visitantes", "Mostrar estadísticas", "Salir"};
        
        int opcion = -1; // Inicializamos con un valor que no sea válido
        
        //bucle while
        while (opcion != 3) { // El índice 3 corresponde a "Salir"
            
            // Mostrar el menú y obtener la opción seleccionada
            opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción:",
                "Menú de Registro de Visitantes",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );
            
            // Ejecutar acción basada en la opción seleccionada
            switch (opcion) {
                case 0:
                    registro.agregarVisitante();
                    JOptionPane.showMessageDialog(null, "Visitante agregado exitosamente.");
                    break;
                case 1:
                    registro.mostrarVisitantes();
                    break;
                case 2:
                    registro.mostrarEstadisticas();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, intente de nuevo.");
            }
        }
    }

        //llamamos a los metodos en la clase main  
        
        GestionHabitats gestion = new GestionHabitats(10);

        gestion.consultarHabitats();

        gestion.agregarHabitat("4", "Desierto helado", "Desierto", "25", "Artartinda"); //Ponemos informacion precargada para el nuevo habitat

        gestion.consultarHabitats();

        gestion.modificarHabitat("1", "Selva Amazonica Modificada", "Selva Tropical", "1200", "Brasil"); ////Ponemos informacion precargada para el nuevo habitat

        gestion.consultarHabitats();

        gestion.eliminarHabitat("2");  //Eliminamos un habitad ya creado 

        gestion.consultarHabitats();  

