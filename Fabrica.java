import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    /*
     * In comentariul de mai jos, doream doar sa scot in evidenta ca desi nu stiu
     * scrie cod asa bine,
     * inteleg ceea ce mi se cere, si ma gandesc ca e mai important sa avem logica
     * si sa intelegem ceea ce ni se cere
     * - in aceasta clasa trebuie facuti 3 membrii :
     * 1. o lista pentru membrii
     * 2. lista pentru angajati
     * 3. lista acte
     * - are abilitatea de a concedia
     * - vede membrii : Activ/Neactiv, Nume + Prenume
     * - client nou
     * - vede toti clientii
     * -
     * 
     */

    private List<Angajat> angajati;
    private List<Client> clienti;
    private List<Act> acte;

    public Fabrica() {
        angajati = new ArrayList();
        clienti = new ArrayList();
        acte = new ArrayList();
    }

    public void adaugaAngajat(Muncitor muncitor1) {
        angajati.add(muncitor1);
    }

    public void concediazaAngajat(Angajat angajat) {
        angajati.remove(angajat);
    }

    public void afisareAngajati() {
        for (Angajat angajat : angajati) {
            String idAngajat;
            System.out.println(angajat.afisareNumeComplet() + " (" + angajat() + ")" + "cu ID ul" + idAngajat);
        }
    }

}
