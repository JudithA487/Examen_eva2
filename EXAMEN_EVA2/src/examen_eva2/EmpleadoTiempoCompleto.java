/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_eva2;

/**
 *
 * @author acost
 */
public class EmpleadoTiempoCompleto extends Empleado {
    
    public EmpleadoTiempoCompleto(String nombre, double salarioBase){
     super(nombre, salarioBase);      
    }
    @Override
    public double calcularSalarioAnual() {
        return salarioBase * 12 + (salarioBase * 12 * 0.10); // Incluye 10% de bono
    }
   
}
