/**
 * Gesundheitszustand einer Pflanze
 */
public enum ZUSTAND {
    WELK(1), GESUND(2);

    private int numVal;

    ZUSTAND(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
