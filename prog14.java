import java.util.Scanner;
public class prog14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 1000; i++)
            for (int j = 1; j < 1000; j++)
                if ((i + j == 1000) && ((i % 17 == 0) || (i % 13 == 0)) && ((j % 19 == 0) || (j % 7) == 0))
                    System.out.println(i + " " + j);


    }
}