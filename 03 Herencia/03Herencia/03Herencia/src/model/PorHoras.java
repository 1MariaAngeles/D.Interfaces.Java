package model;
public class PorHoras extends Empleado {
    private double horasTrabajo;
    private double tarifaHoras;


    public PorHoras(){

    }
    
    public PorHoras(double horasTrabajo, double tarifaHoras) {
        this.horasTrabajo = horasTrabajo;
        this.tarifaHoras = tarifaHoras;
    }


    public PorHoras(String nombre, double salarioBase, double horasTrabajo, double tarifaHoras) {
        super(nombre, salarioBase);
        this.horasTrabajo = horasTrabajo;
        this.tarifaHoras = tarifaHoras;
    }


    public double getHorasTrabajo() {
        return horasTrabajo;
    }


    public void setHorasTrabajo(double horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }


    public double getTarifaHoras() {
        return tarifaHoras;
    }


    public void setTarifaHoras(double tarifaHoras) {
        this.tarifaHoras = tarifaHoras;
    }


    @Override
    public double calcularSalario() {
        double nuevoSalario = horasTrabajo * tarifaHoras;
        setSalarioBase(nuevoSalario);
        return nuevoSalario;
    }
   

    @Override
    public String toString() {
        return super.toString()+" horasTrabajo: " + horasTrabajo + ", tarifaHoras: " + tarifaHoras;
    }
    

}
