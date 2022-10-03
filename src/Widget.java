/**
 * Class Widget represents a simple product for testing
 * @author Srao2020
 * @version 09.15.2022
 */
public class Widget {
    private String name;
    private int ID;
    private double cost;

    /**
     * Default constructor for class Widget
     */
    public Widget() {
        name = new String();
        ID = 0;
        cost = 0;
    }

    /**
     * Parameterized Constructor for class Widget
     * @param n A String for the name value
     * @param i An <code>int</code> for the ID value
     * @param c A double for the cost value
     */
    public Widget(String n, int i, double c)    {
        name = n;
        ID = i;
        cost = c;
    }

    public String toString()    {
        return name + "/t" + ID + "/t$" + cost;
    }

    /**
     * Main method of class Widget
     * @param args Command-line arguments, if needed.
     */
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++)
            System.out.println(args[i]);
        Widget w = new Widget("waffle", 123, .75);
        Widget myBad= new Widget();
        System.out.println(w);
        System.out.println(myBad);
    }
}
