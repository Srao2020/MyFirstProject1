public class Bobby {
    // encapsulation
    private String name;
    private int age; // primative data: holdover fromC
    private double coolnessFactor; // camelCase
    /*
    primatives from C/C++
    int (short, int, long), double (float), boolean, char
     */
    private final double PI = 3.141578;

    /**
     * Javadoc comment
     * Constructor -- build an object of this class
     */
    /**
     * Parameterize constructor for class Bobby
     * @param n name
     * @param a age
     * @param c coolnessFactor
     */
    public Bobby(String n, int a, double c) {
        name = n;       // ASSIGNMENT OPERATOR -- right-assosiative
        age = a;
        coolnessFactor = c;
    }

    // ACCESSOR
    public String getName()     {   return name;    }
    public int getAge()         {   return age;    }

    /**
     * public return of coolnessFactor
     * @return a double representing how cool this Bobby is
     */
    public double getCoolness() {   return coolnessFactor;  }

    public String toString()    {
        return name + " is " + age + " years old and is " +
                (coolnessFactor*100) + "% cool";
    }

    /**
     * Main method of class Bobby
     * @param args Command-line arguments, if needed.
     */

    public static void main(String[] args) {
        Bobby b = new Bobby("Marge", 5000, .53);
        System.out.println(b.getAge());
    }
}

