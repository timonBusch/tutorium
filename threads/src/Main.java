import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Main {

    String name;
    List<Integer> list;

    public Main(String name) {
        this.name = name;

        // Fill list with random integer
        list = new Random()
                .ints(0,100)
                .limit(10).boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Main a = new Main("a");

        new Thread(() -> {
            a.addToElement(2);
            System.out.println(Thread.currentThread().getName()+": "+a.getSum());
        }).start();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+": "+a.getSum());
        }).start();
    }

    /**
     * Add a value to each element in list
     * @param value to add to each element
     */
    public void addToElement(int value) {
        list.replaceAll(integer -> integer + value);
    }

    /**
     * Calculates the sum of the list
     * @return sum of list
     */
    public int getSum() {
        int sum = 0;
        for(int ele : list) {
            sum += ele;
        }
        return sum;
    }
}
