public class zmienKreske {

    static void zwieksz(int liczba1, int liczba2){
        liczba1++;
        liczba2++;
        System.out.printf("\nw metodzie \"zwieksz\" moja kreska jest szeroka na %s cm i długa na %s cm", liczba1, liczba2);
        }


    static void zwieksz(double liczba3){
        liczba3++;
        System.out.printf("\nteraz chwilowo moja kreska ma też głębokość %s cm", liczba3);
    }

    static void zmien(kreska kres){
        kres.dlugosc++;
        kres.szerokosc++;
    }



}
