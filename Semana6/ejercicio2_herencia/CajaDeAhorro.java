
package ejercicio2_herencia;


public class CajaDeAhorro extends Cuenta {
    private int tipoCuenta;

    public CajaDeAhorro(int tipoCuenta, long numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return super.toString()+"CajaDeAhorro{" + "tipoCuenta=" + tipoCuenta + '}';
    }

    
    
}
