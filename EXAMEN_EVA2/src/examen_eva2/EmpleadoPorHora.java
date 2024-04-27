/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_eva2;

/**
 *
 * @author acost
 */
public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;
    public EmpleadoPorHora(int horasTrabajadas, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }   

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalarioAnual() {
        return salarioBase * horasTrabajadas * 52; 
    }
  
}

    

