package Ejercicio4_arreglos;

public class Biblioteca {

    Libro libros[];

    public Biblioteca(int cantidadLibros) {
        this.libros = new Libro[cantidadLibros];
    }

    public void agregarLibro(Libro nuevoLibro) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {

                libros[i] = nuevoLibro;
                break;
            }

        }
    }

    public int cantidadLibros() {
        int contador = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                contador++;
            }
        }
        return contador;
    }

    public String cantidadLibrosPorEstado() {
        int[] contadorPosiciones = new int[3];
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                switch (libros[i].getEstado()) {

                    case 1:
                        contadorPosiciones[0]++;
                        break;
                    case 2:
                        contadorPosiciones[1]++;
                        break;
                    case 3:
                        contadorPosiciones[2]++;
                        break;
                }
            }
        }
        return "\nDisponibles: " + contadorPosiciones[0] + "\nPrestados: " + contadorPosiciones[1] + "\nExtraviados: " + contadorPosiciones[2];

    }

    public float promedioPrestasmo() {
        int acumulador = 0;
        int contador = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                acumulador += libros[i].cantidadPrestamos();
                contador++;
            }
        }
        return (float) acumulador / contador;
    }

    public float sumaPrecioExtravido() {
        float acumulador = 0f;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getEstado() == 3) {
                acumulador += libros[i].getPrecio();

            }
        }
        return acumulador;
    }

    
    

}
