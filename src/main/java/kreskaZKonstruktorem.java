public class kreskaZKonstruktorem {
    int dlugosc;
    double szerokosc;
    int glebokosc;

    public kreskaZKonstruktorem(int a, double b, int c){
        dlugosc = a;
        szerokosc = b;
        glebokosc = c;

    }

    public kreskaZKonstruktorem(kreskaZKonstruktorem kres2){
        dlugosc = kres2.dlugosc;
        szerokosc = kres2.szerokosc;
        glebokosc = kres2.glebokosc;
    }


}
