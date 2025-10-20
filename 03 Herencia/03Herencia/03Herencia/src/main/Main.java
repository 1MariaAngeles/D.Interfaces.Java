package main;

import java.time.temporal.JulianFields;

import model.Empleado;
import model.PorHoras;
import model.TiempoCompleto;

public class Main {
    public static void main(String[] args) throws Exception {
        Empleado arrayEmpleado[] = new Empleado[6];

        //Creare 2 de cada
        //Empleado
        Empleado e1Empleado = new Empleado("Julian", 2000);
        Empleado e2Empleado = new Empleado("Maria", 1500);
        //Empleado por Horas - Como no tiene salario base lo dejo en 0
        PorHoras e3EmpleadHoras = new PorHoras("Ana", 0, 4, 17);
        PorHoras e4EmpleadHoras = new PorHoras("Mateo", 0, 8, 8);
        //Empleado a tiempo Completo
        TiempoCompleto e5TiempoCompleto = new TiempoCompleto("Carlos", 1500, 2, 9);
        TiempoCompleto e6TiempoCompleto = new TiempoCompleto("Esther", 2000, 9, 12);

        arrayEmpleado[0] = e1Empleado;
        arrayEmpleado[1] = e2Empleado;
        arrayEmpleado[2] = e3EmpleadHoras;
        arrayEmpleado[3] = e4EmpleadHoras;
        arrayEmpleado[4] = e5TiempoCompleto;
        arrayEmpleado[5] = e6TiempoCompleto;

        for (Empleado empleado : arrayEmpleado) {
            System.out.println(empleado.toString());
            System.out.println("Salario calculado: " + empleado.calcularSalario());
        }

    
    }
}
