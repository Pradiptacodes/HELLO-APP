public class HelloApp {

    public static void main(String[] args) {

        if (args.length > 0) {
            // Get the name from command-line argument
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } 
        else {
            // Default message if no argument is given
            System.out.println("Hello, World!");
        }

    }
}