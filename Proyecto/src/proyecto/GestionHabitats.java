package pruebaproyectos;

import javax.swing.JOptionPane;

public class GestionHabitats {
    public String[][] habitats;  // Lista para almacenar información sobre diferentes hábitats
    public int contador; // Número de hábitats actuales en la lista

    public GestionHabitats() {
        habitats = new String[10][5]; // Creamos una lista para 10 hábitats, cada uno con 5 detalles
        contador = 0; // Comenzamos con cero hábitats agregados
        agregarHabitatsPrecargados(); // Agregamos algunos hábitats de ejemplo al iniciar
    }

    public void agregarHabitat() {
        // Revisamos si todavía hay espacio para más hábitats
        if (contador < habitats.length) {
            // Pedimos al usuario que ingrese detalles sobre el nuevo hábitat
            String id = JOptionPane.showInputDialog("Ingrese el ID del hábitat:");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del hábitat:");
            String tipo = JOptionPane.showInputDialog("Ingrese el tipo del hábitat:");
            String capacidad = JOptionPane.showInputDialog("Ingrese la capacidad del hábitat:");
            String ubicacion = JOptionPane.showInputDialog("Ingrese la ubicación del hábitat:");

            // Guardamos la información del nuevo hábitat en la lista
            habitats[contador][0] = id;
            habitats[contador][1] = nombre;
            habitats[contador][2] = tipo;
            habitats[contador][3] = capacidad;
            habitats[contador][4] = ubicacion;
            contador++; // Aumentamos el número de hábitats
        } else {
            // Si no hay espacio, mostramos un mensaje al usuario
            JOptionPane.showMessageDialog(null, "No se pueden agregar más hábitats. Arreglo lleno.");
        }
    }

    public void consultarHabitats() {
        String resultado = ""; // Variable para almacenar los detalles de todos los hábitats
        for (int i = 0; i < contador; i++) {
            // Añadimos la información de cada hábitat a la variable resultado
            resultado += "ID: " + habitats[i][0] +
                         ", Nombre: " + habitats[i][1] +
                         ", Tipo: " + habitats[i][2] +
                         ", Capacidad: " + habitats[i][3] +
                         ", Ubicación: " + habitats[i][4] + "\n";
        }
        // Mostramos todos los hábitats al usuario
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void modificarHabitat() {
        // Pedimos al usuario el ID del hábitat que quiere cambiar
        String id = JOptionPane.showInputDialog("Ingrese el ID del hábitat a modificar:");
        for (int i = 0; i < contador; i++) {
            // Buscamos el hábitat con el ID dado
            if (habitats[i][0].equals(id)) {
                // Pedimos al usuario que ingrese los nuevos detalles del hábitat
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del hábitat:");
                String nuevoTipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo del hábitat:");
                String nuevaCapacidad = JOptionPane.showInputDialog("Ingrese la nueva capacidad del hábitat:");
                String nuevaUbicacion = JOptionPane.showInputDialog("Ingrese la nueva ubicación del hábitat:");

                // Actualizamos la información del hábitat en la lista
                habitats[i][1] = nuevoNombre;
                habitats[i][2] = nuevoTipo;
                habitats[i][3] = nuevaCapacidad;
                habitats[i][4] = nuevaUbicacion;
                // Mostramos un mensaje confirmando la modificación
                JOptionPane.showMessageDialog(null, "Hábitat modificado correctamente.");
                return; // Salimos del método ya que hemos terminado de modificar
            }
        }
        // Si no encontramos el hábitat, mostramos un mensaje al usuario
        JOptionPane.showMessageDialog(null, "Hábitat no encontrado."); //validamos que el número esté entre uno y cuatro 
    }

    public void eliminarHabitat() {
        // Pedimos al usuario el ID del hábitat que quiere eliminar
        String id = JOptionPane.showInputDialog("Ingrese el ID del hábitat a eliminar:");
        for (int i = 0; i < contador; i++) {
            // Buscamos el hábitat con el ID dado
            if (habitats[i][0].equals(id)) {
                // Eliminamos el hábitat estableciendo sus detalles a null
                for (int j = 0; j < habitats[i].length; j++) {
                    habitats[i][j] = null;
                }
                // Desplazamos los hábitats restantes para llenar el espacio vacío
                for (int k = i; k < contador - 1; k++) {
                    habitats[k] = habitats[k + 1];
                }
                contador--; // Disminuimos el número de hábitats
                // Mostramos un mensaje confirmando la eliminación
                JOptionPane.showMessageDialog(null, "Hábitat eliminado correctamente.");
                return; // Salimos del método ya que hemos terminado de eliminar
            }
        }
        // Si no encontramos el hábitat, mostramos un mensaje al usuario
        JOptionPane.showMessageDialog(null, "Hábitat no encontrado.");
    }

    private void agregarHabitatsPrecargados() {
        // Agregamos algunos hábitats de ejemplo para comenzar
        habitats[0] = new String[]{"1", "Selva Amazonica", "Selva", "1000", "america"};
        habitats[1] = new String[]{"2", "Desierto del Sahara", "Desierto", "500", "africa"};
        habitats[2] = new String[]{"3", "Arrecife de corales", "Acuatico", "1400", "oceano pacifico"};
        contador = 3; // Establecemos que comenzamos con tres hábitats
    }
}

