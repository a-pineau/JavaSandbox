class Arrays {
    public static void main(String[] args) {
        // Starts at index [0]
        // double[] myArray preferred syntax then double myArray[];
        int arraySize = 10;
        double[] myArray;
        // * 1. Creates and array
        // * 2. Assigns the reference myArray2 to the variable (Array)
        double[] myArray2 = new double[arraySize];
        // With values
        double[] myArray3 = {1, 3, 4.8, 5, 20, -1.5};

        // Looping over array
        for (int i = 0; i < myArray3.length; i++) 
        {
            System.out.println("val = " + myArray3[i]);
        }
        // Total
        double total = 0;
        for (int i = 0; i < myArray3.length; i++) 
        {
            total += myArray3[i];
        }
        System.out.println("Total = " + total);
        // Larget element
        double largestElement = myArray3[0];
        for (int i = 0; i < myArray3.length; i++) 
        {
            if (myArray3[i] > largestElement) largestElement = myArray3[i];
        }
        System.out.println("Largest element = " + largestElement);
        // Enhanced forloop
        for (double value: myArray3) {
            System.out.println("Value = " + value);
        }

        printArray(myArray3);
        printArray(new double[] {2, 5, -2.2, 5.2, 12.45});
        double[] reversed_array = reverse(myArray3);
        printArray(reversed_array);
    }
    
    // Array as parameter
    public static void printArray(double[] arrayToPrint) 
    {
        for (double value: arrayToPrint) 
        {
            System.out.println("Value with method = " + value);
        }
    }
    // Returning an array (reversing)
    public static double[] reverse(double[] origin_array) 
    {
        double[] result = new double[origin_array.length];
        // Iterating with 2 variables
        for (int i = 0, j = origin_array.length - 1; i < origin_array.length; i++, j--)
        {
            result[i] = origin_array[j];
        }

        return result;
    }
}