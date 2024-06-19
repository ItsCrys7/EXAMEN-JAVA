import java.util.ArrayList;

public class Manager extends Angajat{

    public Manager(String nume, String prenume, double salariu, int vechime, ArrayList subordonati) {
        super(prenume, prenume, salariu, vechime);
        subordonati = new ArrayList();
    }

    public void adaugaSubordonat(Muncitor muncitor, ArrayList subordonati) {
        subordonati.add(muncitor);
    }

    /*
     * nume :
     * prenume :
     * functia :
     * se va afisa salariu care ii e alocat + 10% * an de munca
     * - asta inseamna ca vom avea o metoda care va afisa numarul de ani de cand e
     * managerul in Fabrica
     * afisarea numelui complet(nume + prenume = procesul de concatenare) a
     * angajatului + functia de (Manager)
     * - Managerul poate avea mai multi muncitori sub el (subclasa), dar nu Manageri
     * 
     */
}