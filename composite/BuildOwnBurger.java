import java.text.DecimalFormat;
import java.util.ArrayList;
/**
 * Write a description of class BuildOwnBurger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuildOwnBurger extends Composite implements BurgerPriceInterface
{
    // instance variables - replace the example below with your own
    private ArrayList<BurgerDecorator> components = new ArrayList<BurgerDecorator>() ;
    private BurgerPriceInterface burgerPriceInterface;
    BurgerDecorator bd;
    
    /**
     * Constructor for objects of class BuildOwnBurger
     */
    public BuildOwnBurger( String description)
    {
        // initialise instance variables 
        super(description);        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double calculatePrice()
    {
       return bd.calculatePrice(); 
    }
    
    public void setPriceDecorator(BurgerDecorator bd)
    {
        this.bd = bd;
    }
    public void printDescription()
    {
        // put your code here
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println();
        System.out.println();
        System.out.println(description + fmt.format(calculatePrice()));
        for (BurgerDecorator bdObj : components)
        {
           if(bdObj == null)
            System.out.println("NULL Object");
           else
            bdObj.printDescription();
        }   
    }
    
    public void addChild(BurgerDecorator c) {
        components.add( c ) ;
    }
     
    public void removeChild(BurgerDecorator c) {
        components.remove(c) ;
    }
     
    public BurgerDecorator getChild(int i) {
        return components.get( i ) ;
    }
}
