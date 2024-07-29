/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author David
 */
public class GestionHabitats {
    public String id;
    public String nombre;
    public String tipo;
    public String capacidad;
    public String ubicacion;
    public String[][] habitats;
    public int maxHabitats;

//Creamos los constructores
    public GestionHabitats(int maxHabitats) {
        this.maxHabitats = maxHabitats;
        habitats = new String[maxHabitats][5];

        // Ponemos la informacion precargada 
        habitats[0] = new String[]{"1", "Selva Amazonica", "Selva", "1000", "america"};
        habitats[1] = new String[]{"2", "Desierto del Sahara", "Desierto", "500", "africa"};
        habitats[2] = new String[]{"3", "Arrecife de corales", "Acuatico", "1400", "oceano pacifico"};
    }

    // Aca lo que hacemos es agregar nuevos habitats con los metodos 
    public void agregarHabitat(String id, String nombre, String tipo, String capacidad, String ubicacion) {
        for (int i = 0; i < habitats.length; i++) {
            if (habitats[i][0] == null) {
                habitats[i][0] = id;
                habitats[i][1] = nombre;
                habitats[i][2] = tipo;
                habitats[i][3] = capacidad;
                habitats[i][4] = ubicacion;
                System.out.println("Habitat agregado correctamente.");
                return;
            }
        }
        System.out.println("No se pueden agregar más habitats, capacidad máxima alcanzada.");
    }

    // Creamos un metodo para imprimir la informacion
    public void consultarHabitats() {
        System.out.println("Lista de Habitats:");
        for (int i = 0; i < habitats.length; i++) {
            if (habitats[i][0] != null) {
                System.out.println("ID: " + habitats[i][0]);
                System.out.println("Nombre: " + habitats[i][1]);
                System.out.println("Tipo: " + habitats[i][2]);
                System.out.println("Capacidad: " + habitats[i][3]);
                System.out.println("Ubicacion: " + habitats[i][4]);
                System.out.println("------------------------");
            }
        }
    }

    // Metodos para comparar los habitats  
    public void modificarHabitat(String id, String nuevoNombre, String nuevoTipo, String nuevaCapacidad, String nuevaUbicacion) {
        for (int i = 0; i < habitats.length; i++) {
            if (habitats[i][0] != null && habitats[i][0] == id) { // Comparación de IDs sin .equals
                habitats[i][1] = nuevoNombre;
                habitats[i][2] = nuevoTipo;
                habitats[i][3] = nuevaCapacidad;
                habitats[i][4] = nuevaUbicacion;
                System.out.println("Habitat modificado correctamente.");
                return;
            }
        }
        System.out.println("Habitat no encontrado.");
    }

    // Creamos un metodo para eliminar habitats 
    public void eliminarHabitat(String id) {
        for (int i = 0; i < habitats.length; i++) {
            if (habitats[i][0] != null && habitats[i][0] == id) {
                for (int j = 0; j < habitats[i].length; j++) {
                    habitats[i][j] = null;
                }
                System.out.println("Habitat eliminado correctamente.");
                return;
            }
        }
        System.out.println("Habitat no encontrado.");
    }

    
    
}
