/**
 * Muss von einer Pflanzen Klasse implementiert werden
 * @author Timon Buschendorf
 */
public class Pflanze {

    private boolean unkraut;
    private String name;

    public Pflanze(String name) {
        this.name = name;
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
    public void unkrautPfluecken() {
        this.unkraut = false;
    }

    /**
     * Liefert die Art der Pflanze zurueck
     * @return Pflanzenart
     */
    public void setUnkraut(boolean unkraut) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gibt den Status zurueck, ob die Pflanze mit Unkraut befallen ist
     * @return Ist die Pflanze mit Unkraut befallen oder nicht
     */
    public boolean getUnkraut() {
        throw new UnsupportedOperationException();
    }

}
