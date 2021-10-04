public class Fibonnacci {

    private static int previous = 1;

    public static void main(String[] args) {
//        fibonacci(13);
        fibonacciLength(10);
    }

    private static void fibonacci(int current, int last) {
        if (current < last) {
            System.out.println(current);
            int next = previous + current;
            previous = current;
            fibonacci(next, last);
        } else {
            System.out.println(current);
        }
    }

    private static int fiboLength(int number) {
        if(number == 1 || number == 2){
            return 1;
        }

        return fiboLength(number - 1) + fiboLength(number - 2);
    }

    private static void fibonacci(int number) {
        System.out.println(previous);
        fibonacci(previous, number);
    }

    private static void fibonacciLength(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.println(fiboLength(i));
        }
    }
}
