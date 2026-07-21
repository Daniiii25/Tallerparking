
package Controlador;

import Modelo.Chofer_Modelo;
import Vista.Vista_chofer;

public class General_controller {
    public Vista_chofer obj_vista;
    public General_controller (Vista_chofer obj_vista){
       this.obj_vista = obj_vista;
     
    }
    
      public void procesar_datos(){
         String dato_nombre = this.obj_vista.tomar_nombre();
         String dato_apellido = this.obj_vista.tomar_apellido();
         String dato_cedula = this.obj_vista.tomar_cedula();
         Chofer_Modelo obj_chofer = new Chofer_Modelo(dato_nombre, dato_apellido, dato_cedula);
         obj_chofer.setNombre(dato_nombre);
         obj_chofer.setApellido(dato_apellido);
         obj_chofer.setCedula(dato_cedula);
         
         
         
         
          
      }
    
}
