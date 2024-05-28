package e09_odev2;

public class User {
// encapsulation: constructor, getter and setter kullanıldı.
    private int id;
    private String firstName;
    private String lastName;
    public String description;

    public User(int id, String firstName, String lastName) { //contructor
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() { //bu contructoru çağırıyorum main de User class'ı çağırdığımızda parametre olarak id,firsName,lastName private alanlarını çağırmamak için

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        if (id < 5) {
            System.out.println("5 den küçük olamaz");
            return;
        }
        if (id > 5) {
            this.id = id;
            System.out.println(id);
        }


    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) { //name null veya boşsa, if bloğu içindeki kod çalıştırılır
            System.out.println("firstName cannot be empty or blank.");
            return;

        }
        if (firstName == firstName) {
            this.firstName = firstName;
            System.out.println(firstName);
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


