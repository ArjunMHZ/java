public class typeConversion {
    public static void main(String[] args) {
        // Implicit (Automatic) Type Conversion
        int numInt = 123;
        long numLong = numInt; 
        float numFloat = numLong; 
        double numDouble = numFloat; 

        System.out.println("Implicit Type Conversion:");
        System.out.println("Int to long: " + numLong);
        System.out.println("Long to float: " + numFloat);
        System.out.println("Float to double: " + numDouble);
        // Explicit (Manually) Type Conversion
        double doubleValue = 123.456;
        int intFromDouble = (int) doubleValue; 
        long longValue = 6878676;
        int intFromLong = (int) longValue; 
        float floatVal = 3356.79f;
        int intFromFloat = (int) floatVal; 
        System.out.println("\nExplicit Type Conversion (Casting):");
        System.out.println("Double to int: " + intFromDouble);
        System.out.println("Long to int: " + intFromLong);
        System.out.println("Float to int: " + intFromFloat);
    }
}

