import java.math.MathContext;

public class Cal extends Piesa

{ 
    public Cal(boolean Alba) 
    { 
        super(Alba); 
    } 
  
    public boolean Mutare(Tabladejoc tabladejoc, Pozitie start, Pozitie sfarsit) 
    {  
        if (end.getPiesa().Alba() == this.Alba()) { 
            return false; 
        } 
  
        int a = Math.abs(start.getA() - end.get()); 
        int b = Math.abs(start.getB() - end.getB()); 
        return a * b == 2; 
    } 
} 