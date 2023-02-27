import java.util.Scanner;
public class prog8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 1; // factorialul lui 1 si 0 este egal cu 1 intotdeauna

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println("factorialul lui " + n + " este " + result);
    }
}
