//Fibonacci Series , the next term is the sum of the previous two terms.
// For example, if 0 and 1 are the two previous terms in a series, then the next term will be 1(0+1).

public class FibonacciSeries {
    public static void main(String[] args) {
        //initilize the variable
        int a = 0, b = 1, c;
        System.out.print(+a + " " + b);
        for (int i = 2; i <= 10; i++) {
            //check
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}
