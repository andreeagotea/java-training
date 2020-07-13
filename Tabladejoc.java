
public class Tabladejoc { 
    Pozitie [][] loc; 
    
    //loc = locul pionului pe tabla
  
    public Pozitie getLoc(int a, int b) 
    { 
  
        if (a < 0 || a > 8 || b < 0 || b > 8) { 
            throw new Exception("Index out of bound"); 
        } 
  
        return loc[a][b]; 
    } 
  
    public void Loc() 
    { 
        // exemplu de initializarea a unor piese de culoare alba 
        loc[0][1] = new Pozitie(0, 1, new Pion(true)); 
        loc[1][0] = new Pozitie(1, 0, new Pion(true)); 
        loc[2][1] = new Pozitie(1, 1, new Nebun(true)); 
         
  
        //exemplu de initializarea a unor piese de culoare neagra 
        loc[7][0] = new Pozitie(7, 0, new Pion(false)); 
        loc[7][1] = new Pozitie(7, 1, new Nebun(false)); 
        loc[5][1] = new Pozitie(5, 1, new Pion(false)); 

        
        
  
        // initializarea locurilor care nu au fost ocupate de nicio piesa 
        for (int i = 2; i < 6; i++) { 
            for (int j = 0; j < 8; j++) { 
                loc[i][j] = new Pozitie(i, j, null); 
            } 
        } 
    } 
} 