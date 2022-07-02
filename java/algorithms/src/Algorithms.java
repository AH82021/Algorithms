import java.util.Arrays;

public class Algorithms {




    public static void main(String[] args) {
     int[] fibSequence = new int[11];
     fibonacci(fibSequence);
        System.out.println(Arrays.toString(fibSequence));



    }

    static  void fibonacci(int[] fib){
        fib[0]=0;
        fib[1]=1;
        for (int i = 2; i <fib.length ; i++) {
            fib[i] = fib[i-1]+ fib[i-2];
        }

    }



}
