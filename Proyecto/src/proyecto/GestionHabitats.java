package pruebaproyectos;

import javax.swing.JOptionPane;

class GestionHabitats {
    public String[][] habitats;
    public int maxHabitats;

    public GestionHabitats(int maxHabitats) {
        this.maxHabitats = maxHabitats;
        habitats = new String[maxHabitats][5];

        // Información precargada
        habitats[0] = new String[]{"1", "Selva Amazonica", "Selva", "1000", "america"};
        habitats[1] = new String[]{"2", "Desierto del Sahara", "Desierto", "500", "africa"};
        habitats[2] = new String[]{"3", "Arrecife de corales", "Acuatico", "1400", "oceano pacifico"};
    }

    public void agregarHabitat() {
        if (isFull()) {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más hábitats, capacidad máxima alcanzada.");
            return;
        }

        String id = JOptionPane.showInputDialog("Ingrese el ID del hábitat:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del hábitat:");
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo del hábitat:");
        String capacidad = JOptionPane.showInputDialog("Ingrese la capacidad del hábitat:");
        String ubicacion = JOptionPane.showInputDialog("Ingrese la ubicación del hábitat:");

        for (int i = 0; i < habitats.length; i++) {
            if (habitats[i][0] == null) {
                habitats[i][0] = id;
                habitats[i][1] = nombre;
                habitats[i][2] = tipo;
                habitats[i][3] = capacidad;
                habitats[i][4] = ubicacion;
                JOptionPane.showMessageDialog(null, "Hábitat agregado correctamente.");
                return;
            }
        }
    }

    public void consultarHabitats() {
        StringBuilder resultado = new StringBuilder("Lista de Hábitats:\n");
        for (int i = 0; i < habitats.length; i++) {
            if (habitats[i][0] != null) {
                resultado.append("ID: ").append(habitats[i][0])
                         .append("\nNombre: ").append(habitats[i][1])
                         .append("\nTipo: ").append(habitats[i][2])
                         .append("\nCapacidad: ").append(habitats[i][3])
                         .append("\nUbicación: ").append(habitats[i][4])
                         .append("\n------------------------\n");
            }
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    public void modificarHabitat() {
        String id = JOptionPane.showInputDialog("Ingrese el ID del hábitat a modificar:");
        for (int i = 0; i < habitats.length; i++) {
            if (habitats[i][0] != null && habitats[i][0].equals(id)) {
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del hábitat:");
                String nuevoTipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo del hábitat:");
                String nuevaCapacidad = JOptionPane.showInputDialog("Ingrese la nueva capacidad del hábitat:");
                String nuevaUbicacion = JOptionPane.showInputDialog("Ingrese la nueva ubicación del hábitat:");

                habitats[i][1] = nuevoNombre;
                habitats[i][2] = nuevoTipo;
                habitats[i][3] = nuevaCapacidad;
                habitats[i][4] = nuevaUbicacion;
                JOptionPane.showMessageDialog(null, "Hábitat modificado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Hábitat no encontrado.");
    }

    public void eliminarHabitat() {
        String id = JOptionPane.showInputDialog("Ingrese el ID del hábitat a eliminar:");
        for (int i = 0; i < habitats.length; i++) {
            if (habitats[i][0] != null && habitats[i][0].equals(id)) {
                for (int j = 0; j < habitats[i].length; j++) {
                    habitats[i][j] = null;
                }
                JOptionPane.showMessageDialog(null, "Hábitat eliminado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Hábitat no encontrado.");
    }

    private boolean isFull() {
        for (String[] habitat : habitats) {
            if (habitat[0] == null) {
                return false;
            }
        }
        return true;
    }
}
