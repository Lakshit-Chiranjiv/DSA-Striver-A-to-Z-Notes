public class Main {
    public static void main(String[] args) {
        // Creating a string
        String s = "Hello, World!";

        // Accessing characters of a string
        System.out.println(s.charAt(0));  // Output: H

        // Modifying a string
        // Strings are immutable in Java, so we cannot modify them directly.
        // We can create a new string by concatenating or using string manipulation methods.
        s = s.replace("Hello", "Hi");
        System.out.println(s);  // Output: Hi, World!
    }
}