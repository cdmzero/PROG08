/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.maestre;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jfunez
 */

public class Lanzador {
    
static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
static List<CuerpoCeleste> cuerposCelestes = new ArrayList<>();
static CuerpoCeleste cceleste = new CuerpoCeleste();

    
      static String Decision() throws IOException, Exception
      {
       int index = 0;
       
       ArrayList<ArrayList<String>> cceleste = new ArrayList<>(index);

       
       int nPreguntas=4;
       String decision = null;
       boolean menu = true;
          
          while (menu)
          { 
           System.out.println(" --- Menu Cuerpos celestes --- ");
                    try 
                    {
                    System.out.println("Añade el codigo");

                    int codigoCuerpo = Integer.parseInt(dato.readLine());

                    System.out.println("Añade el nombre");

                    String nombre = dato.readLine();

                    System.out.println("Añade el tipo");

                    String tipoCuerpo = dato.readLine();

                    System.out.println("Añade el diametro");

                   int diametro = Integer.parseInt(dato.readLine());
                   
                   
                    
                    if((nombre == null ) || (codigoCuerpo == 0 )|| (tipoCuerpo == null) || (diametro == 0))
                    {
                     throw new NumberFormatException("No puede ser nulo");
                    }else{
                    
                            for(int i=0; i < nPreguntas ; i++) {
                                
                           cceleste.add(new ArrayList());
                            
                           }
                        
                
                            cceleste.get(index).add(0, String.valueOf(codigoCuerpo));
                            cceleste.get(index).add(1, nombre);
                            cceleste.get(index).add(2, tipoCuerpo);
                            cceleste.get(index).add(3, String.valueOf(diametro));
                            }
                    boolean submenu = true;
                            while(submenu)
                            {
                                System.out.println("¿Deseas añadir mas cuerpos celestes? S,s o N,n ");

                                decision = dato.readLine();
                                
                                index++;

                                if("S".equals(decision) || "s".equals(decision) )
                                {
                                
                                submenu=false;
                                break;

                                }
                                else if("N".equals(decision) || "n".equals(decision))
                                {
                                 
                                    for (int i = 0 ; i < index ; i++){
                                            
                                            System.out.println("Index--->"+cceleste.get(i));
                                            
                                            
                                            for( int j = 0 ; j < cceleste.get(i).size() ; j++){
                                            
                                                System.out.println("Valores--->"+cceleste.get(i).get(j).toString());
                                            
                                            }
                                    }
                                    
                                menu=false;
                                submenu=false;
                                break;
                                }
                                else
                                {
                                    System.err.println("Opcion invalida");
                                }
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
        
       
            String decision =  Decision();
         
   
    }

   
    
    

    
  
}