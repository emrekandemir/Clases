package e09_odev2;

public class InstructorManager {

    public void add(String message){
        System.out.println("Default mesaage :" + message);
    }
}

// ************* final metodu kullandığımızda  InstructorManager 'ı miras alan bütün sınıfların metotlarındaki değğişken isimleri farklı olamlıdır.

//    public final void add(String message){
//        System.out.println("Default mesaage :" + message);
//    }
