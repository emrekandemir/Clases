package e07_polymorphism_demo;

public class EmailLoger extends BaseLoger{
    @Override
    public void log(String message){
        System.out.println("Loged to email : " + message);
    }
}
