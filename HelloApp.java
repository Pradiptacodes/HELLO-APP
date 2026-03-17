public class HelloApp {

    public static void main(String[] args) {

        // If no arguments are given
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build names with comma
        StringBuilder nameBuilder = new StringBuilder();

        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove the last ", "
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}