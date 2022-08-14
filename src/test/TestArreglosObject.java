package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {
        /*---------------------------------------------- Arreglo de tipo object ------------------------------------------------------*/
        //Se define en PLURAL ya que indica que tiene varios elementos
        Persona personas[] = new Persona[2]; //arreglo de objetos de tipo persona con dos elementos

        /*----------------------------------------------- Inicializar cada uno de los elementos --------------------------------------*/
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");
        
        /*----------------------------------------------- Acceder al elemento ---------------------------------------------------------*/
        System.out.println("personas 0= " + personas[0]); //domain.Persona@Direccion_memoria (SIN TOSTRING)
        System.out.println("personas 1= " + personas[1]); 
        
        /*----------------------------------------------- Iterar el arreglo tipo object ------------------------------------------------*/
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + "= " + personas[i]); 
        }
        
    }
}
