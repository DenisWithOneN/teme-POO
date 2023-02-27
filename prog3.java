import java.util.Scanner;
public class prog3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numar1 = input.nextInt();
        int numar2 = input.nextInt();

        if(numar1 % 2 == 0 && numar2 % 2 == 0)
            System.out.println("media lor este " + (numar1 + numar2) / 2);

        if(numar1 % 2 != 0 && numar2 % 2 != 0)
            System.out.println("produsul este " + numar1 * numar2);

        if((numar1 % 2 == 0 && numar2 % 2 != 0) || (numar1 % 2 != 0 && numar2 % 2 == 0))
            System.out.println("suma este " + numar1+numar2);
    }

}
