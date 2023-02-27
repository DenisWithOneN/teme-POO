import java.util.Scanner;
public class prog17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[] cifre = Integer.toString(n).toCharArray();
        char max = cifre[0];

        for(int i = 1; i < cifre.length; i++){
            if(cifre[i] > max){
                max = cifre[i];
            }
        }
        System.out.println(max);
    }
}
