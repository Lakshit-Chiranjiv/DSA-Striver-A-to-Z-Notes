public class Main {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 3, 8, 4, 2, 5, 4, 11};
        int sum = 0;
        for (int val : numbers) {
            sum = sum + val;
        }
        System.out.println("The sum is " + sum);

        // Iterate through a list using indexing
        String[] genre = {"pop", "rock", "jazz"};
        for (int i = 0; i < genre.length; i++) {
            System.out.println("I like " + genre[i]);
        }
    }
}