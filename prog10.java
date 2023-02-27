public class prog10 {
    public static void main(String[] args) {
        int n = 1000;
        boolean prim = false;

        while(!prim) {
            boolean div = false;

            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    div = true;
                    break;
                }
            }

            if(!div) {
                prim = true;
            } else {
                n++;
            }
        }

        System.out.println("cel mai mare numar prim dupa 1000 este " + n);
    }
}
