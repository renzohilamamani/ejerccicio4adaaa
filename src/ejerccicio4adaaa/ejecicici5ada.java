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
public class ejecicici5ada {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero la dimension  por favor : ");
        int d = leer.nextInt();
        int matriz [][] = new int [d][d];
        llenar(matriz);
        mostrar(matriz);
        int x  = verificar(matriz);
        if(x == 0){
            System.out.println("la matriz es simetrica ");
        }else{
            System.out.println("la matriz no es simetrica ");
        }
    }
    
    public static int [][] llenar(int [][] matriz){
        for(int i = 0 ; i < matriz.length;i++){
            for(int j = 0 ; j  < matriz[i].length;j++){
                matriz[i][j]= (int )(Math.random() * 10 ) + 1;
                
            }
        }
        return matriz;
    }
    public static int mostrar(int [][] matriz){
        System.out.println("LA MATRIZ  : ");
        for(int i = 0 ; i < matriz.length;i++){
            for(int j = 0 ; j  < matriz[i].length;j++){
                
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println();
        }
        return 0;
    }
    public static int verificar(int [][] matriz){
        int x = 0;
        for(int i = 0 ; i < matriz.length;i++){
            for(int j = 0 ; j  < matriz[i].length;j++){
                if(matriz[i][j]==matriz[j][i]){
                    
                }else{
                    x = 1;
                }
            }
        }
        return x;
    }
    
}
