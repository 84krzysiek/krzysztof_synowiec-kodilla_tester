
public class User {
    int age;
    String name;
    int high;

    private User(String name, int age,int high) {
        this.name = name;
        this.age = age;
        this.high = high;
    }

    private int getAge(int age) {
        return age;
    }
    private String getName(String name) {
        return name;
    }
    private String high(String high) {
        return name;
    }
    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        User[] users = {anna, betty, carl, david, eva, frankie};

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        double averageUsers = 0;
        for (double i = 0; i < users.length; i++) {
            averageUsers = result / users.length;
        }
        double averageBelow = averageUsers;
                for(double i =0; i < users.length ; i++){
                    averageBelow = result/ averageBelow;
                }
                    System.out.println(averageBelow);
                if (result > averageUsers) {
            System.out.println("theya're under average ");
                }
    }
}



