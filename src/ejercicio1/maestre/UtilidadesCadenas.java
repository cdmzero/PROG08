/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.maestre;

/**
 *
 * @author jfunez
 */
public class UtilidadesCadenas {
    
    String cadena1;
    String cadena2;
    String cadenaResultante;
    

    public UtilidadesCadenas(String cadena1, String cadena2, String cadenaResultante) {
        this.cadena1 = cadena1;
        this.cadena2 = cadena2;
        this.cadenaResultante = cadenaResultante;
    }
    
    
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
       
       //Si las iteraciones estimadas(impar o par cambiand) han sido match, bingo
       
       if (coincidencias == iteraciones ){
           
           confirmacion = true;
           }
       
      
      //Retornamos el resultado 
       
        
        return confirmacion;
    }
    
    
     static public String RevertirCadena(String cadenaPararevertir){
     
      String CadenaRevertida = "";
         for (int i = 1 ; i < cadenaPararevertir.length() +1 ; i++){
           
           
        
           
           CadenaRevertida += String.valueOf(cadenaPararevertir.charAt(cadenaPararevertir.length() - i));
         
          // System.out.println("contador de coincidencia:"+coincidencias);
 
            
       }
     
     
        return CadenaRevertida;
     
     
     }
    
    
    

    public String getCadena1() {
        return cadena1;
    }

    public void setCadena1(String cadena1) {
        this.cadena1 = cadena1;
    }

    public String getCadena2() {
        return cadena2;
    }

    public void setCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }

    public String getCadenaResultante() {
        return cadenaResultante;
    }

    public void setCadenaResultante(String cadenaResultante) {
        this.cadenaResultante = cadenaResultante;
    }
    
    
}
