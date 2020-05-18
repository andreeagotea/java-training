package proiect1;

import java.util.Date;

public class PersoanaBuilder {
    
    private Destinatar persoana = null;
    
    public PersoanaBuilder() {
        persoana = new Destinatar();
    }
    
    public PersoanaBuilder cuNumele(String nume) {
        this.persoana.setNume(nume);
        return this;
    }
    
    public PersoanaBuilder cuPrenumele(String prenume) {
        this.persoana.setPrenume(prenume);
        return this;
    }
        
    public PersoanaBuilder cuInaltime(float inaltime) {
        this.persoana.setInaltime(inaltime);
        return this;
}
    
    public PersoanaBuilder cuGreutate(float greutate) {
        this.persoana.setGreutate(greutate);
        return this;
    }
    
    public PersoanaBuilder cuDataNasterii(String dataNasterii) {
        this.persoana.setDataNasterii(dataNasterii);
        return this;
    }
    
    public Destinatar creeaza() {
        return persoana;
    }
    
    public PersoanaBuilder cuAdresa(String Adresa) {
        this.persoana.setAdresa(Adresa);
        return this;
    }
    
}
