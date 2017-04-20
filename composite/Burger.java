import java.lang.String.*;

/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String meatType = "";
    private String qty = "";
    private String bunOrBowl = "";
    private String[] order = new String[3];
    BurgerDecorator bd;
        
    /**
     * Constructor for objects of class Burger
     */
    public Burger(String order[])
    {
        // initialise instance variables
        
        this.meatType = order [0];
        this.qty = order [1];
        this.bunOrBowl = order [2];
         
        setOptions(order);
        
        
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
        double price = 0;
        
        switch(meatType)
        {
            case "Organic Bison*" : price = price + 4;
            break;
            case "Ahi Tuna*" : price = price + 4;
            break;
        }
        
        switch (qty)
        {
            case "1/3lb." :  price = price + 9;
            break;            
            case "1/2lb." :  price = price + 12;
            break;            
            case "1lb." :  price = price + 18;
            break;
        }
                
        if ( bunOrBowl.equals("In A Bowl") )
            price = price + 1;
        return price;
    }
}
