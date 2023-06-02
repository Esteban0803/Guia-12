package ej2y3;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

public class Ej2y3 {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        System.out.println("LAVADORA");
        lavadora.crearLavadora();
        System.out.println("Precio final de la lavadora: $" + lavadora.precioFinal());
        System.out.println("----------------------");
        System.out.println("  ");
        System.out.println("TELEVISOR");
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        System.out.println("Precio final del televisor: $" + televisor.precioFinal());
        
        System.out.println("----------------------");
        System.out.println("  ");
        System.out.println("EJERCICIO 3");
        //Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
        //para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
        //Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
        //deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
        //televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
        //precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
        //2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
        //electrodomésticos, 2000 para lavadora y 5000 para televisor.
       
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(new Lavadora(40d, "Negro", 'E', 10000d, 40d));
        electrodomesticos.add(new Televisor(50, "Blanco", 'B', 20000, 2, true));
        electrodomesticos.add(new Lavadora(50d, "Roja", 'A', 6000d, 40d));
        electrodomesticos.add(new Televisor(30, "Azul", 'F', 15000, 5, false));
        
        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico aux : electrodomesticos) {
            double precioFinal = aux.precioFinal();     //Este for-each se usa para calcular 
            precioTotalElectrodomesticos += precioFinal;//el valor de todos los electrodomenticos
                
            if (aux instanceof Lavadora) {            //El "instanceof" se utiliza para verificar que parte
                precioTotalLavadoras += precioFinal;  //de "Electrocomestico" se esta usando. En este caso 
            } else if (aux instanceof Televisor) {    //se utiliza para ver si el objeto es una 
                precioTotalTelevisores += precioFinal;//"Lavadora" o un "Televisor"
            }
        }

        System.out.println("Todos los electrodomesticos valen $" + precioTotalElectrodomesticos);
        System.out.println("Todas las lavadoras valen $" + precioTotalLavadoras);
        System.out.println("Todos los televisores valen $" + precioTotalTelevisores);
    }
}
