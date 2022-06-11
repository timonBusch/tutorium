import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Garten<T extends Pflanze> {

    private List<T> pflanzen;
    private static final Logger LOGGER = Logger.getLogger(Garten.class.getName());

    public Garten() {
        pflanzen = new ArrayList<>();
    }

    /**
     * Gibt alle Informationen der Pflanzen im Garten aus
     */
    public void printGartenInfo() {
        for(T pflanze : pflanzen) {
            LOGGER.info("Name: " + pflanze.getName() + "\n" + "Zustand: " + pflanze.getZustand().name());
        }
    }

    /**
     * Entfernt Unkraut aus dem Garten
     */
    public List<T> removeUnkraut() {
        List<T> unkrautListe = new ArrayList<>();
        for(T pflanze : pflanzen) {
            if(pflanze.getUnkraut()){
                unkrautListe.add(pflanze);
                pflanze.unkrautPfluecken();
            }
        }
        return unkrautListe;
    }

    /**
     * Check, ob die Pflanzen im Garten genug Wasser habt,
     * sobald die Wassermenge geaendert wurde gehen wir davon
     * aus, dass die Pflanze gesund ist
     */
    public void checkWater() {
        for(Pflanze pflanze: pflanzen) {
            if (pflanze.getWasserMenge() != 2) {
                pflanze.setZustand(ZUSTAND.GESUND);
            }
        }
    }

    /**
     * Fuegt eine Pflanze dem Garten hinzu
     */
    public void addToGarten(T pflanze) {
        pflanzen.add(pflanze);
    }


}
