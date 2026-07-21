
package Modelo;


public class Motor_Modelo {
    
   String combustible = "";
   String model_Serie = "";
   

    public Motor_Modelo (String capacidadml, String serie){
          
        this.combustible= capacidadml;
        this.model_Serie = serie;
        
}

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getModel_Serie() {
        return model_Serie;
    }

    public void setModel_Serie(String model_Serie) {
        this.model_Serie = model_Serie;
    }
    
    
    

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
}
