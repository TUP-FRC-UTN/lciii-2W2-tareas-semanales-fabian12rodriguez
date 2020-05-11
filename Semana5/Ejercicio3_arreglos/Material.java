/*Desarrolle la clase Material de manera que contenga en su interior los
atributos: descripción (String) código(int) valorUnitario (float).
 */
package Ejercicio3_arreglos;

public class Material {

    private String descripcion;
    private int codigo;
    private float valorUnitario;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Material(String descripcion, int codigo, float valorUnitario) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Descripcion:" + descripcion + ", codigo=" + codigo + ", valorUnitario=" + valorUnitario + '}';
    }

}
