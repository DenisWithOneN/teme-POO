import java.util.Scanner;

public class prog2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int numar = input.nextInt();

        switch(numar){
            case 1:
                System.out.println("UNU"); break;
            case 2:
                System.out.println("DOI"); break;
            case 3:
                System.out.println("TREI"); break;
            case 4:
                System.out.println("PATRU"); break;
            case 5:
                System.out.println("CINCI"); break;

            default:
                System.out.println("INVALID");
        }

    }


}
