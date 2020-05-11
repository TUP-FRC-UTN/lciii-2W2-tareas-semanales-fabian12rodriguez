package Ejercicio2_arreglos;

import ejercicio1_arreglos.clientes;
import java.util.Scanner;

public class Main_Veterinaria {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Cliente[] clientes;//

        System.out.println("Ingresa cantidad de Clientes: ");
        int cantClientes = lector.nextInt();

        clientes = new Cliente[cantClientes];

        for (int i = 0; i < clientes.length; i++) {
            lector.nextLine();
            System.out.println("Ingrese el numero del cliente: ");
            int nroCliente = lector.nextInt();
            lector.nextLine();
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = lector.nextLine();
            System.out.println("Ingrese la antiguedad del cliente: ");
            int antiguedad = lector.nextInt();
            System.out.println("Ingrese el codigo de la mascota: ");
            int mascota = lector.nextInt();
            lector.nextLine();
            System.out.println("Ingrese el nombre de la mascota: ");
            String nombreMascota = lector.nextLine();
            System.out.println("Ingrese la edad de la mascota: ");
            int edadMascota = lector.nextInt();

            clientes[i] = new Cliente(nroCliente, nombre, antiguedad, mascota, nombreMascota, edadMascota);
        }
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Datos del cliente: " + clientes[i]);

        }

        //mostrar el promedio de la edad de las mascostas
        int contadorEdadMascota = 0;
        int acumulaldorEdadMascota = 0;
        double promedioEdadMascosta = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                acumulaldorEdadMascota += clientes[i].getEdadMascota();
                contadorEdadMascota++;

            }

        }
        //promedioEdadMascosta = (double) acumulaldorEdadMascota / contadorEdadMascota;

        // System.out.println("El promedio de edad de las mascotas: " +promedioEdadMascosta);
        System.out.println("El promedio de edad de las mascotas: " + clientes[clientes.length - 1].calcularPromedio(acumulaldorEdadMascota, contadorEdadMascota));

        //clientes mayores a 5 años
        int contadorClientesMayores5 = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].getAntiguedad() > 5) {
                contadorClientesMayores5++;
            }
        }
        System.out.println("Los clientes mas antiguos a 5 años son: " + contadorClientesMayores5);

    }

}
