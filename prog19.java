import java.util.Scanner;

public class prog19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = 0;
        int inv = 0;

        do {

            c = n% 10;
            n /= 10;
            inv = inv * 10 + c;

        } while(n!=0);

        System.out.println(inv);

        }
}
