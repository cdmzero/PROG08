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
        
       
            int n =  Decision();
            int matriz[][];
            matriz =  new int[n][n];
            
            int valoresPromedio[];
            valoresPromedio = new int [n];
            
            
            int valorMaximo = 0;
   

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
          
          
          int promedio=0;
          
                  for( int valor : valoresPromedio){
                      promedio += valor ;
                  }
                  
                    promedio /= n; 
         
         System.out.println("Valor promedio --->"+ promedio);
            
            
    }

   
    
    

    
  
}