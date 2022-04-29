/**
 * Muss von einer Pflanzen Klasse implementiert werden
 * @author Timon Buschendorf
 */
public abstract class Pflanze {

    private boolean unkraut;
    private String name;

    public Pflanze(String name) {
        this.name = name;
        int tmp = (int) (Math.random() * 2 +1);
        this.unkraut = tmp != 1;
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
     * @param pflanze Pflanze von der das Unkraut entfernt werden soll
     */
    public final void unkrautPfluecken(Pflanze pflanze) {
        pflanze.unkraut = false;
    }

    /**
     * Gibt den Status zurueck, ob die Pflanze mit Unkraut befallen ist
     * @return Ist die Pflanze mit Unkraut befallen oder nicht
     */
    public final boolean getUnkraut() {
        return this.unkraut;
    }

}
