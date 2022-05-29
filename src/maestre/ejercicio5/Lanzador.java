/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestre.ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Random;

/**
 *
 * @author jfunez
 */
public class Lanzador 
{
          
    
    
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
   
    
      
     
    
    
    /*
      Generamos aleatoriamente los numeros para las 3 posiciones
      */
    
      static int[] PosicionJuego()
      {
            int PosicionJuego;
            int PosicionesDeLaMaquina[]; //inicializamos el array
            PosicionesDeLaMaquina = new int[3]; //definimos el numero de indices que tendra cada uno de los arrays; en el primero definimos la posicion y en el segundo su valor
            Random rand = new Random();
      
                for(int i = 0 ; i < 3 ; i++)
                {
                    PosicionJuego = rand.nextInt(0,9); //Establecemos los limites
                    PosicionesDeLaMaquina[i] = PosicionJuego; //iteramos 3 las posciones para incluir los 3 valores aleatorios del 1 al 8
                }
                
            return PosicionesDeLaMaquina;
      }
      
      /*
      Pedimos al jugador los numeros para las 3 posiciones
      */
      static int[] PosicionJugador() throws IOException
      {
          
            boolean menu = true;
            int PosicionesDelJugador[]; //inicializamos el array
            PosicionesDelJugador = new int[3]; //definimos el numero de indices que tendra cada uno de los arrays; en el primero definimos la posicion y en el segundo su valor
            
            
            System.out.println("Elige 3 numeros rango[1-8] ");     
        
            while (menu) //menu para detectar inputs validos y rango de valores admitidos
            {
                  for(int i = 0 ; i < 3 ;)
                  {      
                        try 
                        { 
                          System.out.print("---> ");

                          PosicionesDelJugador[i] = Integer.parseInt(dato.readLine());

                            switch(PosicionesDelJugador[i])
                            {

                                case 0,1,2,3,4,5,6,7,8,9: 

                                i++;
                                    if (i < 3)
                                    {
                                        menu = false;
                                    }
                                break;

                                default:
                                    System.err.println("Opcion invalida");
                            }
                 
                        }
                        catch(InputMismatchException err){
                        System.err.println("Dato invalido");
                        }
                        catch(NumberFormatException err){
                        System.err.println(err.getMessage());
                        }
                 }
            } 
        return PosicionesDelJugador;
          
      }
      
    
    
    public static void main(String args[]) throws IOException
  {
        
      boolean menu = true; //Generamos un menu para controlar las rondas
      int[] PosicionesDeLaMaquina = PosicionJuego(); //Generamos los valores a adivinar de manera aleatoria
      int solventado = 0;  
      boolean encontrado; 
      int rondasTotales = 1;
        
        System.out.print("[Solucion]");
        
        for(int i = 0 ; i < PosicionesDeLaMaquina.length ; i++)
        {
            System.out.print(" "+ PosicionesDeLaMaquina[i]);
        }
        System.out.println("");
     
        
       while(menu)
       { 
           
       System.out.println("");
               
       int[] PosicionesDelJugador = PosicionJugador(); //Preguntamos al jugador por 3 numeros
       solventado = 0;
       
            for (int i = 0 ; i < 3 ; i++)
            {
                encontrado = false;
                
                if( PosicionesDelJugador[i] == PosicionesDeLaMaquina[i]) //Si las posicion y valor son los mismos entre maquina y jugador devuelve verde  
                {
                         System.out.print(" Verde ");
                         solventado++; //Sumamos y seguimos hasta los 3 puntos para ganar
                         encontrado = true; //Decimos que lo hemos encontrado para no iterar mas
                         
                 }

                 if (encontrado == false)
                 {
                         for (int j = 0 ; j < 3; j++) //Ahora buscamos el valor de la misma posicion por las 3 posiciones de la maquina 
                         {
                             //Si el valor dado se encuentra en alguna de las posiciones de la maquina devuelve amarillo
                             if(PosicionesDelJugador[i] == PosicionesDeLaMaquina[j])
                             {
                                 System.out.print(" Amarillo ");
                                 encontrado = true;    
                             }
                         }
                        if (encontrado == false)
                        { //Si no hemos encontrado nada en ninguno de los 2 bucles anteriores devuelve rojo
                                 System.out.print(" ROJO ");
                        }   
                }
             }
            
                System.out.println("");
                System.out.println("Rondas restantes "+ (7 -rondasTotales));
              
              
                // Si hemos acertado 3 veces en el mismo turno el valor entre la maquina y el jugador ganamos
                // Si no hemos acertado y hemos llegado a la ronda 7 septima acabamos el juego
              
                if(solventado == 3)
                {
                    System.out.println("");
                    System.out.println("Enhorabuena has superado el reto en " + rondasTotales + " rondas");
                    break;
                }   
                else if (rondasTotales == 7){
                    System.out.println("Lo siento has agotado las rondas");
                    break;
                }
                
        rondasTotales++;
       }
  }
}