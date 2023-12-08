package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (second != 0 && first % second == 0) {
            System.out.println("Not aliquot");
        } else {
            System.out.println("Aliquot");
        }
    }
}
