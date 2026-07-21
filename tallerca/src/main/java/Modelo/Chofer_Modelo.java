
package Modelo;


public class Chofer_Modelo {
    //Inicializar variables
    String nombre_chofer = " ";
    String apellido_chofer = " ";
    String cedula_chofer = " ";
    private String cedula;
    private String apellido;
    private String nombre;


//constructor
    public Chofer_Modelo (String dato_nombre, String dato_apellido, String dato_cedula){
        this.nombre_chofer = dato_nombre;
        this.apellido_chofer = dato_apellido;
        this.cedula_chofer = dato_cedula;
  
        }     

    public String getNombre_chofer() {
        return nombre_chofer;
    }
    
    public String getApellido_chofer() {
        return apellido_chofer;
    }

 
    public String getCedula_chofer() {
        return cedula_chofer;
    }


    private boolean esTextoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
    
    private boolean esCedulaValida(String cedula) {
        return cedula != null && cedula.matches("\\d{8,10}");
    }
    
    public void setNombre(String nombre) {
        if (esTextoValido(nombre)) {
            this.nombre = nombre;
        }
        
    }

    public void setApellido(String apellido) {
        if (esTextoValido(apellido)) {
            throw new IllegalArgumentException("Completa el apellido ");
        }
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        if (esCedulaValida(cedula)) {
            throw new IllegalArgumentException("La cédula no tiene un formato válido");
        }
        this.cedula = cedula;
    }


}



