import java.util.Scanner;
public class FirstDemo {

        // functia de pornire a programului FirstDemo.
        // @param args argumentele de intrare ale pgrogramului

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in); // System.in este tastatura
                int nr = input.nextInt(); // introducerea unui numar intreg de la tastatura

                int i = 5;
                switch(i) {
                        case 0: System.out.println("zero"); break;
                        case 1: System.out.println("unu"); break;
                        default:
                                System.out.println("Nu stiu ce cifra este");
                }

        }
}
