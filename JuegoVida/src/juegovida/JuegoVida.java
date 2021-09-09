/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegovida;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JuegoVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String celula1;
   int VecinosVivos;
   int VecinosMuertos;
   
   Scanner teclado = new Scanner(System.in);
   
   Celulas celula[][] = new Celulas [5][5];
   
   for(int fila=0; fila<5; fila++){
       for(int col=0; col<5; col++){
           System.out.println("Introduzca donde se encuentra su celula:");
           celula1= teclado.nextLine();
           System.out.println("Introduzca Cuantos Vecinosvivos Tiene su celula:" );
           VecinosVivos = teclado.nextInt();
           teclado.nextLine();
           System.out.println("Introduzca Cuantos Vecinos Muertos Tiene su celula");
           VecinosMuertos = teclado.nextInt(); 
           teclado.nextLine();
           Celulas miTablero = new Celulas(celula1,VecinosVivos,VecinosMuertos); 
           celula[fila][col] = miTablero;
       }
   
   }
   
   for(int fila=0; fila<5; fila++){
       for(int col=0; col<5; col++){
           System.out.println("Fila" + fila + "Columna:" + col); 
           System.out.println(". Posiciones en el Tablero: "); 
           System.out.println("posicion de la Celula" + celula[fila][col].getCelula1()); 
           System.out.println("cuantos Vecinos Vivos"+ celula[fila][col].getVecinosVivos()); 
           System.out.println("cuantos Vecinos Muertos"+ celula[fila][col].getVecinosMuertos()); 
           System.out.println("-----------------------------"); 
         }
       
       }
    }
    
}
