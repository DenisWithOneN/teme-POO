import java.util.Scanner;
public class prog7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int ma;

        for(int i =1; i<=n; i++){
            int nr = input.nextInt();
            sum+=nr;
        }

        ma=sum/n;
        System.out.println(ma);




    }
}
