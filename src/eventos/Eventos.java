package eventos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class Eventos {
public static void main(String[] args) {
        int maxEventos = 10; // Numero maximo de eventos
        Evento[] eventos = new Evento[maxEventos];
        int contador = 0; // Contador para rastrear el número de eventos añadidos

        
        //Agregamos las opciones para el menú principal
        while (true) {
            String[] opciones = {"Agregar Evento", "Ver Eventos", "Modificar Evento", "Salir"};
             // Mostrar el menú principal y obtener la elección del usuario
            int eleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción",
                "Menú Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            if (eleccion == 0) { // Agregar Evento
                if (contador < maxEventos) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del evento:");
                    String fecha = JOptionPane.showInputDialog("Ingrese la fecha del evento (YYYY-MM-DD):");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del evento:"));
                    String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del evento:");
                    String localizacion = JOptionPane.showInputDialog("Ingrese la localización del evento:");
 // Crear un nuevo evento y añadirlo al arreglo
                    eventos[contador] = new Evento(nombre, fecha, id, descripcion, localizacion);
                    contador++;
                } else {
                    JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite máximo de eventos.");
                }
            } else if (eleccion == 1) { // Ver Eventos
                if (contador == 0) {
                    JOptionPane.showMessageDialog(null, "No hay eventos para mostrar.");
                } else {
                    for (int i = 0; i < contador; i++) {
                        eventos[i].mostrarInformacion();
                    }
                }
            } else if (eleccion == 2) { // Modificar Evento
                int idModificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del evento a modificar:"));
                boolean encontrado = false;
                for (int i = 0; i < contador; i++) {
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
                //En caso que no se encuentre ningun evento. "!" es no
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún evento con ese ID.");
                }
            } else if (eleccion == 3) { // Salir
                JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                break;
            }
        }
    }
}