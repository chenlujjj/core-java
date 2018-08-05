public class CountDown {
    public static void main(String[] args) {
        int i;
        for (i = 10; i > 0; i--) {
            System.out.println("Counting down ... " + i);
        }
        System.out.println("Boom");
        System.out.println(i); // attention i = 0
    }
}