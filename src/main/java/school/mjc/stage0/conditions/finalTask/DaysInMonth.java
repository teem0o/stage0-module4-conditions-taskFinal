package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public int isLeapYear(int year) {
        int remainder = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ? 1 : 0;

        switch (remainder) {
            case 1:
                return 1;
            case 0:
                return 0;
            default:
                return -1;
        }
    }

    public void printDays(int year, int month) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(30);
        } else {
            if (month == 2) {
                int leap = isLeapYear(year);
                if (leap == 1) {
                    System.out.println(29);
                } else if (leap == 0) {
                    System.out.println(28);
                } else {
                    System.out.println("invalid date");
                }

            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println(31);

            } else {
                System.out.println("invalid date");
            }
        }
    }
}
