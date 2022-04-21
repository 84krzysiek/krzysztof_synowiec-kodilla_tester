import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){
        RandomNumbers nazwa = new RandomNumbers();// utworzenie obiektu
        int result = nazwa.getCountOfRandomNumber(20);// wywołanie metody do obiektu
        System.out.println(result);

    }

    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        System.out.println(sum);
        return result;
    }


}
