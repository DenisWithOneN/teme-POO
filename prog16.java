import java.util.Scanner;
public class prog16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cifra = 0;

        do {

            cifra = n % 10;
            n /= 10;
            System.out.println(cifra);

        } while(n != 0);

    }
}
