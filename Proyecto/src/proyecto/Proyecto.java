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

/*
       private static void gestionarEventos() {
        Evento[] eventos = new Evento[10];
        int numEventos = 0;
        String[] opciones = {"Agregar Evento", "Ver Eventos", "Modificar Evento", "Eliminar Evento", "Volver"};
        int opcion = -1;

        while (opcion != 4) { // "Volver"
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Gestión de Eventos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (opcion) {
                case 0:
                    if (numEventos < eventos.length) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del evento:");
                        String fecha = JOptionPane.showInputDialog("Ingrese la fecha del evento (YYYY-MM-DD):");
                        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del evento:"));
                        String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del evento:");
                        String localizacion = JOptionPane.showInputDialog("Ingrese la localización del evento:");
                        eventos[numEventos++] = new Evento(nombre, fecha, id, descripcion, localizacion);
                    } else {
                        JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite máximo de eventos.");
                    }
                    break;
                case 1:
                    if (numEventos == 0) {
                        JOptionPane.showMessageDialog(null, "No hay eventos para mostrar.");
                    } else {
                        StringBuilder info = new StringBuilder();
                        for (int i = 0; i < numEventos; i++) {
                            info.append(eventos[i].toString()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, info.toString());
                    }
                    break;
                case 2:
                    int idModificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del evento a modificar:"));
                    boolean encontrado = false;
                    for (int i = 0; i < numEventos; i++) {
                        if (eventos[i].getId() == idModificar) {
                            String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del evento:");
                            String nuevaFecha = JOptionPane.showInputDialog("Ingrese la nueva fecha del evento (YYYY-MM-DD):");
                            String nuevaDescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripción del evento:");
                            String nuevaLocalizacion = JOptionPane.showInputDialog("Ingrese la nueva localización del evento:");

                            eventos[i].setNombre(nuevoNombre);
                            eventos[i].setFecha(nuevaFecha);
                            eventos[i].setDescripcion(nuevaDescripcion);
                            eventos[i].setLocalizacion(nuevaLocalizacion);

                            encontrado = true;
                            JOptionPane.showMessageDialog(null, "Evento modificado con éxito.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún evento con ese ID.");
                    }
                    break;
                case 3:
                    int idEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del evento a eliminar:"));
                    encontrado = false;
                    for (int i = 0; i < numEventos; i++) {
                        if (eventos[i].getId() == idEliminar) {
                            for (int j = i; j < numEventos - 1; j++) {
                                eventos[j] = eventos[j + 1];
                            }
                            eventos[--numEventos] = null;
                            encontrado = true;
                            JOptionPane.showMessageDialog(null, "Evento eliminado con éxito.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún evento con ese ID.");
                    }
                    break;
            }
        }
    }*/
        
    }