package e08_overriding;

public class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar * 1.18 ;

    }

//*****************    // BaseKrediManager class ının hiç bir şekilde ezilmesini istemiyorsak final metodunu kullanırız.

//    public final double hesapla(double tutar){ //OgrenciKrediManager class'ında metodun silinmesi gerekir çünkü ezemeyeceğini söylemiş olduk
//        return tutar * 1.18 ;
//
//    }
}
