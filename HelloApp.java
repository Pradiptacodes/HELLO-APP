public class HelloApp {
    public static void main(String[] args) {

        String greeting;

        // Check if arguments are provided
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            // Join all names with comma and space
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        }

        // Print result
        System.out.println(greeting);
    }
}