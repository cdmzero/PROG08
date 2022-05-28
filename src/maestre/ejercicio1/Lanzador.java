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
        
        cadResultado = cad1 + cad2;
                
       return cadResultado;
    }
    
    //E2
    static public int numeroRepeticiones(String cadena, char letra){
        
        int repeticiones = 0;
        char letraCadena = '?';
        
        
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
     
     /*
       char iLetra; //Primera letra por la izquierda
       char dLetra; //Primera letra por la derecha
       
       int coincidencias = 0; //contador de coincidencias
       int contador = 1; //contador para la cuenta regresiva de caracteres.
       int impar = 0; //si es impar debemos dar una iteracion extra para redondear al numero mayor entero.

       
       if (cadenaCandidata.length() % 2 != 0){
           impar = 1;
       }
       
      
       int iteraciones = (cadenaCandidata.length() / 2) + impar; //total iteraciones del bucle

       
       //recorremos la palabras por la izquierda y por la derecha y comparamos 
       for (int i = 0 ; i < iteraciones ; i++){
           
           
           int CuentaRegresiva = cadenaCandidata.length() - contador;
           
           iLetra = cadenaCandidata.charAt(i);
           
          // System.out.println(i+"vuelta: primera palabra -> letra: "+ nLetra );
         //  System.out.println("---");
         
           dLetra = cadenaCandidata.charAt(CuentaRegresiva);
           
          //   System.out.println(i+"vuelta: segunda palabra -> letra: "+ uLetra );
         //    System.out.println("--->");
         
         
         //Si hay match, 1 punto.
           
            if(iLetra == dLetra){

                 coincidencias++;
            }
          
          // System.out.println("contador de coincidencia:"+coincidencias);
 
            contador++;
       }
       
       //Si las iteraciones estimadas(impar o par cambiando) han sido match, bingo
       
       if (coincidencias == iteraciones ){
           
           confirmacion = true;
           }
      
      */
     
      //KISS Solution -> 
                           
             String CadenaRevertida = "";
            
         for (int i = 1 ; i < cadenaCandidata.length() +1 ; i++)
         {
             
           CadenaRevertida += String.valueOf(cadenaCandidata.charAt(cadenaCandidata.length() - i));
         
              
         }
        
        
           
        if (CadenaRevertida.equals(cadenaCandidata) )
        {
            System.out.println("true");
        confirmacion = true;
        }
     
  //Retornamos el resultado 
        
        return confirmacion;
    }
    
    
     static public String RevertirCadena(String cadenaPararevertir){
     
      String CadenaRevertida = "";
         for (int i = 1 ; i < cadenaPararevertir.length() +1 ; i++){
             
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
      
   String   cadenaParaRevertir = "A luna ese anula";
   
   
   String cadenaRevertida = RevertirCadena(cadenaParaRevertir);
   
      System.out.println("La cadena para revertir es -->"+ cadenaParaRevertir +" y el resultado es-->"+ cadenaRevertida);
   
   
   
      
      
      
      
  
  
   
   
   
  }
    
    
}
