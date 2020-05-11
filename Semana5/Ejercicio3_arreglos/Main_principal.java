/* Desarrolle un programa principal que permita ingresar los datos de un
producto, cree un objeto de esa clase y luego posibilite mediante un menú
llamar a los métodos de los puntos 4 a 8 todas las veces y en el orden que el
usuario quiera.
 */
package Ejercicio3_arreglos;

import java.util.Scanner;
import javax.swing.SpringLayout;

public class Main_principal {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int cantidadMateriales, opcion;
        String descripcionProducto;
        System.out.println("Ingrese el producto: ");
        descripcionProducto = lector.nextLine();
        System.out.println("Ingrese cantidad de materiales que posee el producto: ");
        cantidadMateriales = lector.nextInt();
        Producto p = new Producto(descripcionProducto, cantidadMateriales);
        for (int i = 0; i < cantidadMateriales; i++) {
            System.out.println("Ingrese el material que contiene: ");
            String descripcion = lector.next();
            System.out.println("Ingrese el codigo del material: ");
            int codigo = lector.nextInt();
            System.out.println("Ingrese el precio unitario del material: ");
            float precio = lector.nextFloat();

            Material nuevoMaterial = new Material(descripcion, codigo, precio);
            p.agregarMaterial(nuevoMaterial);

            //System.out.println("Material: "+nuevoMaterial.toString());
        }

        opcion = 0;
        while (opcion != 5) {
            System.out.println("\n***MENU***");
            System.out.println("1-Calcular costo total del producto.");
            System.out.println("2-Buscar material para ver si es parte del producto.");
            System.out.println("3-Ingresar un precio para ver los productos menores a este.");
            System.out.println("4-Ver cantidad de materiales por precio. ");
            System.out.println("5-Salir");
            System.out.println("\n\nIngrese una opcion: ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\nCosto Total: " + p.calcularCostoTotal());

                    break;
                case 2:
                    System.out.println("\nIngrese Codigo: ");
                    int codigo = lector.nextInt();
                    p.esPartedelProducto(codigo);
                    System.out.println(p.esPartedelProducto(codigo));
                    break;
                case 3:
                    System.out.println("\nIngrese precio: ");
                    float precio = lector.nextInt();
                    p.listaMaterialesMenorParam(precio);
                    System.out.println("Menor Precio: " + p.listaMaterialesMenorParam((float) precio));
                    break;
                case 4:
                    System.out.println("Cantidad de materiales: " + p.materialPorPrecio());

                    break;
                case 5:
                    System.out.println("\n-----GRACIAS POR UTILIZAR SOFCOMP-----");
                    break;
                default:
                    System.out.println("\n*****ATENCION!! ha ingresado una opcion incorrecta!!*****");
            }

        }

    }

}
