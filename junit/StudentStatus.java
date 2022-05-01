/**
 * Hat ein Student 100 oder mehr Credit-Points kann er die Praxisphase absolvieren,
 * 210 benoetigt er um den Bachelorstudiengang abzuschliessen hat weniger als 100
 * kann er nichts von beidem machen.
 */
public enum StudentStatus {
    NONE(1),PRAXIS(100), BACHELOR(210);

    public final int credits;

    private StudentStatus(int credits) {
        this.credits = credits;
    }

}
