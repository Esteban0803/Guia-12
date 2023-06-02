//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.

package Entidades;
import Interfaz.Formas;

public class Circulo implements Formas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return pi * this.radio * radio;
    }

    @Override
    public double calcularPerimetro() {
       return pi * radio * 2;
    }

    @Override
    public void dibujar() {
        //Perdonen gente, pero cometí un pecado, se me cerro la cabeza
        //y no sabia como representarlos con "*" asi que le pedi ayuda la chatGPT
        //hago aclaraciones para las partes mas raritas del codigo
        int dia = (int) (2 * radio);
        int radioo = (int) Math.round(radio);
        
        for (int y = -radioo; y <= radioo; y++) {
            for (int x = -dia; x <= dia; x++) {
                double distancia = Math.sqrt(x * x + y * y); 
                //calcula la distancia desde el origen (0, 0) hasta el punto (x, y)
                if (distancia >= radio - 0.5 && distancia <= radio + 0.5) {
                    //verifica si la distancia calculada está dentro del rango del radio del círculo.
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
