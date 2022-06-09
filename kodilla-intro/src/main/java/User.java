
public class User {
    int age;
    String name;
    int high;

    private User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        User[] users = {anna, betty, carl, david, eva, frankie};

        double result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        double averageUsers = result / users.length;

        for (int i = 0; i < users.length; i++) {

            if (users[i].age < averageUsers) {
                System.out.println(users[i].name);
            }
        }
    }
}



