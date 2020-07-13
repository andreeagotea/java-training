
public class Pozitie { 
    private Piesa piesa; 
    private int a; //piesa a
    private int b; //piesa b
  
    public Pozitie(int a, int b, Piesa piesa) 
    { 
        this.setPiesa(piesa); 
        this.setA(a); 
        this.setB(b); 
    } 
  
    public Piesa getPiesa() 
    { 
        return this.piesa; 
    } 
  
    public void setPiesa(Piesa p) 
    { 
        this.piesa = p; 
    } 
  
    public int getA() 
    { 
        return this.a; 
    } 
  
    public void setA(int a) 
    { 
        this.a = a; 
    } 
  
    public int getB() 
    { 
        return this.b; 
    } 
  
    public void setB(int b) 
    { 
        this.b = b; 
    } 
} 