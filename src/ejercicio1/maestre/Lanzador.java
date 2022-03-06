package ejercicio1.maestre;

import static ejercicio1.maestre.UtilidadesCadenas.RevertirCadena;
import static ejercicio1.maestre.UtilidadesCadenas.esPalindroma;
import static ejercicio1.maestre.UtilidadesCadenas.fusionarCadenas;
import static ejercicio1.maestre.UtilidadesCadenas.numeroRepeticiones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jfunez
 */
public class Lanzador {
    
    
    public static void main(String args[])
  {
      
      
  //E1
      
    System.out.println("------------");
    System.out.println("Ejercicio 1");
      
    String cad1 = "hola";
    String cad2 = "pepito";
    String cadResultado = null;
    
    cadResultado = fusionarCadenas(cad1,cad2);
    
      System.out.println(cadResultado);
      
   
      
  //E2
      System.out.println("------------");
      System.out.println("Ejercicio 2");
   
    int vecesRepetida = 0;
    char letra = 'p';

    vecesRepetida = numeroRepeticiones(cadResultado,letra);
  
      System.out.println("La Letra " + letra + " esta " + vecesRepetida + " veces repetida");
    
  
      
  //E3
      System.out.println("------------");
      System.out.println("Ejercicio 3");
    
  
    String   cadenaCandidata = "";
    
    //Palindromas 
    //         cadenaCandidata = "Tenet";
    //       cadenaCandidata = "A luna ese anula";
    //       cadenaCandidata = "A mama Roma le aviva el amor a papa y a papa Roma le aviva el amor a mama";
    //       cadenaCandidata = "A mi loca Colima";
    //       cadenaCandidata = "olo";
    //       cadenaCandidata = "sapas";
   
    
    
  //No palindromas
     //      cadenaCandidata = "El enunciado y criterios de entrega";
     //      cadenaCandidata = "E luna ese anula";
     //      cadenaCandidata = "A mame Roma le aviva el amor a papa y a papa Roma le aviva el amor a mama";
     //      cadenaCandidata = "A mi loca gColima";
     //      cadenaCandidata = "pepito grillo";
     //      cadenaCandidata = "ola";
 
    
   boolean confirmacion = esPalindroma(cadenaCandidata);
   
      System.out.print("La cadena -> "+cadenaCandidata);
   
   if (confirmacion){
       System.out.println(" -> es palindroma.");
   } else{
       System.out.println(" -> no es palindroma.");
   }

  //E4
      System.out.println("------------");
      System.out.println("Ejercicio 4");
      
   String   cadenaParaRevertir = "hola como estas";
   
   
   String cadenaRevertida = RevertirCadena(cadenaParaRevertir);
   
      System.out.println("La cadena para revertir es -->"+ cadenaParaRevertir +" y el resultado es-->"+ cadenaRevertida);
   
   
   
      
      
      
      
  
  
   
   
   
  }
    
    
}
