import java.util.Scanner;
public class prog12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int div = 0;

        for(int i = 1; i<=n; i++)
            if(n%i == 0){
                div = i;
                System.out.println(div);
            }

    }
}
