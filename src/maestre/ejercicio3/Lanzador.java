/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestre.ejercicio3;

import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

/**
 *
 * @author jfunez
 */


public class Lanzador {
    
    
static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

    
      static int Decision() throws IOException, Exception
      {
      
            int decision = 0 ;
            
            boolean menu = true;
               
          while (menu)
          { 
           System.out.print("Elige un numero ---> ");
                    try 
                    { 
                        
                    decision = Integer.parseInt(dato.readLine());
                    
                    if(decision > 0)
                    {
                    
                    menu=false;
                    break;
                    
                    }else{
                    
                        throw new NumberFormatException("Tiene que ser mayor de 0");
                    }
                    
                    }
                    catch(InputMismatchException err)
                    {
                    System.err.println("Dato invalido");
                    }
                    catch(NumberFormatException err)
                    {
                        System.err.println(err.getMessage());
                    }
                    
          
          
          }
       return decision;
      }
      
     static int numeroAleatorio()
      {
          Random rand = new Random();
          int numeroAleatorio = 0;
          numeroAleatorio = rand.nextInt(9)+1;
          return numeroAleatorio;
      }
     
          
    public static void main(String args[]) throws IOException, Exception
    {
            int numeroUsuario =  Decision();
            
            int matriz[][];
            //Le damos la longitud que el user decida
            matriz =  new int[numeroUsuario][numeroUsuario];
            int promedio=0;
            
            //Recogemos los valores en otro array y le damos la misma longitud
            int valoresPromedio[];
            valoresPromedio = new int [numeroUsuario];
            
            
            int valorMaximo = 0;
            System.out.println("");

            for( int i = 0 ; i <= numeroUsuario-1 ; i++ )
            {  
                 for( int j : matriz[i] )
                 {
                     // Populamos las posiciones de la matriz 
                     matriz[i][j] = numeroAleatorio();

                     // Tomamos el valor de la posicion actual
                      int valorActual = matriz[i][j];
                      System.out.print(""+ matriz[i][j]);
                      
                     // Comparamos si el valor actual con el maximo
                          if(valorMaximo < valorActual )
                          {  
                              valorMaximo = valorActual ;
                          }
                 }
                 //Almacenamos en un array el valor maximo de la fila
                 System.out.println("     Valor Maximo---> "+valorMaximo);
                 valoresPromedio[i] = valorMaximo;
                 valorMaximo = 0;
            }
          
          
            
                    
                    for( int valor : valoresPromedio)
                    {
                        //Sumamos todos los valores maximos
                        promedio += valor ;
                    }
                      //calculamos el promedio dividiendo la suma de todos los valores maximos entre el numero del usuario
                      promedio /= numeroUsuario;
                      System.out.println("");
         
            System.out.println("     Valor Promedio ---> "+ promedio);
            
            
   }    
  
}