package maestre.ejercicio1;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jfunez
 */
public class Lanzador {
    
    
    
    //E1
    static public String fusionarCadenas(String cad1, String cad2){
        String cadResultado = null;
        System.out.println("");
        System.out.println("Cad1: " + cad1);
        System.out.println("Cad2: " + cad2);
        System.out.println("");
        
        cadResultado = cad1 + cad2;
                
       return cadResultado;
    }
    
    //E2
    static public int numeroRepeticiones(String cadena, char letra){
        
        int repeticiones = 0;
        char letraCadena;
        
        
        for (int i = 0;i< cadena.length(); i++){
               letraCadena = cadena.charAt(i);
               
               if( letraCadena == letra){
                   repeticiones++;
               } 
        }
    
    
        return repeticiones;
    }
    
    
    //E3
    static public boolean esPalindroma(String cadenaCandidata){
       
        boolean confirmacion = false;
        
     if(cadenaCandidata.equals("")){
     
         return false; //Si nos mandan algo en blanco
     }
     
        
     cadenaCandidata = cadenaCandidata.toLowerCase().replaceAll(" ", ""); //Quitamos espacios en blancos y ponemos todos los caracters en minusculas;

   
     
     //Solucion propuesta antes de haber hecho el ejercicio 4 (Anti Kiss solution)
    
                           
             String CadenaRevertida = "";
            
         for (int i = 1 ; i <= cadenaCandidata.length() ; i++)
         {
             
           CadenaRevertida += String.valueOf(cadenaCandidata.charAt(cadenaCandidata.length() - i));
         
              
         }
        
        System.out.println("CadenaRevertida: " +CadenaRevertida );
        System.out.println("");
           
        if (CadenaRevertida.equals(cadenaCandidata) )
        {
        confirmacion = true;
        }
     
  //Retornamos el resultado 
        
        return confirmacion;
    }
    
    
     static public String RevertirCadena(String cadenaPararevertir){
     
      String CadenaRevertida = "";
         for (int i = 1 ; i <= cadenaPararevertir.length() ; i++){
             
           CadenaRevertida += String.valueOf(cadenaPararevertir.charAt(cadenaPararevertir.length() - i));
 
            
       }
     
     
        return CadenaRevertida;
     
     
     }
    
    
    public static void main(String args[])
  {
      
      
  //E1
      
    System.out.println("------------");
    System.out.println("Ejercicio 1");
      
    String cad1 = "hola";
    String cad2 = "pepito";
    String cadResultado = null;
    
    cadResultado = fusionarCadenas(cad1,cad2);
    
      System.out.println("Resultado: "+ cadResultado);
      
   
      
  //E2
      System.out.println("------------");
      System.out.println("Ejercicio 2");
   
    int vecesRepetida = 0;
    char letra = 'p';
    
      System.out.println("");
    
      System.out.println("Cadena: "+ cadResultado);
      System.out.println("Letra: " + letra);
      
      System.out.println("");

    vecesRepetida = numeroRepeticiones(cadResultado,letra);
  
      System.out.println("Resultado: " + vecesRepetida + " veces repetida");
    
  
      
  //E3
      System.out.println("------------");
      System.out.println("Ejercicio 3");
    
  
      
    String   cadenaCandidata = "";
    
    //Palindromas 
    //       cadenaCandidata = "Tenet";
           cadenaCandidata = "A luna ese anula";
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
    //       cadenaCandidata = "ola";
 
      System.out.println("");
      System.out.println("cadenaCandidata: "+ cadenaCandidata);

   boolean confirmacion = esPalindroma(cadenaCandidata);
   
      System.out.print("Resultado: ");
   
   if (confirmacion){
       System.out.println("palindroma.");
   } else{
       System.out.println("no palindroma.");
   }

  //E4
      System.out.println("------------");
      System.out.println("Ejercicio 4");
      
   String   cadenaParaRevertir = "A luna ese anula";
   
   
   String cadenaRevertida = RevertirCadena(cadenaParaRevertir);
      System.out.println("");
      System.out.println("cadenaParaRevertir: "+ cadenaParaRevertir);
      System.out.println("");
      System.out.println("Resultado:"+ cadenaRevertida);
      System.out.println("");
   
   
   
      
      
      
      
  
  
   
   
   
  }
    
    
}
