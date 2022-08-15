package test;
import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        /*--------------------------------------- Creando la matriz (ARREGLO DE ARREGLOS) ----------------------------------------------*/
        //Instanciando un objeto de tipo matriz
        int edades[][] = new int[3][2]; //[renglones][columnas]
        System.out.println("edades = " + edades);

        /*--------------------------------------- Asignar valores a la matriz ---------------------------------------------------------*/
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 9;
        edades[2][1] = 2;

        System.out.println("edades [0][0]= " + edades[0][0]);
        System.out.println("edades [0][1]= " + edades[0][1]);
        System.out.println("edades [1][0]= " + edades[1][0]);
        System.out.println("edades [1][1]= " + edades[1][1]);
        System.out.println("edades [2][0]= " + edades[2][0]);
        System.out.println("edades [2][1]= " + edades[2][1]);
        
        /*--------------------------------------- Iterar elementos de la matriz con un for anidado ---------------------------------------------------------*/       
        for (int ren = 0; ren < edades.length; ren++) { //largo de los renglones
            for (int col = 0; col < edades[ren].length; col++) { //largo de las columnas
                System.out.println("edades = " + ren + "-" + col + ": " + edades[ren][col]);
            }
        }
        
        /*--------------------------------------- Sintaxis simplificada para crear una matriz ---------------------------------------------------------*/       
       
        String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora","Mora"}}; //No tienen que ser matrices cuadradas
        imprimir(frutas); //MANDA LLAMAR EL METODO
        
        /*--------------------------------------- Imprimiendo los datos de la matriz con un for anidado ---------------------------------------------------------*/       
        
        for (int ren = 0; ren < frutas.length; ren++) {
            for (int col = 0; col < frutas[ren].length; col++) {
                System.out.println("Frutas " + ren + "-" + col + ": " + frutas[ren][col]);
            }
        }
        
        /*---------------------------------------------CREAR UNA MATRIZ DE TIPO OBJECT -------------------------------------------------------------------------*/
        Persona personas[][] = new Persona[2][3];
        
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Sammy");
        personas[1][0] = new Persona("Laurita");
        personas[1][1] = new Persona("Estrellita");
       // personas[1][2] = new Persona("Paco");
           
        imprimir(personas); //IMPRIME EL OBJETO PERSONA
    }
    
    /*------------------------------------------------- AGREGA METODO IMPRIMIR PARA IMPRIMIR LA MATRIZ DE OBJETOS ---------------------------------------------*/
    //Recibe como argumento un objeto de tipo object para que se pueda imprimir Personas o Frutas
    //No es necesario especificar el ancho y el largo de la matriz ya que apunta a la referencia solo se define la variable matriz[][]
    public static void imprimir(Object matriz[][]){
        
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("Matriz " + ren + "-" + col + ": " + matriz[ren][col]);
            }
        }
    }
}
