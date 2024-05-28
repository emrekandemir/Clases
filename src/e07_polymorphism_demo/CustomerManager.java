package e07_polymorphism_demo;

public class CustomerManager {// class'ın constructor ü ne zaman çalışır? new lediğimizde constructor içindeki çalışır (Mainde new'leyerek class ı çağırdık)

    private BaseLoger baseLoger; //private alan olşturduk BaseLoger türünde field yani attribute oluşturuyoruz.

    public CustomerManager(BaseLoger baseLoger) { //Constructor CustomerManager'ı new lediğimizde BaseLoger ın miras alan hepsini istediğimzde çağırabiliriz.
        this.baseLoger = baseLoger;
    }

    public void add(){ //Method
        System.out.println("Müşteri eklendi");
        this.baseLoger.log("log mesajı");
    }
}
