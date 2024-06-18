public class case2 {
    public static void greet(String name) {
        System.out.println("Hello, " + name);  // Print a greeting message
    }

    public static void main(String[] args) {
        greet("Alice");  // Call greet method with argument "Alice"
        greet("Bob");    // Call greet method with argument "Bob"
    }
}
//Functions with Parameters but No Return Value: Useful for operations that modify state or perform actions based on inputs.