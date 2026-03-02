package exceptionhandeling;

public class ExceptionHandeling {

    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            double k = i / j;
        } catch (Exception e) {
            System.out.println("invalid");
        }

    }

}
