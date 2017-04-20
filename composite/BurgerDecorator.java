
/**
 * Abstract class BurgerDecorator - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class BurgerDecorator extends Leaf implements BurgerPriceInterface
{
    // instance variables - replace the example below with your own

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    /*String[] choices;
    public BurgerDecorator(String[] choices)
    {
        this.choices = choices; 
    }*/
    String[] choices;
    public void setOptions(String[] ch)
    {
        this.choices = ch; 
        
    }

    public void printDescription()
    {
        String description = "";
        int i = 0;
        int len = choices.length;
        //bd.printDescription();
        while (i < len)
        {
            if(i == 0)
                description = description + choices[i];
            else
                description = description + " + " + choices[i];
            i++;
        }
        System.out.println(description);
    }
    
}