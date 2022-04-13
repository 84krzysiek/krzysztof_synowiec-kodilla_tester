package Loops;//petla for

public class Loops  {
    public static void main(String[] args) {
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        int numberOfElements = names.length;
        System.out.println(numberOfElements);

        for (int i = 0; i < names.length; i++) {
           System.out.println(names[i]);
        }
        for (int i = names.length -1; i >= 0; i--)
            System.out.println(names[i]);
    }
    public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
}

