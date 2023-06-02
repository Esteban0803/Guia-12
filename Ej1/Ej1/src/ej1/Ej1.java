//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//mensaje por pantalla informando de que se alimenta.
package ej1;
import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

public class Ej1 {
    public static void main(String[] args) {
        Animal perro1 = new Perro("Poppy", "carne", 12, "perro");
        perro1.alimentarse();
        Animal gato1 = new Gato("Venus", "atun", 4, "gato");
        gato1.alimentarse();
        Animal caballo1 = new Caballo("Valkyria", "heno", 7,"caballo");
        caballo1.alimentarse();
    }  
}
