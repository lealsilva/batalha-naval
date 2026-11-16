
package batalhanaval.model;

public class Navio {
    
    private int tamanhoNavio;
    private int acertosNavio;
    private String tipoNavio;


    public int getTamanhoNavio() {
        return tamanhoNavio;
    }

  
    public void setTamanhoNavio(int tamanhoNavio) {
        this.tamanhoNavio = tamanhoNavio;
    }

 
    public int getAcertosNavio() {
        return acertosNavio;
    }

  
    public void setAcertosNavio(int acertosNavio) {
        this.acertosNavio = acertosNavio;
    }

 
    public String getTipoBarco() {
        return tipoNavio;
    }

 
    public void setTipoBarco(String tipoNavio) {
        this.tipoNavio = tipoNavio;
    }
    
    public Navio(int tamanhoNavio, String tipoNavio){
        this.tamanhoNavio = tamanhoNavio;
        this.tipoNavio = tipoNavio;
        
    }
}
