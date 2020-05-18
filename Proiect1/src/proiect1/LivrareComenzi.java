/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiect1;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andreeagotea
 */
public class LivrareComenzi implements PropertyChangeListener {
    
    private List<Destinatar> listaDestinatari = new ArrayList<>();
    
    public void start() {
                     
        PersoanaBuilder persoanaBuilder = new PersoanaBuilder();
        Destinatar persoana = persoanaBuilder
                .cuNumele("Gotea")
                .cuPrenumele("Andreea")
                .cuInaltime(1.75f)
                .cuGreutate(50.5f)
                .cuDataNasterii("06.08.1999")
                .cuAdresa("Mihai Eminescu 13")
                .creeaza();
        
        PersoanaBuilder persoanaBuilder2 = new PersoanaBuilder();
        Destinatar persoana2 = persoanaBuilder2
                .cuNumele("Pop")
                .cuPrenumele("Dana")
                .cuInaltime(1.64f)
                .cuGreutate(80.1f)
                .cuDataNasterii("10.08.1989")
                .cuAdresa("Lalelelor 12")
                .creeaza();
        
        listaDestinatari.add(persoana);
        listaDestinatari.add(persoana2);

        
      Comanda comanda1 = new Comanda();
      comanda1.setAdresa("Mihai Eminescu 13");
      comanda1.setNumarAWB("890291301239");
      comanda1.setStatusComanda(StatusComanda.PRELUATA);
      
      Comanda comanda2 = new Comanda();
      comanda2.setAdresa("Lalelelor");
      comanda2.setNumarAWB("823388378373");
      comanda2.setStatusComanda(StatusComanda.PRELUATA);
      
      List<Comanda> listaComenzi = new ArrayList<>();
      listaComenzi.add(comanda1);
      listaComenzi.add(comanda2);
        
       CurierBuilder curierBuilder= new CurierBuilder();
       Curier curier = curierBuilder
                .cuNumele("Paul")
                .cuPrenumele("Gatea")
                .cuNumeFirma("DPD")
                .cuNumarTelefon("0756754389")
                .cuListaDeComenzi(listaComenzi)
                .creeaza();
       
       curier.addListener(this);
       
       Comanda comandaDePredat = new Comanda();
       comandaDePredat.setAdresa("Mihai Eminescu 13");
       comandaDePredat.setNumarAWB("890291301239");
       comandaDePredat.setStatusComanda(StatusComanda.PREDATA);
       
       curier.onoreazaComanda(comandaDePredat);      
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Comanda comanda = (Comanda) evt.getNewValue();
        for (Destinatar destinatar : listaDestinatari) {
            if (destinatar.getAdresa().equals(comanda.getAdresa())) {
                System.out.println("Destinatarul cu numele: " + destinatar.getNume() + " si adresa: " + destinatar.getAdresa() + " a intrat in posesia coletului");
            } else {
                System.out.println("Comanda pentru destinatarul cu numele: " + destinatar.getNume() + " nu a fost livrata inca");
            }
        }
    }
     

}
