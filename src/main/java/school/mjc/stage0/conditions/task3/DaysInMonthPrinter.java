package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month >= 1 && month <= 12) {
            int days;

            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) {
                days = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            } else if (month == 2) {
                days = 28; // Assuming a non-leap year
            } else {
                days = -1; // Invalid month
            }

            if (days != -1) {
                System.out.println( days );
            } else {
                System.out.println("Invalid month number!");
            }
        } else {
            System.out.println("wrong number!");
        }
    }
}
