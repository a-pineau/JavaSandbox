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
       // StringBuffer/StringBuilder
       // Prefer StringBuilder since its faster
       // If threads use, prefer StringBuffer
       // ----------------
       StringBuffer sB = new StringBuffer("test");
       sB.append("_Nope");
       // Append
       System.out.println("StringBuffer = " + sB);
       sB.reverse();
       // Reverse
       System.out.println(sB);
       // Delete
       sB.delete(0, 3);
       System.out.println(sB);
       // Insert
       StringBuffer sB2 = new StringBuffer("ABC");
       sB2.insert(1, "ab"); // Cannot insert out of bounds
       System.out.println("sB2 = " + sB2);
       sB2.replace(1, 3, "cd"); // Can go out of bounds
       System.out.println("sB2 = " + sB2);   
       // Capacity
       int cap = sB2.capacity();
       System.out.println("Capacity sB2 = " + cap);
       /*
        * For the rest, see: https://www.tutorialspoint.com/java/java_string_buffer.htm
        */
    }
 }