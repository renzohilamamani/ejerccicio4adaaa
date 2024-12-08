

package ejerccicio4adaaa;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejerccicio4adaaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese n° fila  ");
        int fila = leer.nextInt();
        
        System.out.println("ingrese n° de columna ");
        int colu = leer.nextInt();
        int matriz [][] = new int [fila][colu];
        int trans [][] = new int [colu][fila];
        
        llenar(matriz);
        mostrare(matriz);
        latranspuesta(matriz,trans);
        imprimir(trans);
    }
    public static int [][] llenar(int [][] matriz){
        for(int i = 0 ; i< matriz.length;i++){
            for(int j = 0 ; j < matriz[i].length;j++){
                matriz[i][j]= (int )(Math.random() * 10 ) + 1;
            }
        }
        return matriz;
    }
    public static int mostrare(int [][]matriz){
        System.out.println("matriz original ");
        for(int i = 0 ; i< matriz.length;i++){
            for(int j = 0 ; j < matriz[i].length;j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        return 0 ;
    }
    public static int [][] latranspuesta(int [][] matriz, int [][] trans){
        int f = 0 , c = 0 ;
        for(int i= 0; i < matriz.length;i++){
            for(int j = 0 ; j  < matriz[i].length;j++){
                trans[f][c]= matriz[i][j];
                f++;
            }
            f = 0;
            c++;
        }
        return trans;
    }
    public static int imprimir(int [][] trans){
        System.out.println();
        System.out.println(" matriz transpuesta");
        for(int i = 0 ; i< trans.length;i++){
            for(int j = 0 ; j< trans[i].length;j++){
                System.out.print(trans[i][j]+ " ");
            }
            System.out.println();
        }
        return 0;
    }
    
}
