package e6_inheritance_demo;

public class KrediUI {
    public void krediHesapla(BaseKrediManager baseKrediManager){ //polimorfizm
        baseKrediManager.hesapla();
    }
    public void hesapla(BaseKrediManager baseKrediManager){ //polimorfizm
        baseKrediManager.kredi();
    }
}
