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
        //Perdonen gente, pero cometí un pecado, se me cerro la cabeza
        //y no sabia como representarlos con "*" asi que le pedi ayuda la chatGPT
        //hago aclaraciones para las partes mas raritas del codigo
        int basee = (int) Math.round(base);
        int alturaa = (int) Math.round(altura);
        
        for (int y = 0; y < alturaa; y++) {
            for (int x = 0; x < basee; x++) {
                if (y == 0 || y == alturaa - 1 || x == 0 || x == basee - 1) {
                    //Esto se utiliza para verificar si se encuentra el primer punto
                    //y el ultimo punto de las "filas" y "columnas" (y=filas, x=columnas)
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
