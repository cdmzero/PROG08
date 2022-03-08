/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.maestre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Random;

/**
 *
 * @author jfunez
 */
public class Lanzador {
          
    
    
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
    
    
    
    
      static int PosicionMosca()
      {
          Random rand = new Random();
           int numeroAleatorio = 0;
          
          numeroAleatorio = rand.nextInt(8)+1;
      return numeroAleatorio;
      }
      
      
      static int DecisionJugador() throws IOException{
      
            int decision = 0 ;
            
            boolean menu = true;
          
            System.out.print("Elige un numero del 1 al 8 ---> ");
            
            
               
          while (menu) { 
                    try { 
                        
                    decision = Integer.parseInt(dato.readLine());
                    
                    switch(decision){
               
                        case 1,2,3,4,5,6,7,8:
                            menu = false;
                        break;
                        default:
                            System.err.println("Opcion invalida");

                    }
                    }catch(InputMismatchException err){
                    System.err.println("Dato invalido");
                    }catch(NumberFormatException err){
                        System.err.println(err.getMessage());
                    }

                    }
          
          return decision;
          
      }
      
    
    
    public static void main(String args[]) throws IOException
  {
        int posicionMosca = PosicionMosca();
        int rondasTotales = 1;
        boolean menu = true;
        int posicionJugador = 0;
     
      
      /*
                    while(menu){

                        rondasTotales++;


                               posicionJugador = DecisionJugador();

                                if( posicionMosca == posicionJugador )  
                                {
                                    System.out.println("Ganaste");
                                    System.out.println("Total de rondas = "+ rondasTotales);
                                    menu = false;
                                }
                                else if( (posicionMosca+1 == posicionJugador )||( posicionMosca-1 == posicionJugador) )  
                                {
                                    System.out.println("Te quedaste Cerca");
                                }
                                else if( rondasTotales >= 5 )
                                {
                                    System.out.println("Perdiste");
                                    menu = false;
                                }
                   }
*/
      
      boolean tablero[];
      tablero = new boolean[9];
      boolean moscaTablero = true;
      
      tablero[posicionMosca] = moscaTablero;
      
        while(menu){

        posicionJugador = DecisionJugador();
            
            
           for (int i=0 ; i <= tablero.length -1 ; i++)
           {


                     if (tablero[i] == true)
                     {
                         System.out.println("Estoy aqui casilla nº "+ i);

                         if(tablero[i] == true && i==posicionJugador){

                             System.out.println("Has ganado");
                             System.out.println("Total de rondas = "+ rondasTotales);
                                    
                             
                             menu=false;

                         }

                         posicionJugador += 1;

                         if(tablero[i] == true && i==posicionJugador){

                              System.out.println("Te has quedado cerca");
                         }

                         posicionJugador -= 2;

                           if(tablero[i] == true && i==posicionJugador){

                              System.out.println("Te has quedado cerca");
                         }

                         

                          if (rondasTotales >= 5){

                              menu=false;
                          }    
                          
                      rondasTotales++;
                     }
             }

          }
  }
}
