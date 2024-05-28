package e09_odev2;

public class UserManager {

//UserManager sınıfının nesnesi oluşturulurken InstructorManager nesnesini alıp bu nesneye ait bir alanı (attribute/field) başlatmak için kullanılır.
    private InstructorManager instructorManager; //Attribute || Field

    public UserManager(InstructorManager instructorManager) { //constructor
        this.instructorManager = instructorManager;
    }

    public void delete(){//metot
        System.out.println("kullanıcı silindi");
        this.instructorManager.add(" eklenen");
    }
}
