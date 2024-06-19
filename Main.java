public class Main {

    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        Muncitor muncitor1 = new Muncitor("Ion", "Dan", 3000, 5, idAngajat: "1");
        Manager manager1 = new Manager("Maria", "Pop", 5000, 7, idAngajat:"2");

        fabrica.adaugaAngajat(muncitor1);
        fabrica.adaugaAngajat(manager1);
    }
}