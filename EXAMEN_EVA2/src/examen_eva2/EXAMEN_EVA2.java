/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_eva2;

/**
 *
 * @author acost
 */
public class EXAMEN_EVA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("Juan", 3000);
        EmpleadoPorHora empleado2 = new EmpleadoPorHora(50, "Marlen", 3000);
        EmpleadosPorContrato empleado3 = new EmpleadosPorContrato("Sofia", 3000);  
        
        imprimirDatos(empleado1);
        imprimirDatos(empleado2);
        imprimirDatos(empleado3);
        
    }
    public static void imprimirDatos(Empleado empleado) {
        System.out.println("Nombre: " + empleado.getNombre() + ", Salario Anual: " + empleado.calcularSalarioAnual());
    }
    }
    

