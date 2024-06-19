import java.util.ArrayList;
import java.util.List;

public class Muncitor extends Angajat {
    /*
     * nume :
     * prenume :
     * functia :
     * se va afisa salariu care ii e alocat + 10% * an de munca
     * - asta inseamna ca vom avea o metoda care va afisa numarul de ani de cand e
     * muncitor in Fabrica
     * afisarea numelui complet(nume + prenume = procesul de concatenare) a
     * angajatului + functia de (Muncitor)
     * - vom avea in clasa asta un String de Taskuri
     */

    private List<String> tasks;

    public Muncitor(String nume, String prenume, double salariu, int vechime) {
        super(nume, prenume, salariu, vechime);
        tasks = new ArrayList();
    }

    public void adaugaTasks(String responsabilitate) {
        tasks.add(responsabilitate);
    }

    public String afisareFunctie() {
        return "Muncitor";
    }

}
