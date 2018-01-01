public class NoMainMethod {

//    This program doesn't have any main method and yet this will execute.
    static {
        System.out.println("This line of text is in static block");
        System.exit(0);
    }
// Sadly it didn't execute without main method. s
}
