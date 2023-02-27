import java.util.Scanner;
public class prog9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean conditie = true;
        // true = e prim  && false = nu e prim

        if (n < 2) {
            conditie = false;
            System.out.println(conditie);
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                conditie = false;
                System.out.println(conditie);
                break;
            }
        }

        if (conditie) {
            System.out.println(conditie);
        }
    }
}
