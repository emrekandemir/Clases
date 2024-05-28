package e09_odev2;

public class Main {
    public static void main(String[] args) {

        User user = new User();  //User class da contructor da bıraktığım not: (1,"Emre","Kandemir");
        user.setId(6);
        user.setFirstName("");
        user.setLastName("Kandemir");
        user.setDescription("açıklama");

        //System.out.println(user);

        Instructor instructor = new Instructor();
        instructor.salary=1500;
        instructor.email ="emre.kandemir@work.com";
        instructor.description="instructor den geliyorum";

        System.out.println(instructor.salary);

        UserManager userManager = new UserManager(new StudentManager());
        userManager.delete();

        InstructorManager[] instructorManagers = new InstructorManager[]{new StudentManager(),new OrnekClass()};
        for (InstructorManager instructorManager : instructorManagers){
            instructorManager.add("mesaj");
        }


    }
}
