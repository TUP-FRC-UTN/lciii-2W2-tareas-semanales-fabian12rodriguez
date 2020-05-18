/*
En un banco hay dos tipos de cuentas: cajas de ahorro y cuentas corrientes.
Programar una clase Cuenta y dos derivadas correspondientes a cada uno de los
tipos de cuenta.
La clase Cuenta debe poseer dos métodos para operar con las mismas llamados
Depositar y Extraer.
Las cajas de ahorro no permiten extracciones si el saldo no es suficiente, mientras
que las cuentas corrientes poseen un atributo “acuerdo” que indica el máximo saldo
negativo admisible. La clase cuenta debe poseer al menos los atributos número,
nombre y saldo.
 */
package ejercicio2_herencia;

public class Cuenta {

    protected long numero;
    protected String nombre;
    protected double saldo;

    public Cuenta(long numero, String nombre, double saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }

    public void extracionesCA(float extraccion, int tipoCuenta) {
        String msg = "";
        if (tipoCuenta == 1) {
              if (saldo < extraccion) {
            msg = "Saldo Insuficiente";

        } else {
            msg = "Extraccion realizada";
        }
        }
      
    }
    public void extracionesCC(float extraccion, int tipoCuenta, float acuerdo) {
        String msg = "";
        if (tipoCuenta == 2) {
              if (acuerdo < extraccion) {
            msg = "Saldo Insuficiente";

        } else {
            msg = "Extraccion realizada";
        }
        }
      
    }

}
