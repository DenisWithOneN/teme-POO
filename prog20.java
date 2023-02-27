import java.util.Scanner;
public class prog20{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = 0;
        int inv = 0;
        int k = n;

        do {

            c = n% 10;
            n /= 10;
            inv = inv * 10 + c;

        } while(n!=0);

        if(k == inv)
            System.out.println("numarul " + k + " este palindrom");
        else System.out.println("nu este palindrom");

    }
}
