/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_eva2;

/**
 *
 * @author acost
 */
public class EmpleadosPorContrato extends Empleado{

      @Override
    public double calcularSalarioAnual() {
        return salarioBase * 12; 
    }
 

    public EmpleadosPorContrato(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }
    
    public class EmpleadoPorContrato extends Empleado {
    public EmpleadoPorContrato(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalarioAnual() {
        return salarioBase * 12; 
    }
   
}

    
    
}
