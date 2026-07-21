
package Vista;

import java.util.Scanner;


public class Vista_chofer {
    
    public String tomar_nombre (){
       Scanner teclado = new Scanner (System.in);
       String nombre = teclado.next();
       return nombre;
     
    }
    public String tomar_apellido(){
        Scanner teclado = new Scanner (System.in);
        String apellido = teclado.next();
        return apellido;
        
    }
    
    public String tomar_cedula(){
        Scanner teclado = new Scanner (System.in);
        String cedula = teclado.next();
        return cedula;
     }
    
    
    
    
}
           
        
  

