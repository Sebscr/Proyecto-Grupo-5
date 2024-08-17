/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;


/**
 *
 * @author David
 */
public class Mapa {
 public Mapa() {
        this.Mapa = new String[][]{
            {"León", "Tigre", "Elefante"},
            {"Cebra", "Jirafa", "Hipopótamo"},
            {"Mono", "Oso", "Panda"},
            {"Cocodrilo", "Flamenco", "Pinguino"}
        };
    }private String[][] Mapa ;
public void displayZooMap() {
        StringBuilder mapDisplay = new StringBuilder();
        
        for (int i = 0; i < Mapa.length; i++) {
            for (int j = 0; j < Mapa[i].length; j++) {
                mapDisplay.append(Mapa[i][j]).append("\t");
            }
            mapDisplay.append("\n");
        }
        
        JOptionPane.showMessageDialog(null, mapDisplay.toString(), "Mapa del Zoológico", JOptionPane.INFORMATION_MESSAGE);
    }
}
    

