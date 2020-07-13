
    public class Piesa { 
  
    private boolean eliminata = false; 
    private boolean alba = false; 
  
    public Piesa(boolean alba) 
    { 
        this.setAlba(alba); 
    } 
  
    public boolean Alba() 
    { 
        return this.alba == true; 
    } 
  
    public void setAlba(boolean alba) 
    { 
        this.alba = alba; 
    } 
  
    public boolean Eliminare() 
    { 
        return this.eliminare == true; 
    } 
  
    public void setEliminare(boolean eliminare) 
    { 
        this.eliminare = eliminare; 
    } 
    
     public abstract boolean Mutare(Tabladejoc tabladejoc, Pozitie start, Pozitie sfarsit); 
  
  
} 


    
    
