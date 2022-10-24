public class Main {
    public static void main(String[] args) {

        System.out.print("Hello world!");
        System.out.println("Hello CDA!");

        //Print Numbers
        System.out.println(45);
        System.out.println(4 + 5);
        System.out.println(4 * 5);

        // Variables
        // primitives : byte, short, int , long, float, double, boolean, char
        // non primitives: String, Array, Classes

        /*
         * String
         * */
        String prenom = "Toto";
        System.out.println(prenom);

        /*
         * Int
         * */
        int number = 25;
        System.out.println(number);

        int myNumber;
        myNumber = 30;
        System.out.println(myNumber);

        myNumber = 50;
        System.out.println(myNumber);

        /*
         * Changer variable en constante
         * */
        final int order = 150;
        System.out.println(order);

        // Ne fonctionne pas a cause du mot clé final (= constante)
        // order = 200;

        /*
         * Exemples de variable
         * */
        int myNum = 5;
        float myFloatNum = 5.99F;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        String firstName = "Toto";
        String lastName = "Tata";
        String fullName = firstName + " " + lastName;

        System.out.println("Hello " + fullName);

        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);  // Output 150

        /*
         * Widening Casting
         * */
        int myInt = 15;
        System.out.println(myInt);
        double myDouble = myInt;
        System.out.println(myDouble);

        /*
         * Narrowing Casting
         * */
        double myDouble2 = 15.78;
        int myInt2 = (int) myDouble2;

        System.out.println(myDouble2);  // Output 15.78
        System.out.println(myInt2);     // Output 15


        // ------------------ Les opérateurs -----------------------------------

        /*
         * Modulo
         * */
        int xM = 5;
        int yM = 2;
        System.out.println(xM % yM);

        /*
         * Increment
         * */
        int xI = 5;
        ++xI;
        System.out.println(xI);

        /*
         * Decrement
         * */
        --xI;
        System.out.println(xI);

        /*
         * String
         * */
        String txt = "Hello CDA de Lyon";
        System.out.println("longeur du text: " + txt.length());

        /*
         * Maj et Min
         * */
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        /*
         * Concatenation
         * */
        System.out.println(firstName + " " + lastName);
        //seconde methode
        System.out.println(firstName.concat(" " + lastName));
        //Special caractere
        String txtChar = "OL est la seul équipe \"Olympique\" de France";
        System.out.println(txtChar);

// -------------------------- Maths --------------
        int max = Math.max(8, 10);
        System.out.println(max);
        int min = Math.min(8, 10);
        System.out.println(min);
        double racine = Math.sqrt(64); // racine carrée
        System.out.println(racine);

        // ---------------- Boolean --------------
        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge > votingAge); // output True

        if (myAge > votingAge) {
            System.out.println("Je suis majeur");
        }

        //---------------- Switch ----------------
        int day = 4;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Thuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thurday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }



    }
}
