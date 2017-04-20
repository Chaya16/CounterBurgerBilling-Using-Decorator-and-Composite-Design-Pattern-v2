
/**
 * Write a description of class PremiumToppings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumToppings extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String[] premiumToppings = new String[18];
    private double price = 0;
    BurgerDecorator bd;

    /**
     * Constructor for objects of class PremiumToppings
     */
    public PremiumToppings(BurgerDecorator bd, String[] premiumToppings)
    {
        // initialise instance variables
        setOptions(premiumToppings);
		this.bd = bd;
        this.premiumToppings = premiumToppings;
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
        int len = premiumToppings.length;
        price = bd.calculatePrice();
        for(i=0;i<len;i++)
        {
            if(premiumToppings[i]=="Marinated Tomatoes")
            {
                price= price +2.00;
            }
        }
        price = price + (len * 1);
        return price;
    }
    
    
}
