package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {

        try {
            if (number % 5 == 0 && number % 11 == 0) {
                System.out.println("Dividable");
            } else {
                System.out.println(" Non-dividable");
            }
        } catch (ArithmeticException e) {
            System.out.println(" cannot divide by zero");
        }



    }
}
