public class Sertar {
    private int L;
    private int l;
    private int h;

    public Sertar(int lungime, int latime, int inaltime){
        this.L = lungime;
        this.l = latime;
        this.h = inaltime;
    }

    public void tipareste(){
        System.out.println("Sertar " + " latime " + l + " lungime " + L + " inaltime " + h);
    }
}
