package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month < 4 && month >0) {
            System.out.println("Winter");
        } else if (month < 6 && month >3) {
            System.out.println("Spring");
        } else if (month < 9 && month >5) {
            System.out.println("Summer");
        }else {
            System.out.println("wrong number!");
        }
    }
}
