package e09_odev2;

public class StudentManager extends InstructorManager{
    @Override
    public void add(String message){
        System.out.println("StudentManager dan geliyorum : " + message);
    }
}
