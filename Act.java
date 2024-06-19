public class Act {
    
    /* ID generat de sistem  pentru toti membrii
    - generare ID, care e privat
    - nu poate sa mai fie modificat, cel putin nu de utilizator
    - creez un 
    if(idAngajat = activ && angajat)
    {
        se va crea obiectul FluturasSalariu 
        {
            salariu + idAngajat
        }
    }   
    if (idAngajt = neangajat)
        {
        exception "Aceasta persoana nu mai este angajat in Fabrica"
        nu se mai emite FluturasSalariu
        }

     */

    private static int idCounter = 1;
    private int idAngajat;
    
    public Act() {
        this.idAngajat = idCounter++;
    }
    
    public int getId() {
        return idAngajat;
    }
}
