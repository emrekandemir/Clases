package e6_inheritance_demo;

public class Main {
    public static void main(String[] args) {


        KrediUI krediUI = new KrediUI(); //classı' çağırdık
        krediUI.krediHesapla(new OgretmenKrediManager()); //polymorphism
        krediUI.hesapla(new AskerKrediManager()); //polymorphism

        TarimKrediManager tarimKrediManager = new TarimKrediManager();
        tarimKrediManager.tarimHesapla();
    }
}
