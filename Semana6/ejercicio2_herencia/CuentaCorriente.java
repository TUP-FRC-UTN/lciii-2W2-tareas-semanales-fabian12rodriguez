
package ejercicio2_herencia;

public class CuentaCorriente extends Cuenta {
    private int tipoCuenta;
    private float acuerdo;

    public CuentaCorriente(int tipoCuenta, float acuerdo, long numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
        this.tipoCuenta = tipoCuenta;
        this.acuerdo = acuerdo;
    }

    @Override
    public String toString() {
        return super.toString()+"CuentaCorriente{" + "tipoCuenta=" + tipoCuenta + ", acuerdo=" + acuerdo + '}';
    }

    
    
    
}
