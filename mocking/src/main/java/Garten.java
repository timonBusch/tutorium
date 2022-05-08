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
     * @return Pflanzen die Unkraut hatten
     */
    public List<T> removeUnkraut() {
        List<T> unkrautListe = new ArrayList<>();
        for(T pflanze : pflanzen) {
            if(pflanze.getUnkraut()){
                unkrautListe.add(pflanze);
            }else {
                pflanze.unkrautPfluecken();
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

    /**
     * Gibt Anzahl der Pflanzen im Garten zurueck
     * @return Pflanzen Anzahl
     */
    public int getGartenSize() {
        return pflanzen.size();
    }

}
