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
public class Lanzador {
          
    
    
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
    
    
    /*
      Generamso aleatoriamente los numeros para las 3 posiciones
      */
    
      static int[][] PosicionJuego()
      {
            int numeroAleatorio = 0;
            int numerosAleatorios[][]; //inicializamos el array
            numerosAleatorios = new int[3][1]; //definimos el numero de indices que tendra cada uno de los arrays; en el primero definimos la posicion y en el segundo su valor
            Random rand = new Random();  
      
                for(int i = 0 ; i < 3 ; i++)
                {
                    numeroAleatorio = rand.nextInt(8)+1;
                    numerosAleatorios[i][0] = numeroAleatorio; //iteramos 3 las posciones para incluir los 3 valores aleatorios del 1 al 8
                }
                
            return numerosAleatorios;
      }
      
      /*
      Pedimos al jugador los numeros para las 3 posiciones
      */
      static int[][] DecisionJugador() throws IOException
      {
          
            boolean menu = true;
            int decision[][]; //inicializamos el array
            decision = new int[3][1]; //definimos el numero de indices que tendra cada uno de los arrays; en el primero definimos la posicion y en el segundo su valor
            
            
            System.out.println("Elige 3 numeros rango[1-8] ");     
        
            while (menu) //menu para detectar inputs invalidos y rango de valores admitidos
            {
                  for(int i = 0 ; i < 3 ;)
                  {      
                        try 
                        { 
                          System.out.print("---> ");

                          decision[i][0] = Integer.parseInt(dato.readLine());

                            switch(decision[i][0])
                            {

                                case 1,2,3,4,5,6,7,8: 

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
        return decision;
          
      }
      
    
    
    public static void main(String args[]) throws IOException
  {
        int[][] posicionesmaquina = PosicionJuego(); //Generamos los valores a adivinar de manera aleatoria
        
    
        
        System.out.print("Posiciones de la maquina:");
        for(int i = 0 ; i < posicionesmaquina.length ; i++)
        {
           
                System.out.print(" "+ posicionesmaquina[i][0]);
            
            
        }
     
        int rondasTotales = 1; //Contador de rondas
        boolean menu = true; //Generamos un menu para controlar las rondas
      
     
        
       while(menu){ 
           
       System.out.println("");
       int solventado=0;    
              
        int[][] PosicionesDelJugador = DecisionJugador(); //Preguntamos al jugador
     
                
    


              for (int i = 0 ; i < 3 ; i++)
                {
                    
                      boolean encontrado = false;   

                     if( PosicionesDelJugador[i][0] == posicionesmaquina[i][0]) //Si las posicion y valor son los mismos entre maquina y jugador devuelve verde  
                     {

                         System.out.print(" Verde ");

                         solventado++; //Sumamos y seguimos hasta los 3 puntos para ganar
                      encontrado = true; //Decimos que lo hemos encontrado para no iterar mas
                     }


                     if (encontrado == false)
                     {
                         for (int j = 0 ; j < 3; j++) //Ahora buscamos el valor de la misma posicion por las 3 posiciones de la maquina 
                         {

                             if(PosicionesDelJugador[i][0] == posicionesmaquina[j][0]){ //Si coincide encontramos devuelve amarillo

                                 System.out.print(" Amarillo "); 


                                 encontrado = true;
                                 break;
                             }
                          }
                         
                         if (encontrado == false){ //Si no hemos encontrado nada en ninguna de las 2 iteraciones devuelve rojo
                          System.out.print(" ROJO ");
                         }
                         
                     }
                     


                 }
              
              
              //Si hemos acertado 3 veces la posicion y valor entre la maquina y el jugador ganamos
              
                if(solventado == 3)
                {
                    System.out.println("");
                    System.out.println("Enhorabuena has superado el reto en " + rondasTotales + " rondas");
                    break;
                }
                else if(rondasTotales == 7) //Si hemos gastados las rondas perdimos
                {
                    
                    System.out.println("");
                    System.out.println("Losiento has perdido");
                    break;
                }
                
                
        rondasTotales++;
       
       }
       
          
 
       
 
  }
}