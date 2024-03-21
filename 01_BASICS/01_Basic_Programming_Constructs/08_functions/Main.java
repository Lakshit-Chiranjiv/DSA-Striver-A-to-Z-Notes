import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 3, 7};
        changeValue(a);
        System.out.println(Arrays.toString(a)); // [10, 3, 7]
    }

    public static void changeValue(int[] x) {
        x[0] = 10;
    }
}