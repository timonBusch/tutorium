/**
 * Prueft Status eines Studenten
 */
public class FH {

    /**
     * Prueft, ob ein Student seine Praxisphase antreten, seine Bachelorarbeit schreiben oder nichts von beiden
     * machen darf
     * @param student Student der geprueft wird
     * @return Status des Studenten
     */
    public StudentStatus checkStudentCPS(Student student) {
        int credits = student.calcCreditPoints();

        if(!(credits > StudentStatus.BACHELOR.credits || credits < StudentStatus.NONE.credits)) {
            if(credits == StudentStatus.BACHELOR.credits) {
                return StudentStatus.BACHELOR;
            }

            if(credits >= StudentStatus.PRAXIS.credits) {
                return StudentStatus.PRAXIS;
            }else {
                return StudentStatus.NONE;
            }
        }
        return null;
    }
}