import java.util.Scanner;
public class prog1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numar = input.nextInt();

        if (numar < 10 && numar > 1) {
            if (numar > 5)
                System.out.println("ADMIS");

            else System.out.println("RESPINS");
        } else System.out.println("INVALID");

    }
}