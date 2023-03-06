public class Birou {

    private int L;
    private int l;
    private int h;
    private Sertar sertarUnu;
    private Sertar sertarDoi;

    public Birou(int latime, int lungime, int inaltime, Sertar sertarUnu, Sertar sertarDoi){
        this.l = latime;
        this.L = lungime;
        this.h = inaltime;
        this.sertarDoi = sertarDoi;
        this.sertarUnu = sertarUnu;
    }

    public void tipareste() {
        System.out.println("Birou " + " latime " + l + " lungime " + L + " inaltime " + h);
        sertarUnu.tipareste();
        sertarDoi.tipareste();
    }
}
