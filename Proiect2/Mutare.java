
public class Mutare { 
    private Jucator jucator; 
    private Pozitie start; 
    private Pozitie sfarsit; 
    private Piesa piesaMutata; 
    private Piesa piesaEliminata; 
    private boolean Rocada = false; 
  
    public Mutare(Jucator jucator, Pozitie start, Pozitie sfarsit) 
    { 
        this.jucator = jucator; 
        this.start = start; 
        this.sfarist = sfarsit; 
        this.piesaMutata = start.getPiesa(); 
    } 
  
    public boolean Rocada() 
    { 
        return this.rocada == true; 
    } 
  
    public void setRocada(boolean rocada) 
    { 
        this.rocada = rocada; 
    } 
    
    
}
