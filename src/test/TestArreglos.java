
package test;


public class TestArreglos {

    public static void main(String[] args) {
        //Definir un arreglo de tipo entero
        //NOTA: Los arreglos no pueden crecer, no se pueden agregar elementos de manera dinamica, para colecciones dinamicas son listas, set o map
        /*---------------------------------------------------- ARREGLO DE TIPO PRIMITIVO -----------------------------------------------------------------------------*/
        int edades[] = new int[3]; //tipo nombre[] = new(YA QUE ES UN TIPO OBJECT) tipo_dato[Cantidad de elementos];
        System.out.println("edades = " + edades);//Imprime la dirección de memoria
        
        //ACCEDER A CADA UNO DE LOS ELEMENTOS PARA MODIFICARLO
        edades[0] = 10;
        edades[1] = 5;
        edades[2] = 75;
        System.out.println("edades 0 = " + edades[0]);
        System.out.println("edades 1 = " + edades[1]);
        System.out.println("edades 2 = " + edades[2]);

        //Acceder solo a los indices definidos en el arreglo, marca error de compilación
        //edades[3] = 5;
        
        //Iterrar el arreglo
        for (int i = 0; i < edades.length; i++) { //Propiedad length conocer el tamaño del arreglo
            System.out.println("edades elemento " + i + ": " + edades[i]);
        }
        
        /*--------------------------- DEFINIR UN ARREGLO INICIALIZANDO LOS ELEMENTOS DESDE UN PRINCIPIO (SINTAXIS RESUMIDA) -----------------------------------------------*/
        String frutas[] = {"Naranja","Platano","Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta = " + i + "= " + frutas[i]);
        }

        
    }
}
