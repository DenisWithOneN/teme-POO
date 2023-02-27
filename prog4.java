import java.util.Scanner;
public class prog4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nr1 = input.nextInt();
        int nr2 = input.nextInt();
        int nr3 = input.nextInt();
        int min = 0;

        if (nr1 < nr2)
            min = nr1;

        else if (nr2 < nr3)
            min = nr2;
            else min = nr3;



        System.out.println("minimul este " + min);
    }

}
