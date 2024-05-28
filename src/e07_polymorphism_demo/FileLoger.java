package e07_polymorphism_demo;

public class FileLoger extends BaseLoger{

    @Override
    public void log(String message){
        System.out.println("Loged to file : " + message);
    }
}
