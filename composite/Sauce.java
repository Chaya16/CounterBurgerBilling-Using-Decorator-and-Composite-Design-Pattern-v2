
/**
 * Write a description of class Sauce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sauce extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String[] sauces = new String[26];
    private double price = 0;
    BurgerDecorator bd;

    /**
     * Constructor for objects of class Sauce
     */
    public Sauce(BurgerDecorator bd, String[] sauces)
    {
        // initialise instance variables
        setOptions(sauces);
		this.bd = bd;
        this.sauces = sauces;
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
        int  i = 0;
        int len = sauces.length;
        if(len > 1)
            price = bd.calculatePrice() + ( (len-1) * 0.50 );
        else
            price = bd.calculatePrice();
        return price;
    }
    
    
}
