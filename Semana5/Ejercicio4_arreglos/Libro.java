package Ejercicio4_arreglos;

public class Libro {

    private String titulo;
    private int precio;
    private int estado;
    Prestamo[] prestamos;

    public String getTitulo() {
        return titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getEstado() {
        return estado;
    }

    public Libro(String titulo, int precio, int estado, int cantidadPrestamos) {
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
        this.prestamos = new Prestamo[cantidadPrestamos];

    }

    public void agregarPrestamo(Prestamo nuevoPrestamo) {
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] == null) {

                prestamos[i] = nuevoPrestamo;
                break;
            }

        }
    }

    public String listadoSolicitantes() {
        String listado = "";

        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] != null) {

                listado += (i + 1) + " - " + prestamos[i].getSolicitante() + "\n";
            }
        }
        return listado;
    }

    public int cantidadPrestamos() {
        int contador = 0;
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] != null) {
                contador++;
            }
        }
        return contador;
    }

    public boolean libroDevuelto(int valor) {
        boolean devuelto = false;
        if (valor == 1) {
            devuelto = true;

        } else if (valor == 2) {
            devuelto = false;
        }
        return devuelto;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", precio=" + precio + ", estado=" + estado + ", prestamos=" + prestamos + '}';
    }

}
