
/**
 * Write a description of class Premium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumCheese extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String[] premiumCheese = new String[20];
    private double price = 0;   
    BurgerDecorator bd;

    /**
     * Constructor for objects of class Premium
     */
    public PremiumCheese(BurgerDecorator bd, String[] premiumCheese)
    {
        // initialise instance variables
        setOptions(premiumCheese);
		this.bd = bd;
        this.premiumCheese = premiumCheese;
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
        int len = premiumCheese.length;
        price = bd.calculatePrice() + ( len * 1.50 );
        return price;
    }
    
   
}
