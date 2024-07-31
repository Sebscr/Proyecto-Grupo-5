/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author sebas
 */
import javax.swing.JOptionPane;
public class Alimentacion {
    private int horario;
    private String alimentos;
    private String frecuenciaalimentacion;
    private double cantidadalimento; 
    
    public Alimentacion (int horario, String alimentos, String frecuenciaalimentacion, double cantidadalimento){
        this.horario = horario;
        this.alimentos = alimentos;
        this.frecuenciaalimentacion = frecuenciaalimentacion;
        this.cantidadalimento = cantidadalimento;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(String alimentos) {
        this.alimentos = alimentos;
    }

    public String getFrecuenciaalimentacion() {
        return frecuenciaalimentacion;
    }

    public void setFrecuenciaalimentacion(String frecuenciaalimentacion) {
        this.frecuenciaalimentacion = frecuenciaalimentacion;
    }

    public double getCantidadalimento() {
        return cantidadalimento;
    }

    public void setCantidadalimento(double cantidadalimento) {
        this.cantidadalimento = cantidadalimento;
    }

    
}
