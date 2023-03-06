public class ConstructiePiramide {
    public static void main(String[] args) {
        Piramida piramidaUnu = new Piramida(5);
        piramidaUnu.afisarePiramida();

        System.out.println();

        PiramidaDesc piramidaUnuDesc = new PiramidaDesc(5);
        piramidaUnuDesc.afisarePiramidaDesc();
    }

}
