// Program to add natural numbers up to n
// sum = 1+2+3+...+n
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println("The sum is " + sum); // The sum is 55
    }
}