public class Main {

    public static void main(String[] args){
        Sertar sertarUnu = new Sertar(35, 30, 10);
        Sertar sertarDoi = new Sertar(35, 30, 20);
        Birou birouUnu = new Birou(500, 200, 300, sertarUnu, sertarDoi);
        birouUnu.tipareste();
    }
}
