import java.util.ArrayList;
import java.util.List;

public class Garten<T extends Pflanze> {

    private List<T> pflanzen;

    public Garten() {
        pflanzen = new ArrayList<>();
    }

    /**
     * Gibt alle Informationen der Pflanzen im Garten aus
     */
    public void printGartenInfo() {
        for(T pflanze : pflanzen) {
            System.out.println(pflanze.getName());
        }
    }

    /**
     * Entfernt Unkraut aus dem Garten
     */
    public Garten<T> removeUnkraut() {
        Garten<T> unkrautListe = new Garten<>();
        for(T pflanze : pflanzen) {
            if(pflanze.getUnkraut()){
                unkrautListe.addToGarten(pflanze);
                pflanze.unkrautPfluecken(pflanze);
            }

        }
        return unkrautListe;
    }

    /**
     * Fuegt eine Pflanze dem Garten hinzu
     */
    public void addToGarten(T pflanze) {
        pflanzen.add(pflanze);
    }

}
