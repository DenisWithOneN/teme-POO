import java.util.Scanner;
public class prog5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;

        for(int i = 1; i <=n; i++) {
            if (i%2==0)
                sum+=i;
        }
        System.out.println("suma este " + sum);
    }

}