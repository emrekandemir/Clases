package e07_polymorphism_demo;

public class DatabaseLoger extends BaseLoger{


// base deki değişkenle aynı olduğunda burası overrride eder otomatikman ama burda değişkenin adı loger base de log olduğundan ezemedi.
    public void loger(String message){
        System.out.println("Loged to database : " + message);
    }
}
