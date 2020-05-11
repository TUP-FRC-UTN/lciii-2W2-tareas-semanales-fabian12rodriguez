package Ejercicio4_arreglos;

import java.util.Scanner;

public class Main_principal {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int cantidadLibros;
        System.out.println("Ingrese la cantidad de libros de la biblioteca: ");
        cantidadLibros = lector.nextInt();
        Biblioteca b = new Biblioteca(cantidadLibros);
        if (cantidadLibros != 0) {

            for (int i = 0; i < cantidadLibros; i++) {
                lector.nextLine();
                System.out.println("Ingrese titulo del libro: ");
                String titulo = lector.nextLine();
                System.out.println("Ingrese precio del libro: ");
                int precio = lector.nextInt();
                System.out.println("Ingrese estado del libro.\n 1-Disponible 2-Prestado 3-Extraviado: ");
                int estado = lector.nextInt();
                System.out.println("Ingresa la cantidad de veces que fue prestado: ");
                int prestamos = lector.nextInt();
                Libro nuevolibro = new Libro(titulo, precio, estado, prestamos);
                b.agregarLibro(nuevolibro);

                if (prestamos != 0) {
                    for (int j = 0; j < prestamos; j++) {
                        lector.nextLine();
                        System.out.println("Ingrese el nombre del solicitante: ");
                        String solicitante = lector.nextLine();
                        System.out.println("Ingrese cantidad de dias del prestamo: ");
                        int cantidadDias = lector.nextInt();
                        System.out.println("Fue devuelto el libro? 1-Si 2-No: ");
                        int devolucion = lector.nextInt();
                        Prestamo prestamoNuevo = new Prestamo(solicitante, cantidadDias, nuevolibro.libroDevuelto(devolucion));
                        nuevolibro.agregarPrestamo(prestamoNuevo);

                    }
                }

            }
            System.out.println("\n*****Cantidad de libros por estado: " + b.cantidadLibrosPorEstado());
            System.out.println("\n*****Precio total por la suma de extraviados: " + b.sumaPrecioExtravido());
            for (Libro libros : b.libros) {
                System.out.println("***Listado de personas que usuaron el libro: \n"+libros.getTitulo()+"\n"+libros.listadoSolicitantes());
            }
            System.out.println("Promedio de veces de prestados: "+b.promedioPrestasmo());

        } else {
            System.out.println("\n*****No cargó ningun libro, vuelva a iniciar el programa*****\n");
        }

    }

}
