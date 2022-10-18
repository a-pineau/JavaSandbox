class DecisionMaking {
    public static void main (String args[]) {
        // if statement
        int a = 10;
        // if
        // --
        if (a < 20) {
            System.out.println("Yay");
        }

        // Not like Python
        // if (args) {
        //     System.out.println("Nay");
        // }

        // if... else
        // ----------
        if (a > 20) {
            System.out.println("Yay");
        } else {
            System.out.println("Nay");
        }

        // if... else if... else
        // ---------------------
        if (a < 5) {
            System.out.println("1");
        } else if (a > 5) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        // Nested if
        if (a > 5) {
            if (a > 8) {
                if (a > 9) {
                    System.out.println("Yay");
                }
            }
        }

        // switch
        // Only use with int, Strings and enum
        // Value in the case -> same type than variable in the switch
        // switch ends when a break is encountered
        // break isn't mandatory but the flow will go on
        // Default case is optional, must appear at the end with no break

        switch(a) {
            case 1 :
                System.out.println("1");
                break;
            case 2 : 
                System.out.println("2");
                break;
            case 3 : 
                System.out.println("3");
                break;
            case 5 : 
                System.out.println("5");
                break;
            default : 
                System.out.println("Nay");
        }
    }
}