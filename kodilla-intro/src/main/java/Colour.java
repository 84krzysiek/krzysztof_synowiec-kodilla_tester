import java.util.Scanner;

public class Colour {
    public static String getColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("select colour name (R- red , B-blue,G- green,W- white) :");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "R":
                    return "red";
                case "B":
                    return "blue";
                case "G":
                    return "green";
                case "W":
                    return "white";
                default:
                    System.out.println("Wrong colour name");
            }

        }
    }

    public static void main(String[] args) {
        Colour colourSelect = new Colour();
        String result = Colour.getColour();
        System.out.println("result:" + result);


    }


    }



