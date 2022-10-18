public class StringDemo {

    public static void main(String args[]) {
       // Object
       // Sequence of char
       // Immutable (Python like)
       
       String s1 = "Hello";
       String s2 = new String("Yello");
       String s3 = new String(s2); 
       char[] stringArray = { 'h', 'e', 'l', 'l', 'o', '.' };
       String s4 = new String(stringArray);
       System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4);  

       // String modifiers
       // Used to modify a String
       // Not immutable
       // StringBuffer
       // ----------------
    }
 }