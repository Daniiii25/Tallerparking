
package Tallerca;


public class Tallerca {
    
     public static void main (String [] args ) {
         //codigo principal --> ejecutar todo
       
         Chofer_Modelo obj_chofer = new Chofer_Modelo("danilo", "cardenas","1234567890");
         Chofer_Modelo obj_chofer2 = new Chofer_Modelo("juan", "rubio","0987654321");
         
         obj_chofer.setNombre_chofer("Pedro");
         obj_chofer2.setCedula_chofer("0987654321");
     }
          
          String dato_nombre = obj_chofer.getNombre_chofer();
          System.out.println("nombre chofer" + dato_nombre);
          
          
     }

}
 