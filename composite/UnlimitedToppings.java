
/**
 * Write a description of class Toppings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UnlimitedToppings extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String[] unlimitedToppings = new String[20];
    private double price = 0;
    BurgerDecorator bd;
    /**
     * Constructor for objects of class Toppings
     */
    public UnlimitedToppings(BurgerDecorator bd, String[] unlimitedToppings)
    {
        // initialise instance variables
        setOptions(unlimitedToppings);
        this.bd = bd;
        this.unlimitedToppings = unlimitedToppings;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double calculatePrice()
    {
        // put your code here
        double price = 0.0;
        price = bd.calculatePrice();
        return price;
    }
    
    
}
