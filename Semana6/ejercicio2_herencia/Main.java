
package ejercicio2_herencia;

import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
        
      
        Cuenta c = new CajaDeAhorro(0, 0, "TITO", 0);
        System.out.println(c.toString());
        
        Cuenta c1 = new CuentaCorriente(0, 0, 0, "Ricardo", 0);
        System.out.println(c1.toString());

    }
    
}
