import java.util.Random;
public class RandomNumbers {


    public static void main(String[] args) {
        RandomNumbers liczby = new RandomNumbers();
        int result = liczby.getCountOfRandomNumber(5000);
        System.out.println(result);
    }


    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int high = 0;
        int min = 30;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            result++;
            if (temp > high) {//wylosowana liczba więkasza od high
                high = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println(min);
        System.out.println(high);


        System.out.println(sum);
        return result;
    }
}


