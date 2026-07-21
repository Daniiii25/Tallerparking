
package Modelo;

public class Pasajero_Modelo {
    
    String cedula ="";
    String nombrecom ="";
    
    public Pasajero_Modelo (String cedula, String nombre_completo){
          
        this.cedula= cedula;
        this.nombrecom = nombre_completo;
   
}

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombrecom() {
        return nombrecom;
    }

    public void setNombrecom(String nombrecom) {
        this.nombrecom = nombrecom;
    }



    
    
    
}

