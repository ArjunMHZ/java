public class DoWhile {
    public static void main(String[] args) {
        int whileCount = 1;
        System.out.println("Using a while loop to count from 1 to 5:");
        while (whileCount <= 5) {
            System.out.print(whileCount + " ");
            whileCount++;
        }
        int doWhileCount = 1;
        System.out.println("\n\nUsing a do-while loop to count from 1 to 5:");
        do {
            System.out.print(doWhileCount + " ");
            doWhileCount++;
        } while (doWhileCount <= 5);
        System.out.println("\nLoop execution completed.");
    }
}

