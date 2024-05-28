package e07_polymorphism_demo;

public class Main {

    public static void main(String[] args) {

// array halinde tüm classları dolaştı içindeki mesajları bastı ekrana override edildiğinden
//        BaseLoger[] baseLogers = new BaseLoger[]{new DatabaseLoger(), new EmailLoger(), new FileLoger(), new ConsoleLoger()};
//        for (BaseLoger logger : baseLogers){
//            logger.log("Log mesajı");
//        }

        //new'leyerek class'ı çağırdık parametreye BaseLoger'ın inherit alanlarından hangi class'ı çağırsak ekrana onu verir.
        CustomerManager customerManager = new CustomerManager(new EmailLoger());
        customerManager.add();
    }
}
