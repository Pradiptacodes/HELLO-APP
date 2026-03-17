public class HelloApp {

    public static void main(String[] args) {

        // If no arguments are given
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build the names string
        StringBuilder nameBuilder = new StringBuilder();

        boolean first = true;

        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        // Print greeting
        System.out.println("Hello, " + nameBuilder + "!");
    }
}