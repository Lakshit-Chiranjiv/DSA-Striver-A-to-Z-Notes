public class Main {
    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println(result); // 8
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // Function without return type and parameters
    public static void greet() {
        System.out.println("Hello, World!");
    }
}