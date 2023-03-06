public class PiramidaDesc {

    private int n;

    public PiramidaDesc(int n){
        this.n = n;
    }

    public void afisarePiramidaDesc(){
        for (int i = n; i >= 1; i--) {

            for(int space = 1; space <= n-i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i*2; j++){
                System.out.print(n-i+1);
            }
            System.out.println();
        }
    }
}

