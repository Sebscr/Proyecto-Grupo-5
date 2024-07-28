/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;
import java.util.Date;
/**
 *
 * @author David
 */
public class Visitante {
    private String nombre;
    private int edad;
    private Date fechaIngreso;

    public Visitante(String nombre, int edad, Date fechaIngreso) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }
}
