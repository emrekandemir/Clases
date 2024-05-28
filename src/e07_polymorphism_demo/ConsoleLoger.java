package e07_polymorphism_demo;

public class ConsoleLoger extends BaseLoger{

    public void log(String message){
        System.out.println("Logd to console : " + message);
    }
}
