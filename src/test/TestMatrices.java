package test;

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
        
    }
}
