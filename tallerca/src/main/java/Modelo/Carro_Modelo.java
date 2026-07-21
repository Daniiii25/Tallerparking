
package Modelo;


public class Carro_Modelo {
    
    String modelo_carro = " ";
    String color_carro = " ";
    String placa_carro = "";
    
    
      public Carro_Modelo (String dato_modelo, String dato_color, String inf_placa){
        this.modelo_carro = dato_modelo;
        this.color_carro = dato_color;
        this.placa_carro = inf_placa;
        
        
          
}

    public String getModelo_carro() {
        return modelo_carro;
    }

    public void setModelo_carro(String modelo_carro) {
        this.modelo_carro = modelo_carro;
    }

    public String getColor_carro() {
        return color_carro;
    }

    public void setColor_carro(String color_carro) {
        this.color_carro = color_carro;
    }

    public String getPlaca_carro() {
        return placa_carro;
    }

    public void setPlaca_carro(String placa_carro) {
        this.placa_carro = placa_carro;
    }
    
    
    public void buscar_placa (String inf_placa){
            System.out.println("buscando placa...");
    }


    
 
}
