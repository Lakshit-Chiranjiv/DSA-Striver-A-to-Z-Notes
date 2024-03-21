public class Main {
    public static void main(String[] args) {
        int a = 5;
        changeValue(a);
        System.out.println(a); // 5
    }

    public static void changeValue(int x) {
        x = 10;
    }
}