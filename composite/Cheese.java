
/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String[] cheese = new String[9];
    private double price = 0;
    BurgerDecorator bd;

    /**
     * Constructor for objects of class Cheese
     */
    public Cheese(BurgerDecorator bd, String[] cheese)
    {
        // initialise instance variables
        this.bd = bd;        
        setOptions(cheese);
        this.cheese = cheese;
    }

    /**
     * An example of a method - replac

     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double calculatePrice()
    {
        // put your code here
        int  i = 0;
        int len = cheese.length;
        if(len > 1)
            price = bd.calculatePrice() + ( (len-1) * 1 );
        else
            price = bd.calculatePrice();
        return price;
    }
    
    
}
