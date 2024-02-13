public class StringMethods {
    public static void main(String[] args) {
        String str = "My Country My Pride!";
        String str1 = "I Love U";
        // Length method
        int length = str.length();
        System.out.println("Length of the string: " + length);        
        // Uppercase method
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        // Lowercase method
        String lowercase = str.toLowerCase();
        System.out.println("Lowercase: " + lowercase);      
        // String replaced = str.replace("Hello", "Hi");
        // System.out.println("After replace: " + replaced);
        //Concatenate method
        String concatenate = str.concat(str1);
        System.out.println("Concatenate: " + concatenate);
        //Compare method
        int compare = str1.compareTo(str);
        System.out.println(compare);
    }
}

