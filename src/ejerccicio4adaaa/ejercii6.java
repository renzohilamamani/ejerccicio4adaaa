/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerccicio4adaaa;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ejercii6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la dimension :  ");
        int dimension = leer.nextInt();
       
        int matriz[][] = new int [dimension ][dimension];
        int array [] = new int[dimension * dimension];
        int pa = dimension /2;
        rellenar(matriz);
        mostrar(matriz);
        miarray(matriz, array, pa, dimension );
    }
    public static int [][] rellenar(int [][]matriz){
        for(int i = 0 ; i< matriz.length;i++){
            for(int j = 0; j < matriz[i].length;j++){
                matriz[i][j]= (int )(Math.random() * 9 ) + 1 ;
            }
        }
        return matriz;
    }
    public static int mostrar(int [][]matriz){
        System.out.println("mi matriz : ");
        for(int i = 0 ; i< matriz.length;i++){
            for(int j = 0; j < matriz[i].length;j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        return 0;
    }
    public static int[] miarray(int [][]matriz, int [] array , int pa, int dimension){
        int cont = 0 ;
        int z = dimension;
        for(int a = 0;  a < pa; a++){
            
        for(int i = a ; i < dimension;i++){
            array[cont]= matriz[a][i];
            cont++;
        }
        for(int k = a+1; k < dimension - 1 ; k++){
            array[cont]= matriz[k][dimension - 1];
            cont++;
        }
        for(int p = dimension -  1; p >=a; p--){
            array[cont]= matriz[dimension- 1 ][p];
            cont++;
        }
        for(int n = dimension - 2; n >=a+1;n--){
            array[cont]= matriz[n][a];
            cont++;
        }
        dimension = dimension - 1;
        
        }
        if(z%2==0){
            
        }else{
            array[cont]= matriz[pa][pa];
            cont++;
        }
        System.out.println("el array : -> ");
        for(int i = 0 ; i < cont;i++){
            System.out.print(array[i]+ ", ");
        }
        System.out.println();
      
        return array;
    }

    
    
}
