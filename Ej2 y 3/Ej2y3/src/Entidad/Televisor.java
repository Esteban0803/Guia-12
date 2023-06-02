//Se debe crear también una subclase llamada Televisor con los siguientes atributos:
//resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
//heredados.

//Los constructores que se implementarán serán:
//• Un constructor vacío.
//• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
//heredados. Recuerda que debes llamar al constructor de la clase padre.

//Los métodos que se implementara serán:
//• Método get y set de los atributos resolución y sintonizador TDT.
//• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
package Entidad;
import java.util.Scanner;

public final class Televisor extends Electrodomestico {
    private double resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolucion, String color, char consumoE, int precio, int peso, boolean par4) {
        super(precio, color, consumoE, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

  
    public void crearTelevisor(){
        crearElectrodomestico();
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la resolucion del televisor");
        this.resolucion = leer.nextDouble();
        System.out.println("Tiene sintonizador TDT? (True/False)");
        this.tdt = leer.nextBoolean();
    }
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        if (this.resolucion > 40){
            precioFinal += precioFinal * 0.3;
        }
        if (this.tdt){
            precioFinal += 500;
        }
        return precioFinal;
    }
}
