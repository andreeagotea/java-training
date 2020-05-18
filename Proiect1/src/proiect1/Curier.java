package proiect1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Curier extends Persoana {
    
    
private PropertyChangeSupport support;
private String numeFirma;
private String numardeTelefon;
private List<Comanda> listaComenzi;

public Curier() {
    support = new PropertyChangeSupport(this); 
}

    public String getNumeFirma() {
        return numeFirma;
    }

    public void setNumeFirma(String numeFirma) {
        this.numeFirma = numeFirma;
    }

    public String getNumardeTelefon() {
        return numardeTelefon;
    }

    public void setNumardeTelefon(String numardeTelefon) {
        this.numardeTelefon = numardeTelefon;
    }

    public List<Comanda> getListaComenzi() {
        return listaComenzi;
    }

    public void setListaComenzi(List<Comanda> listaComenzi) {
        this.listaComenzi = listaComenzi;
    }
    
    public void onoreazaComanda(Comanda comandaPentruLivrat) {
        for (Comanda comanda : this.listaComenzi) {
            if (comanda.getAdresa().equals(comandaPentruLivrat.getAdresa())) {
                support.firePropertyChange("comanda", comanda, comandaPentruLivrat);
                comanda = comandaPentruLivrat;
                break;
            }
        }   
    }
    
    public void addListener(PropertyChangeListener propertyListener) {
        support.addPropertyChangeListener(propertyListener);
    }
     
}
