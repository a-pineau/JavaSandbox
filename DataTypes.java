class DataTypes {
    // Two types: primitive and reference/object

    // Primitive:
    // ---------
    // byte: min -128, max 127, default 0
    // short: min -2e-15, max 2e-15 - 1 (two times smaller than integer)
    // int: min -2e31, max 2e31 - 1 (used for integral values unless memory issues)
    // long: min -2e63, max 2e63 - 1 (used when int isn't enough)
    // float: 32 bits precision, used in large arrays of floating point numbers, care with precision (e.g. currency)
    // double: 64 bits precision, default for decimal values, care with precision (e.g. currency)
    // boolean: 1 bit of information, True or False, default False
    // char: single 16 bits Unicode character

    // Reference:
    // ---------
    // Created using constructors, used to access object
    // Animal animal = new Animal(name)

    // ---------------------------------------------------

    // Local variables
    // ---------------
    // * Declared and created within methods, constructors or blocks
    // * Destroyed when exiting constructor, method or block
    // * Cannot be seen outside of scope
    // * No default value, have to be initialized before first use
    // int age;
    // int c_age = age + 7 // Compilation error

    // Instance variables
    // -------------------
    // * Declared within a class but, outside of a method, constructor or block
    // * Created when the object is created (keyword new) and destroyed with the object
    // * Can be declared in class before or after use
    // * Have default value (0 for numbers, False for boolean, null for objets references)
    // * Values can be assigned within the constructor
    // * Accept access modifiers
    // * Can be seen by all methods, constructors or blocks within the class
    // * Usually private
    // * Can be accessed by calling the variable name directly in the class
    // * In static methods: ObjectReference.variableName

    // Static variables
    // ----------------
    // * Declared within a class, outside of a method, constructor or block
    // * Usually used for constants
    // * Objects from the same class share the same static variable memory
    // * Usually declared as final (cannot be changed)
    // * Created when the program starts, destroyed when it ends
    // * Usually declared public for visibility
    // * Same default values than instance variables
    // * Accessed by ClassName.variableName
    // * When declared as final: UPPERCASE, camelCase otherwise

    // Modifiers
    // Access Modifiers
    // ----------------
    // * Default: double d = 5.0; (Visible to the package)
    // * Public: public double d = 5.0; (Visible to the world)
    // * Private: private double d = 5.0; (Visible to the class only, classes and interfaces cannot be private)
    // * Protected: protected double d = 5.0; (Visible to the class and its subclasses)
    // * Methods declared public in a superclass must also be public in all subclasses
    // * Methods declared protected in a superclass must be either public or protected in all subclasses, cannot be private
    // * Methods declared private cannot be accessed by subclasses

    // Non-access Modifiers
    // --------------------
    // static: class methods and variables
    // final: finalizing the implementation of classes, method and variables
    // abstract: abstract classes and methods
    // synchronized and volatile: threads

    public String _name; // Visible by any child class
    public double _salary; // Only in current class
    public static final String _GENDER = "Male";
    private String _format;

    public DataTypes(String name) { // Value assigned in constructor
        _name = name;
    }

    public void setSalary(double salary) { // Value assigned in a public method
        _salary = salary;
    }

    static void setSalaryStatic(double salary) {
        // _salary = salary; // Error at compilation time
        DataTypes dTypes = new DataTypes(null);
        dTypes._salary = 5.0d;
    }

    public String getFormat() {
        return this._format;
    }

    public void setFormat(Strinf format) {
        this._format = format;
    }

    public static void main(String args[]) {

        int a, b, c; // Cannot be printed since no initialization
        int d = 10, e = 20;
        System.out.println(d);
        byte B = 126;
        double pi = 3.14159;
        char f = 'f'; // '' for char, "" for String
        System.out.println("Values = " + d + ", " + e + ", " + B + ", " + pi + ", " + f);
        System.out.println("Static final variable = " + DataTypes._GENDER);
    }
}