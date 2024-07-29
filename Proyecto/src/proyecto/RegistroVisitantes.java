/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author David
 */
public class RegistroVisitantes {
    private Visitante[] visitantes;
    private int contador;

    public RegistroVisitantes() {
        visitantes = new Visitante[10]; // Inicia con un arreglo de tamaño 10
        contador = 0;
        agregarVisitantesPrecargados(); // Agregar visitantes precargados al iniciar
    }

    public void agregarVisitante() { // Verificar si hay espacio en el arreglo para un nuevo visitante
        if (contador < visitantes.length) {
            Visitante visitante = new Visitante();
            visitante.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del visitante:"));
            visitante.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del visitante:")));
            visitante.setFechaIngreso("25/07/2024 10:00:00"); // Fecha fija

            visitantes[contador] = visitante;
            contador++;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más visitantes. Arreglo lleno.");
        }
    }

    public void mostrarVisitantes() {
        String resultado = "";
        for (int i = 0; i < contador; i++) { //Cadena con la información de cada visitante
            resultado += "Nombre: " + visitantes[i].getNombre() +
                         ", Edad: " + visitantes[i].getEdad() +
                         ", Fecha de Ingreso: " + visitantes[i].getFechaIngreso() + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void mostrarEstadisticas() {
        int totalVisitantes = contador;//total de visitantes agregados
        int totalNinos = 0;// Iniciador del contador de niños
        int totalAdultos = 0;// Iniciador del contador de adultos

        for (int i = 0; i < contador; i++) {
            if (visitantes[i].getEdad() < 18) {
                totalNinos++;
            } else {
                totalAdultos++;
            }
        }

        JOptionPane.showMessageDialog(null, "Total de visitantes: " + totalVisitantes +
                                            "\nTotal de niños: " + totalNinos +
                                            "\nTotal de adultos: " + totalAdultos);
    }

    private void agregarVisitantesPrecargados() {
        // visitantes precargados
        visitantes[0] = new Visitante("Juan Perez", 12, "25/07/2024 10:00:00");
        visitantes[1] = new Visitante("Maria Gomez", 25, "25/07/2024 11:00:00");
        visitantes[2] = new Visitante("Luis Rodriguez", 35, "25/07/2024 12:00:00");
        contador = 3; 
    }
}
}
