package Ejercicio2_arreglos;

public class Cliente {

    int nroCliente;
    String nombre;
    int antiguedad;
    int mascota;
    String nombreMascota;
    int edadMascota;

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getMascota() {
        return mascota;
    }

    public void setMascota(int mascota) {
        this.mascota = mascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public Cliente(int nroCliente, String nombre, int antiguedad, int mascota, String nombreMascota, int edadMascota) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.mascota = mascota;
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }

    public double calcularPromedio(int acumulador, int contador) {
        double promedio = 0;
        promedio = acumulador / contador;
        return promedio;

    }

    @Override
    public String toString() {
        return "\n***********Cliente**********"
                + "\nNumero de Cliente: " + nroCliente
                + "\nNombre: " + nombre
                + "\nAntiguedad: " + antiguedad
                + "\nMascota: " + mascota
                + "\nNombre de la Mascota: " + nombreMascota
                + "\nEdad de la Mascota: " + edadMascota;
    }

}
