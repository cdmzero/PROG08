/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.maestre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 *
 * @author jfunez
 */

public class Lanzador {
    
static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
static List<CuerpoCeleste> cuerposCelestes = new ArrayList<>();
static CuerpoCeleste cceleste = new CuerpoCeleste();

    
      static void Decision() throws IOException, Exception
      {
       
       ArrayList<CuerpoCeleste> listaCuerpos = new ArrayList<>();

      
       String decision = null;
       boolean menu = true;
          
          while (menu)
          { 
           System.out.println(" --- Menu Cuerpos celestes --- ");
                    try 
                    {
                    System.out.print("Añade el codigo --> ");

                    int codigoCuerpo = Integer.parseInt(dato.readLine());
                    
                    System.out.println("");

                    System.out.print("Añade el nombre --> ");

                    String nombre = dato.readLine();
                    
                    System.out.println("");

                    System.out.print("Añade el tipo --> ");

                    String tipoCuerpo = dato.readLine();
                    
                    System.out.println("");

                    System.out.print("Añade el diametro --> ");
                    int diametro = Integer.parseInt(dato.readLine());
                    System.out.println("");
                   
                    
                    if((nombre.isEmpty()) || (codigoCuerpo <= 0 )|| (tipoCuerpo.isEmpty()) || (diametro <= 0)) //controlamos que no haya datos en nulos
                    {
                     throw new NumberFormatException("Ningun dato puede ser nulo o negativo, vuelve a intentarlo");
                    }
                    else
                    {
                        //Costruimos el objeto con las preguntas como valores a los atributos y lo añadimos a la lista
                         listaCuerpos.add(new CuerpoCeleste(codigoCuerpo,nombre, tipoCuerpo, diametro));
                        
                           
                      }
                            boolean submenu = true;
                            while(submenu)
                            {
                                System.out.println("¿Deseas añadir mas cuerpos celestes? S,s o N,n ");

                                decision = dato.readLine();
                                

                                if("S".equals(decision) || "s".equals(decision) )
                                {
                                
                               
                                submenu=false;
                                break;

                                }
                                else if("N".equals(decision) || "n".equals(decision))
                                {
                                 //Listamos todos los cuerpos desde el primer hasta el ultimo index
                                    for (int i = 0 ; i < listaCuerpos.size() ; i++){
                                            
                                            System.out.println("Cuerpo celeste---> "+listaCuerpos.get(i));
                                            
                                          
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
      
      }
      

          
    public static void main(String args[]) throws IOException, Exception
    {
        
       
             Decision();
         
   
    }

   
    
    

    
  
}