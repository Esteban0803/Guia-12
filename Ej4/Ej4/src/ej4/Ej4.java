package ej4;

import Entidades.Circulo;
import Entidades.Cuadrado;
public class Ej4 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(3d);
        Cuadrado d1 = new Cuadrado(7d, 5d);
        
        System.out.println("CIRCULO");
        System.out.println("Area del circulo "+c1.calcularArea());
        System.out.println("Perimetro del circulo "+c1.calcularPerimetro());
        c1.dibujar();
        System.out.println("-----------------------");
        System.out.println("CUADRADO");
        System.out.println("Area del cuadrado "+d1.calcularArea());
        System.out.println("Perimetro del cuadrado "+d1.calcularPerimetro());
        d1.dibujar();;
    }  
}
