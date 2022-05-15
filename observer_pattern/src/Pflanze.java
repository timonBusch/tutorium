import java.util.logging.Logger;

/**
 * Muss von einer Pflanzen Klasse implementiert werden
 * @author Timon Buschendorf
 */
public abstract class Pflanze {

    private boolean unkraut;
    private final String name;
    private int wasserMenge; // In L
    private Zustand zustand;
    private static final Logger LOGGER = Logger.getLogger(Pflanze.class.getName());

    public Pflanze(String name) {
        this.name = name;
        int tmp = (int) (Math.random() * 2 +1);
        this.unkraut = tmp != 1;
        if(this.unkraut) {
            this.zustand = Zustand.WELK;
        }else {
            this.zustand = Zustand.GESUND;
        }
        this.wasserMenge = 2;
    }

    /**
     * Liefert die Art der Pflanze zurueck
     * @return Pflanzenart
     */
    public String getName() {
        return this.name;
    }

    /**
     * Entfernt Unkraut von einer Pflanze
     */
    public final void unkrautPfluecken() {
        this.unkraut = false;
        LOGGER.info("Unkraut wurde gepflueckt");
    }

    /**
     * Gibt den Status zurueck, ob die Pflanze mit Unkraut befallen ist
     * @return Ist die Pflanze mit Unkraut befallen oder nicht
     */
    public final boolean getUnkraut() {
        return this.unkraut;
    }

    /**
     * Gibt Menge zurueck die von der Pflanze aktuell gebraucht wird
     * @return Wassermenge
     */
    public int getWasserMenge() {
        return wasserMenge;
    }

    /**
     * Fuegt Wasser zur allgemeinen Wassermenge hinzu
     * @param wasserMenge Zusaetzliche Wassermenge
     */
    public void addWasserMenge(int wasserMenge) {
        this.wasserMenge += wasserMenge;
    }

    /**
     * Gibt den aktuellen Gesundheitszustand der Pflanze zurueck
     * @return Zustand der Pflanze
     */
    public Zustand getZustand() {
        return zustand;
    }

    /**
     * Legt den Gesundheitszustand der Pflanze fest
     * @param zustand
     */
    public void setZustand(Zustand zustand) {
        this.zustand = zustand;
    }
}
