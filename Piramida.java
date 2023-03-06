public class Piramida {

    private int n;

    public Piramida(int n){
        this.n = n;
    }

    public void afisarePiramida(){
        for (int i = 0; i < n; i++) {

            for (int space = 1; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 + 2; j++) {
                System.out.print(n-i);
            }
            System.out.println();
        }
    }


}

