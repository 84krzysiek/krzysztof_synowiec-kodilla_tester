class Subject {
    public String name;
    public double age;
    public double height;

    public Subject(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
public class Application {

    public static void main(String[] args) {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}



