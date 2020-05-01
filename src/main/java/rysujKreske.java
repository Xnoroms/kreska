public class rysujKreske {
    public static void main(String[] args) {
        kreska kreska = new kreska();

        kreska.ustawDlugosc(8);
        kreska.ustawSzerokosc(2);

        System.out.printf("moja kreska jest szeroka na %s cm i długa na %s cm", kreska.dajSzerokosc(), kreska.dajDlugosc());

        zmienKreske.zwieksz(kreska.dlugosc,kreska.szerokosc);

        zmienKreske.zwieksz( kreska.glebokosc);

        System.out.printf("\nale po wykonaniu metod znowu moja kreska jest szeroka na %s cm i długa na %s cm", kreska.dajSzerokosc(), kreska.dajDlugosc());

        zmienKreske.zmien(kreska);
        System.out.printf("\nteraz moja kreska jest szeroka na %s cm i długa na %s cm", kreska.szerokosc, kreska.dlugosc);


        //konstruktory

        kreskaZKonstruktorem kreska2 = new kreskaZKonstruktorem(3,3.14,2);

        System.out.printf("\nmoja kreska wywołana z konstruktora jest szeroka na %s cm, długa na %s cm i głęboka na %s cm", kreska2.szerokosc, kreska2.dlugosc, kreska2.glebokosc);

        kreskaZKonstruktorem kreska3 = new kreskaZKonstruktorem(kreska2);

        System.out.printf("\nmoja kreska wywołana z konstruktora kopiującego jest szeroka na %s cm, długa na %s cm i głęboka na %s cm", kreska3.szerokosc + 2.20, kreska3.dlugosc + 2, kreska3.glebokosc + 0.21);

    }
}
