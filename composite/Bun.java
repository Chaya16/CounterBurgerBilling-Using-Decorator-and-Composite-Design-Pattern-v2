
/**
 * Write a description of class Bun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bun extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String[] bun = new String[7];
    private double price = 0;
    BurgerDecorator bd;

    /**
     * Constructor for objects of class Bun
     */
    public Bun(BurgerDecorator bd, String[] bun)
    {
        // initialise instance variables
       setOptions(bun);
	   this.bd = bd;
       this.bun = bun;
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
        int len = bun.length;
       
        
		for(i=0;i<len;i++)
        {
            if(bun[i]=="Gluten-Free Bun")
            {
                price= price +1.00;
            }
			if(bun[i]=="Hawaiian Bun")
            {
                price= price + 1.00;
            }
			if(bun[i]=="Pretzel Bun")
            {
                price= price + 1.00;
            }
        }
        return (price + bd.calculatePrice());
    }
    
    
}
