import java.util.ArrayList;
import java.util.List;

/**
 * Student verwaltet Module und kann Credit-Points errechnen
 */
public class Student {

    private List<Modul> modulList;

    public Student(Modul modul1, Modul modul2, Modul modul3) {
        this.modulList = new ArrayList<>();
        addModulList(modul1);
        addModulList(modul2);
        addModulList(modul3);
    }

    /**
     * Errechnet Summe der Credit-Points
     * @return Credit-Points Summe
     */
    public int calcCreditPoints() {
        int creditSum = 0;
        for(Modul modul: this.modulList) {
            creditSum += modul.getCreditP();
        }
        return creditSum;
    }

    /**
     * Fuegt Modul zur Modulliste hinzu
     * @param modul Zu belegendes Modul
     */
    public void addModulList(Modul modul){
        this.modulList.add(modul);
    }

}
