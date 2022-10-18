class BasicOperators {
    public static void main(String args[]) {
        // Differences with Python
        // Logical
        // -------
        // ++, -- exist
        // and: &&
        // and: ||
        // not: != !(A && B)        

        // Assignment
        // ----------
        // No difference, apart from bitwise operations

        // Miscs.
        // ------
        // conditional: ? -> variable x = (expression) ? value if True : value if false
        // instanceof: similar to python's isinstance

        int a = 5, b = 7;
        int c = (a < 5) ? 10: 20;
        System.out.println(a > b);
        System.out.println(c);
        c = (a == 5) ? 40: 30;
        System.out.println(c);
        String s = "Hey";
        System.out.println(s instanceof String);
        //System.out.println(s instanceof BasicOperators); Error at compilation time
    }
}