public class Client {

    /*
     * nume clienti (nume + prenume)> oarecum se va tine aici o baza de date a clientilor
     */

    private String nume;
    private String prenume;

    public Client(String nume, String prenume) {
        this.nume = nume;
        this,prenume = prenume;
    }

    public String getNumeComplet() {
        return nume + " " + prenume;
    }

}
