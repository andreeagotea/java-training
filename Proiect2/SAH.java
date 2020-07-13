
public class Sah { 
    private Jucator[] Jucator; 
    private Tabladejoc tabladejoc; 
    private Jucator mutarecurenta; 
    private StatusulJocului status; 
    private List<Mutare> miscare; 
  
    
public class StatusulJocului { 
    activ;      //jocul e in desfasurare
    castig_alb; //castiga cel cu piesele albe
    castig_negru; //castiga cel cu piesele negre
    pierdut; //unul dintre jucatori a pierdut
    pat; //regele nu este în șah, dar nici nu poate face vreo mutare legală. Această situație de imposibilitate a efectuării de mutări se numește pat.
    renuntare; //unul dintre jucatori a renuntat
} 
    
    
    private void initializare(Jucator p1, Jucator p2) 
    { 
        Jucator[0] = p1; //p1 = jucatorul 1
        Jucator[1] = p2; // p2 = jucatorul 2
  
        tabladejoc.Loc(); 
  
        if (p1.campalb()) { 
            this.mutarecurenta = p1; 
        } 
        else { 
            this.mutarecurenta = p2; 
        } 
  
    } 
  
    public boolean sfarsit() 
    { 
        return this.getStatus() != StatusulJocului.activ; 
    } 
  
    public boolean getStatus() 
    { 
        return this.status; 
    } 
  
    public void setStatus(StatusulJocului status) 
    { 
        this.status = status; 
    } 
  
    public boolean MutareaJucatorului (Jucator jucator, int startA, int startB, int sfarsitA, int sfarsitB) 
    { 
        Pozitie startLoc = tabladejoc.getLoc(startA, startB); 
        Pozitie sfarsitLoc = tabladejoc.getLoc(startA, sfarsitB); 
        Mutare mutare = new Mutare(jucator, startLoc, sfarsitLoc); 
        return this.Mutare(mutare,jucator); 
    } 
  
    private boolean MiscareEfectuata(Mutare mutare, Jucator jucator) 
    { 
        Piesa sourcePiesa = mutare.getStart().getPiesa(); 
        if (sourcePiesa == null) { 
            return false; 
        } 
  
        if (jucator != mutarecurenta) { 
            return false; 
        } 
  
        if (sourcePiesa.Alba() != jucator.campalb()) { 
            return false; 
        } 
  
        if (!sourcePiesa.Mutare(tabladejoc, mutare.getStart(), mutare.getSfarsit())) { 
            return false; 
        } 
  
        Piesa destPiesa = mutare.getStart().getPiesa(); 
        if (destPiesa != null) { 
            destPiesa.setEliminata(true); 
            mutare.setPiesaEliminata(destPiesa); 
        } 
  
        
     
        // mutarea piesei ca fiind cea de sfarsit/final
        mutare.getSfarsit().setPiesa(mutare.getStart().getPiesa()); 
        mutare.getStart.setPiesa(null); 
  
        if (destPiesa != null && destPiesa instanceof Rege) { 
            if (jucator.campalb()) { 
                this.setStatus(StatusulJocului.castig_alb); 
            } 
            else { 
                this.setStatus(StatusulJocului.castig_negru); 
            } 
        } 
  
        // randul urmatorului jucator
        if (this.miscarecurenta == jucator[0]) { 
            this.miscarecurenta = jucator[1]; 
        } 
        else { 
            this.miscarecurenta = jucator[0]; 
        } 
  
        return true; 
    } 
} 

 





