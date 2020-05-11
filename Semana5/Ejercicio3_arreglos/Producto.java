/*Desarrolle en la clase Producto un constructor que reciba por parámetro una
cantidad de elementos y dimensione el vector de materiales.
.*/
package Ejercicio3_arreglos;

public class Producto {

    private String descripcion;
    Material materiales[];

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /* Desarrolle en la clase Producto un método que permita agregar un Material
recibido por parámetro al vector.*/
    public Producto(String descripcion, int cantidadadElementos) {
        this.descripcion = descripcion;
        this.materiales = new Material[cantidadadElementos];
        {

        }
        ;
    }

    /* Desarrolle en la clase Producto un método que retorne el costo total. Dicho
valor se calcula sumando todos los valores unitarios de los Materiales que
componen el Producto.*/
    public void agregarMaterial(Material nuevoMaterial) {
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null) {
                materiales[i] = nuevoMaterial;
                break;

            }

        }

    }

    /*Desarrolle en la clase Producto un método que retorne el costo total. Dicho
valor se calcula sumando todos los valores unitarios de los Materiales que
componen el Producto.*/
   public float calcularCostoTotal() {
        float acumuladorCosto = 0f;

        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                acumuladorCosto += materiales[i].getValorUnitario();
            }
        }
        return acumuladorCosto;
    }

    /* Desarrolle en la clase Producto un método que reciba por parámetro 
    un código de material y retorne true si dicho material forma parte del Producto*/
    public boolean esPartedelProducto(int codigo) {
        boolean bandera = false;
        for (int i = 0; i < materiales.length; i++) {

            if (materiales[i] != null && materiales[i].getCodigo() == codigo) {
                bandera = true;
            }

        }
        return bandera;

    }

    /* Desarrolle en la clase producto un método que retorne un vector 
    con todos los materiales que tengan un valor unitario menor a un parámetro.*/
    public String listaMaterialesMenorParam(float valor) {
        String listado = "";
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null && materiales[i].getValorUnitario() < valor) {
                listado += (i+1)+"-"+ materiales[i].toString()+"\n";
            }
        }
        return listado;
    }

    /*   Desarrolle en la clase producto un método que retorne un vector donde cada
casillero contenga la cantidad de materiales por precio, siguiendo las siguiente
regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. Si 10 < precio ≤ 20
contarlo en el segundo casillero. Si 20 < precio ≤ 30 contarlo en el tercer
casillero. Si precio > 30 contarlo en el cuarto casillero.
     */
    public String materialPorPrecio() {
        String mensaje = "";
        int precioCero10 = 0;
        int precioDiez20 = 0;
        int precioVeinte30 = 0;
        int precioMasDe30 = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null && materiales[i].getValorUnitario() > 0) {
                if (materiales[i].getValorUnitario() <= 10) {
                    precioCero10++;
                } else if (materiales[i].getValorUnitario() <= 20) {
                    precioDiez20++;
                } else if (materiales[i].getValorUnitario() <= 30) {
                    precioVeinte30++;
                } else if (materiales[i].getValorUnitario() > 30) {
                    precioMasDe30++;
                }

            }

        }
        mensaje = "\nCantidad entre 0 y 10: " + precioCero10
                + "\nCantidad entre 10 y 20: " + precioDiez20
                + "\nCantidad entre 20 y 30: " + precioVeinte30
                + "\nCantidad mas de 30: " + precioMasDe30;
        return mensaje;
    }

    public String listaMateriales() {
        String listado = "";
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                listado += (i + 1) + "*" + materiales[i].toString() + "\n";
            }
        }
        return listado;
    }

    public String productoString() {
        return "\nDescripcion: " + descripcion
                + "\nMateriales: " + listaMateriales();
    }

}
