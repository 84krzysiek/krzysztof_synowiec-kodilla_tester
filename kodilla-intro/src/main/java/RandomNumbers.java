import java.util.Random;
public class RandomNumbers {


    public static void main(String[] args) {
        RandomNumbers liczby = new RandomNumbers();
        int result = liczby.getCountOfRandomNumber(3000);
        System.out.println(result);
        RandomNumbers liczbyMin = new RandomNumbers();
        int resultMin = liczbyMin.getCountOfRandomNumberMin(3000);
        System.out.println(resultMin);
    }


    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            result++;
        }
        System.out.println(sum);
        return result;
    }

    public int getCountOfRandomNumberMin(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            result--;
        }
        System.out.println(sum);
        return result;

    }
}

