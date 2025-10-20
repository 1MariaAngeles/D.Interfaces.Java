package model;
public class Empleado{
    private String nombre;
    private double salarioBase;

    public Empleado(){

    }
    public Empleado(String nombre,double salarioBase ){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return this.salarioBase;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    @Override
    public String toString() {
        return "El nombre es " + this.nombre + " Salario Base: " + this.salarioBase;
    }

}
