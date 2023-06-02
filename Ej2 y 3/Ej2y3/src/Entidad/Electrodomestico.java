//Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
//consumo energético (letras entre A y F) y peso.
//Los constructores que se deben implementar son los siguientes:

//• Un constructor vacío.
//• Un constructor con todos los atributos pasados por parámetro.

//Los métodos a implementar son:
//• Métodos getters y setters de todos los atributos.
//• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
//• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
//• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
//• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
package Entidad;

import java.util.Scanner;

public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoE;
    protected double peso;

    public Electrodomestico() {
        this.precio = 1000d;
        this.color = "blanco";
        this.consumoE = 'F';
        this.peso = 0d;
    }

    public Electrodomestico(double precio, String color, char consumoE, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    public void comprobarConsumoEnergetico (char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoE = letra;
        } else {
            this.consumoE = 'F';
        }
    }
    public void comprobarColor(String color){
        String colorLowercase = color.toLowerCase();
        String [] colores = {"Blanco","Negro", "Rojo", "Azul", "Gris"};
        for (String colore : colores) {
            if (colorLowercase.equals(colore)){
                this.color = colorLowercase;
            return;
            }
        }
        this.color = "Blanco";
    }  
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio del electrodomestico");
        this.precio = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese el color");
        this.comprobarColor(leer.nextLine());
        System.out.println("Ingrese el consumo de energia");
        this.comprobarConsumoEnergetico(leer.nextLine().charAt(0));
        System.out.println("Ingrese el peso");
        this.peso = leer.nextDouble();
    }
        public double precioFinal() {
        double precioFinal = this.precio;

        switch (this.consumoE) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (this.peso >= 1 && this.peso <= 19) {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 800;
        } else if (this.peso >= 80) {
            precioFinal += 1000;
        }
        return precioFinal;
    }
}
