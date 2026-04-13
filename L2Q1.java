import java.util.Scanner;
public class L2Q1 {
     public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    public static int getProduct(int[] arr) {
        int product = 1;
        for (int x : arr) {
            product *= x;
        }
        return product;
    }

    public static double getSumOfSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = getFactors(n);

        System.out.print("Factors: ");
        for (int x : factors) {
            System.out.print(x + " ");
        }

        System.out.println("\nSum of factors: " + getSum(factors));
        System.out.println("Product of factors: " + getProduct(factors));
        System.out.println("Sum of squares of factors: " + getSumOfSquares(factors));

        sc.close();
    }
}