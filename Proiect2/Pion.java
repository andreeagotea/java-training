
public class Pion extends Piesa
{ 
    public Pion(boolean Alba) 
    { 
        super(Alba); 
    } 
  
    public boolean Mutare (Tabladejoc tabladejoc, Pozitie start,Pozitie sfarsit) 
    { 
       
        if (end.getPiesa().Alba() == this.Alba()) { 
            return false; 
        } 
  
        int a = Math.abs(start.getA() - end.getA()); 
        int b = Math.abs(start.getB() - end.getB()); 
        return a * b == 2; 
    } 
} 