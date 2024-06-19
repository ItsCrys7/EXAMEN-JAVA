public class Angajat {

    /*
     * nume :
     * prenume :
     * functia :
     * activi / neactiv
     * angajat / neangajat
     * se va afisa salariu care ii e alocat + 10% * an de munca
     * - asta inseamna ca vom avea o metoda care va afisa numarul de ani de cand e angajatul in Fabrica
     * afisarea numelui complet (nume + prenume = procesul de concatenare) a angajatului + functia de (Angajat) 
     */

    private String nume;
    private String prenume;
    private double salariu;
    private int vechime;

    public Angajat(String nume, String prenume, double salariu, int vechime) {
        this.nume = nume;
        this.prenume = prenume;
        this.salariu = salariu;
        this.vechime = vechime;
    }

    public String afisareNumeComplet() {
        return nume + " " + prenume;
    }
}
