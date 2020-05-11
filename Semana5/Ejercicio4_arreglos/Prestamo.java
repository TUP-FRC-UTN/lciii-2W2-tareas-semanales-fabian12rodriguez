package Ejercicio4_arreglos;

public class Prestamo {

    private String solicitante;
    private int cantidadDias;
    private boolean devuelto;

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public Prestamo(String solicitante, int cantidadDias, boolean devuelto) {
        this.solicitante = solicitante;
        this.cantidadDias = cantidadDias;
        this.devuelto = devuelto;
    }

  

    @Override
    public String toString() {
        return "\nPersona solicitante ->" 
                + "\nSolicitante: " + solicitante 
                + "\nCantidad de dias: " + cantidadDias 
                + "\nDevuelto: " + devuelto;
    }

}
