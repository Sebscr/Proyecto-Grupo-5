/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import proyecto.Alimentacion;
import proyecto.RegistroVisitantes;
import proyecto.Evento;
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
        String[] opciones = {"Agregar visitante", "Mostrar visitantes", "Mostrar estadisticas", "Salir"};
        
        int opcion = -1; // Inicializamos con un valor que no sea valido
        
        //bucle while
        while (opcion != 3) { // El indice 3 corresponde a "Salir"
            
            // Mostrar el menú y obtener la opcion seleccionada
            opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opcion:",
                "Menú de Registro de Visitantes",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );
            
            // Ejecutar accion basada en la opcion seleccionada
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
                    JOptionPane.showMessageDialog(null, "Opcion inválida. Por favor, intente de nuevo.");
            }
        }
    }
    // Creamos una instancia de la clase GestionHabitats para manejar los habitats
    GestionHabitats gestionHabitats = new GestionHabitats();
    boolean continuar = true; // Variable para controlar el bucle del menú

    // Bucle que se ejecuta mientras el usuario quiera seguir usando el sistema
    while (continuar) {
        // Mostramos un menú al usuario y le pedimos que seleccione una opcion
        String opcion = JOptionPane.showInputDialog(
            "Seleccione una opcion:\n" +
            "1. Agregar Habitat\n" +
            "2. Consultar Habitats\n" +
            "3. Modificar Habitat\n" +
            "4. Eliminar Habitat\n" +
            "5. Salir"
        );

        // Usamos un switch para manejar la opcion seleccionada por el usuario
        switch (opcion) {
            case "1":
                // Si el usuario selecciona "1", llamamos al metodo para agregar un nuevo habitat
                gestionHabitats.agregarHabitat();
                break;
            case "2":
                // Si el usuario selecciona "2", llamamos al metodo para consultar todos los habitats
                gestionHabitats.consultarHabitats();
                break;
            case "3":
                // Si el usuario selecciona "3", llamamos al metodo para modificar un habitat existente
                gestionHabitats.modificarHabitat();
                break;
            case "4":
                // Si el usuario selecciona "4", llamamos al metodo para eliminar un habitat
                gestionHabitats.eliminarHabitat();
                break;
            case "5":
                // Si el usuario selecciona "5", salimos del bucle y terminamos el programa
                continuar = false;
                break;
            default:
                // Si la opcion ingresada no es valida, mostramos un mensaje de error
                JOptionPane.showMessageDialog(null, "Opcion no valida. Intente de nuevo.");
        }
    }
    // Cuando el bucle termina, mostramos un mensaje de despedida
    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema de gestion de habitats.");



      private static void gestionarEventos() {
        Evento[] eventos = new Evento[10];
        int numEventos = 0;
        String[] opciones = {"Agregar Evento", "Ver Eventos", "Modificar Evento", "Eliminar Evento", "Volver"};
        int opcion = -1;

        while (opcion != 4) { // "Volver"
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opcion:",
                    "Gestion de Eventos",
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
                        String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del evento:");
                        String localizacion = JOptionPane.showInputDialog("Ingrese la localizacion del evento:");
                        eventos[numEventos++] = new Evento(nombre, fecha, id, descripcion, localizacion);
                    } else {
                        JOptionPane.showMessageDialog(null, "Se ha alcanzado el limite maximo de eventos.");
                    }
                    break;
              /*  case 1:
                    if (numEventos == 0) {
                        JOptionPane.showMessageDialog(null, "No hay eventos para mostrar.");
                 //falta por completar 
                        }
                        JOptionPane.showMessageDialog(null, info.toString());
                    }
                    break;
                    */
                case 2:
                    int idModificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del evento a modificar:"));
                    boolean encontrado = false;
                    for (int i = 0; i < numEventos; i++) {
                        if (eventos[i].getId() == idModificar) {
                            String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del evento:");
                            String nuevaFecha = JOptionPane.showInputDialog("Ingrese la nueva fecha del evento (YYYY-MM-DD):");
                            String nuevaDescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripcion del evento:");
                            String nuevaLocalizacion = JOptionPane.showInputDialog("Ingrese la nueva localizacion del evento:");

                            eventos[i].setNombre(nuevoNombre);
                            eventos[i].setFecha(nuevaFecha);
                            eventos[i].setDescripcion(nuevaDescripcion);
                            eventos[i].setLocalizacion(nuevaLocalizacion);

                            encontrado = true;
                            JOptionPane.showMessageDialog(null, "Evento modificado con exito.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "No se encontro ningún evento con ese ID.");
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
                            JOptionPane.showMessageDialog(null, "Evento eliminado con exito.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "No se encontro ningún evento con ese ID.");
                    }
                    break;
            }
        }
    }*/
      int RegistroAlimentacion= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de registros que desea crear: "));
        Alimentacion[] arrAlimentacion = new Alimentacion[RegistroAlimentacion];
        for (int i=0; i < RegistroAlimentacion; i++){  
            int horario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de alimentacion de los animales para el registro " + (i + 1) + ": "));
            String alimentos = JOptionPane.showInputDialog(null, "Ingrese los alimentos que consumen los animales para el registro " + (i + 1) + ": ");
            String frecuenciaAlimentacion = JOptionPane.showInputDialog(null, "Ingrese la frecuencia de alimentacion en horas de los animales para el registro " + (i + 1) + ": ");
            double cantidadAlimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de alimento en kg para el registro " + (i + 1) + ": "));
            arrAlimentacion [i]= new Alimentacion(horario,alimentos,frecuenciaAlimentacion,cantidadAlimento);
        }
        for (int i=0; i< RegistroAlimentacion; i++){
            JOptionPane.showMessageDialog(null,"La hora de alimentacion es a las: "+arrAlimentacion[i].getHorario()+
                    " Este animal consume: "+arrAlimentacion[i].getAlimentos()+
                    " Este animal come cada: "+arrAlimentacion[i].getFrecuenciaalimentacion()+
                    " horas"+" Este animal come (kilos): "+arrAlimentacion[i].getCantidadalimento());
        }
        
    }
