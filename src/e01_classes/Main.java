package e01_classes;

public class Main {
    public static void main(String[] args) {
        //Bir classı bu şekilde çağırırız.
        CustomerManager customerManager = new CustomerManager();  //Burda classes.CustomerManager bir türdür(int,string,double gibi)
        customerManager.add();
        customerManager.remove();
        customerManager.update();

    }
}
// ********    Classlar Referans type'dir  ********** Arrayler Referans type dir.  ve String'lerde öyle
//1  Classların ilk ve temel özelliği Gruplama yapmaktır.
//2  ilgili alanlarda class oluştururuz.
//3  Classların içine metotları(operasyon) yazarız.

//4  classes.CustomerManager class'ını herhangi bir metot'un içersinde kullanmak istersek kullanabiliriz.
//5  new lediğimizde bellkete bir classes.CustomerManager türünde nesne üretmiş oluyoruz.
//6  Bir clasın kullanılabilmesi için onun new ' lenmesi gerekiyor...

//7  Herhangi bir referansı tutan kimse kalmazsa heap(bellek) den garbic collektor siliyor.


