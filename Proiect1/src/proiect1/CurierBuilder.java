package proiect1;

import java.util.List;

public class CurierBuilder {
    
    private Curier curier = null;
    
    public CurierBuilder() {
        curier = new Curier();
    }
    
    public CurierBuilder cuPrenumele(String prenume) {
        this.curier.setPrenume(prenume);
        return this;
    }
        
    public CurierBuilder cuNumele(String nume) {
        this.curier.setNume(nume);
        return this;
    }
    
    public CurierBuilder cuNumeFirma(String numeFirma) {
        this.curier.setNumeFirma(numeFirma);
        return this;
    }    
    
    public CurierBuilder cuNumarTelefon(String numarTelefon) {
        this.curier.setNumardeTelefon(numarTelefon);
        return this;
    }    
    
    public CurierBuilder cuListaDeComenzi(List<Comanda> comenzi) {
        this.curier.setListaComenzi(comenzi);
        return this;
    }  
    
    public Curier creeaza() {
        return this.curier;
    }
    
}
