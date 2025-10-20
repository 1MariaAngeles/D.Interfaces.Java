package model;
public class TiempoCompleto extends Empleado{
    private double horasExtra;
    private double tarifaHorasExtra=17;

    public TiempoCompleto() {

     }

    public TiempoCompleto(double horasExtra, double tarifaHorasExtra) {
        this.horasExtra = horasExtra;
        this.tarifaHorasExtra = tarifaHorasExtra;
    }

    public TiempoCompleto(String nombre, double salarioBase, double horasExtra, double tarifaHorasExtra) {
        super(nombre, salarioBase);
        this.horasExtra = horasExtra;
        this.tarifaHorasExtra = tarifaHorasExtra;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getTarifaHorasExtra() {
        return tarifaHorasExtra;
    }

    public void setTarifaHorasExtra(double tarifaHorasExtra) {
        this.tarifaHorasExtra = tarifaHorasExtra;
    }

    @Override
    public double calcularSalario() {
        double pagoExtra = horasExtra * tarifaHorasExtra;
        return getSalarioBase() + pagoExtra;
    }

    @Override
    public String toString() {
        return super.toString() + ", horasExtra: " + horasExtra + ", tarifaHorasExtra: " + tarifaHorasExtra;
    }
}
