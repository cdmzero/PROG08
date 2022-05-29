/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestre.ejercicio2;

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
          
            int numeroAleatorio = 1;
            numeroAleatorio = rand.nextInt(8)+1;
      
            return numeroAleatorio;
      }
      
      
      static int DecisionJugador() throws IOException{
      
            int decision =  1000;
            
            boolean menu = true;
          
  
            
            
               
          while (menu) { 
                            try{ 
                                    System.out.print("Elige un numero del 1 al 8 ---> ");
                

                                    decision = Integer.parseInt(dato.readLine());
                                    
                           
                                    
                                    switch(decision)
                                    {

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
        int rondasTotales = 5;
        boolean menu = true;
        int posicionJugador = 0;
        int intentos = 1;
    
      
      //Ejercicio realizado con un array booleano;
      
      boolean tablero[]; //Declaramos el array tablero y su tipo
      tablero = new boolean[9]; //Declaramos su longitud - Por defecto se declaran como false todos los valores contenidos dentro del array
      
      
      
      tablero[posicionMosca] = true; //Declaramos la posicion de la mosca

           System.out.println("Posicion inicial de la mosca: " + posicionMosca);
           System.out.println("");
        
           
        while(menu){

         if(rondasTotales == 0)
         {
                                    
           System.out.println("Has perdido");
           menu = false;
           break;
         
         }
         
        posicionJugador = DecisionJugador(); 
            
           for (int i=1 ; i <= 8; i++) 
           { 

                     if (tablero[i] == true) //Si el valor de la posicion iterada del tablero hace match en true hemos encontrado a la mosca
                     {
                         System.out.println("");
                         
                         
                                //Si coincide con la posicion del jugador
                                if(i == posicionJugador ){ //Si el valor que ha facilitado el usuario es igual a la posicion del tablero gana el juego

                                    System.out.println("Has ganado");
                                    
                                    System.out.println("Mosca cazada en "+ (intentos) + " rondas " );


                                    menu=false;
                                    break;
                                }else if( i == posicionJugador +1 | i == posicionJugador -1 ){ 

                                     System.out.println("Te has quedado cerca");
                                    
                                     //Desasignamos la posicion anterior 
                                     tablero[posicionMosca] = false;
                                     
                                     //Asignamos nueva posicion
                                     posicionMosca = PosicionMosca();
                                     tablero[posicionMosca] = true;
                                     
                                     System.out.println("La mosca ha revoloteado");
                                     System.out.println("");
                                     System.out.println("Nueva posicion: " + posicionMosca);
                                     System.out.println("");

                                 
                                }else{
                               
                                System.out.println("Fallaste");
                                System.out.println("");
                                
                        
                                }
                                
                                rondasTotales -= 1 ;
                                System.out.println("Rondas restantes :"+ (rondasTotales));
                                intentos++;
                                break;
                                
                                
                               
                     
                     }
                 
             }
           


          }
  }
}
