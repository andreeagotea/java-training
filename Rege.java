
public class Rege extends Piesa { 
    private boolean Rocada = false; 
  
    //Rocada constă în mutarea regelui două pătrățele în direcția turnului, urmată de mișcarea turnului peste rege și așezarea lui lângă el
    
    
    public Rege(boolean alba) 
    { 
        super(alba); 
    } 
  
    public boolean Rocada() 
    { 
        return this.Rocada == true; 
    } 
  
    public void setRocada(boolean Rocada) 
    { 
        this.Rocada = Rocada; 
    } 
  
   
    public boolean Mutare(Tabladejoc tabladejoc, Pozitie start, Pozitie sfarsit) 
    { 
        
        if (end.getPiesa().Alba() == this.Alba()) { 
            return false; 
        } 
  
        int a = Math.abs(start.getA() - end.getA()); 
        int b = Math.abs(start.getB() - end.getB()); 
        if (a + b == 1) { 
    
            return true; 
        } 
  
        return this.RocadaValida(tabladejoc, start, sfarsit); 
    } 
  
    private boolean RocadaValida(Tabladejoc tabladejoc,Pozitie start, Pozitie sfarsit) 
    { 
  
        if (this.Rocada()) { 
            return false; 
        } 
  
    } 
  
    public boolean Rocada(Pozitie start, Pozitie sfarsit) 
    { 
        
    } 
} 