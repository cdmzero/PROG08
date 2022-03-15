/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5.maestre;

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
    
    
    
    
      static int[][] PosicionJuego()
      {
            Random rand = new Random();
          
            int numeroAleatorio = 0;
           
            
                    int numerosAleatorios[][]; 
                        numerosAleatorios = new int[3][1];
      
            for(int i = 0 ; i < 3 ; i++)
            {
                      numeroAleatorio = rand.nextInt(8)+1;
                      numerosAleatorios[i][0] = numeroAleatorio;
            }
            
            
            return numerosAleatorios;
      }
      
      
      static int[][] DecisionJugador() throws IOException{
      
            int decision[][];
                decision = new int[3][1];
            boolean menu = true;
          
  
            
            
        System.out.println("Elige un numero del 1 al 8");     
        
          while (menu) {
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
        int[][] posicionesmaquina = PosicionJuego();
        
    
        
        System.out.print("Posiciones maquina");
        for(int i = 0 ; i < posicionesmaquina.length ; i++)
        {
           
                System.out.print(" "+ posicionesmaquina[i][0]);
            
            
        }
     
        int rondasTotales = 1;
        boolean menu = true;
      
     
        
       while(rondasTotales < 8 ){
        System.out.println("");
       int solventado=0;    
              
        int[][] PosicionesDelJugador = DecisionJugador();
     
                
    


              for (int i = 0 ; i < 3 ; i++)
                {
                    
                      boolean encontrado = false;   

                     if( PosicionesDelJugador[i][0] == posicionesmaquina[i][0] ){

                         System.out.print(" Verde ");

                         solventado++;
                      encontrado = true;
                     }


                     if (encontrado == false)
                     {
                         for (int j = 0 ; j < 3; j++)
                         {

                             if(PosicionesDelJugador[i][0] == posicionesmaquina[j][0]){

                                 System.out.print(" Amarillo ");


                                 encontrado = true;
                                 break;
                             }
                          }
                     }
                     if (encontrado == false){
                          System.out.print(" ROJO ");
                      }


                 }
              
       if (solventado == 3){
           System.out.println("");
           
           System.out.println("Enhorabuena has superado el reto en " + rondasTotales + " rondas");
       break;
       }
        rondasTotales++;
       
       }
          
 
       
        
                  
                  
        
        
        
     /*   
          for( int i = 0 ; i <= n-1 ; i++ )
          {  
              matriz[i][i] = i;
              
               System.out.println("Todos los valores de --->"+ matriz[i][i]);
               
               
               for( int j : matriz[i] ){
               
               matriz[i][j] = numeroAleatorio();
               
               int valor = matriz[i][j];
               
               System.out.println("Valor aleatorio -->"+ matriz[i][j]);
               
                if(valorMaximo < valor )
                {  
                    valorMaximo = valor ;
                }
               
               }
                System.out.println("Valor Maximo en vuelta -> "+ i +" valor --> "+valorMaximo);
                System.out.println("");
                valoresPromedio[i] = valorMaximo;
                valorMaximo = 0;
          }
        
        
        
        
        */
        
        
        
        
        
        
      
      /*  //Ejercicio realizado sin array
        
                    while(menu){

                        rondasTotales++;


                               posicionJugador = DecisionJugador();

                                if( posicionMosca == posicionJugador )  
                                {
                                    System.out.println("Ganaste");
                                    System.out.println("Total de rondas = "+ rondasTotales);
                                    menu = false;

                                }
                                else if( (posicionMosca+1 == posicionJugador ) || ( posicionMosca-1 == posicionJugador) )  
                                {
                                    System.out.println("Te quedaste Cerca");
                                }
                                else if( rondasTotales >= 5 )
                                {
                                    System.out.println("Perdiste");
                                    menu = false;
                                }
                   }

      
      //Ejercicio realizado con un array booleano;
      
      boolean tablero[]; //Declaramos el array tablero y su tipo
      tablero = new boolean[9]; //Declaramos su longitud =>Por defecto se declaran como false todos los valores contenidos dentro del array
      
      
      boolean moscaTablero = true; //Declaramos a la mosca
      
      //tablero[posicionMosca] = moscaTablero; //Declaramos la posicion de la mosca

      /*
      //  while(menu){

        //posicionJugador = DecisionJugador(); //Declaramos la decision del jugador
            
            
           for (int i=0 ; i <= tablero.length -1 ; i++) 
           { //Declaramos un bucle con la longitud del tablero -1 (los arrays empiezan en 0) e iteramos

                     if (tablero[i] == true) //Si el valor de la posicion iterada del tablero hace match con true hemos encontrado a la mosca
                     {
                         System.out.println("Estoy aqui casilla nº "+ i);

                         if(i==posicionJugador)
                         { //Si el valor que ha facilitado el usuario es igual a la posicion del tablero gana el juego

                             System.out.println("Has ganado");
                             System.out.println("Total de rondas = "+ rondasTotales);
                                    
                             
                             menu=false;
                             break;
                         }
                         else if( i == posicionJugador+1 || i == posicionJugador-1 ) 
                         { //Si la decision del usuario es ayacente a la mosca

                              System.out.println("Te has quedado cerca");
                         }
                         else
                         {
                         
                             System.out.println("Fallaste");
                         
                         }
                         
                         System.out.println("Rondas restantes :"+ (5 - rondasTotales));

                          if (rondasTotales >= 5) 
                          { //Perdimos el juego
                              System.out.println("FIN");
                              menu=false;
                          }
                              rondasTotales++;
                     }
                 
             }

          }
*/
      
  }
}