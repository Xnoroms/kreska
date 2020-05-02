public class kreskaZKonstruktorem {
    int dlugosc;
    double szerokosc;
    int glebokosc;

    public kreskaZKonstruktorem(int dlugosc, double szerokosc, int glebokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.glebokosc = glebokosc;
    }


    public kreskaZKonstruktorem(kreskaZKonstruktorem kres2){
        this.dlugosc = kres2.dlugosc;
        this.szerokosc = kres2.szerokosc;
        this.glebokosc = kres2.glebokosc;
    }


}
