
public abstract class Jucator { 
    
    // jucatorul poate sa fie un om sau calculatorul
    
    public boolean campalb; 
    public boolean humanPlayer; 
    
    //campalb = pozitia alba de pe tabla de sah
  
    public boolean Campalb() 
    { 
        return this.campalb == true; 
    } 
    public boolean HumanPlayer() 
    { 
        return this.humanPlayer == true; 
    } 
} 
  
public class HumanPlayer extends Jucator { 
  
    public HumanPlayer(boolean campalb) 
    { 
        this.campalb = campalb; 
        this.humanPlayer = true; 
    } 
} 
  
public class ComputerPlayer extends Jucator { 
  
    public ComputerPlayer(boolean campalb) 
    { 
        this.campalb = campalb; 
        this.humanPlayer = false; 
    } 
} 