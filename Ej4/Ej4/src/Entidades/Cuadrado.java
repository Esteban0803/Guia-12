//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

package Entidades;
import Interfaz.Formas;

public class Cuadrado implements Formas{
    private double base;
    private double altura;

    public Cuadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }

    @Override
    public void dibujar() {
        int basee = (int) Math.round(base);
        int alturaa = (int) Math.round(altura);
        
        for (int y = 0; y < alturaa; y++) {
            for (int x = 0; x < basee; x++) {
                if (y == 0 || y == alturaa - 1 || x == 0 || x == basee - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
