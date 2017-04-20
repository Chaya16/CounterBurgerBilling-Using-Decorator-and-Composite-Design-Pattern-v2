
/**
 * Write a description of class Side here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Side extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String[] side = new String[6];
    private double price = 0;
    BurgerDecorator bd;


    /**
     * Constructor for objects of class Side
     */
    public Side(BurgerDecorator bd, String[] side)
    {
        // initialise instance variables
       setOptions(side);
	   this.bd = bd;
       this.side = side;
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
        int len = side.length;
        if( (len == 1) && ((this.side).equals("No Side")))
            price = bd.calculatePrice();
        else
            price = bd.calculatePrice() + (len * 3);
        return price;
    }
    
    
}
