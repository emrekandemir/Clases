package e08_overriding;

public class OgrenciKrediManager extends BaseKrediManager{

    //base deki tutarı ezmektedir (overrride)
    public double hesapla(double tutar){ //BaseKrediManager class da final metodu çalıştırdığımızda burdaki metodu yorum satırı haline gertir yada sil
        return tutar * 1.10;
    }
}
