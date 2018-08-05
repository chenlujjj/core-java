import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11};
        primes = new int[] {1, 2, 3, 4, 5};
        System.out.println(primes.toString());
        System.out.println(Arrays.toString(primes));
    }
}