import java.util.Scanner;

public class prog15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numar = 0;
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                numar = 3000 + 100 * a + 20 + b;
                if(numar%9 == 0)
                System.out.println(numar);
                }

            }
        }
    }

