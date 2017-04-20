 

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        
               
        BuildOwnBurger bob1 = new BuildOwnBurger("Build Your Own Burger ");
		
		BurgerDecorator b1 = new Burger (new String[] {"Organic Bison*", "1/2lb.", "On a Bun"});
		bob1.addChild(b1);
        Cheese c1 = new Cheese (b1, new String[] {"Yellow American", "Spicy Jalapeno Jack"});
        bob1.addChild(c1);
		PremiumCheese p1 = new PremiumCheese (c1, new String[] {"Danish Blue Cheese"});
        bob1.addChild(p1);
		Sauce s1 = new Sauce (p1, new String[]{"Mayonnaise", "Thai Peanut Sauce"}); 
        bob1.addChild(s1);
		UnlimitedToppings u1 = new UnlimitedToppings (s1, new String[]{"Dill Pickle Chips", "Black Olives", "Spicy Pickles"});
        bob1.addChild(u1);
		PremiumToppings pt1 = new PremiumToppings (u1, new String[]{"Marinated Tomatoes"});
        bob1.addChild(pt1);
		Bun bun1 = new Bun (pt1, new String[]{"Ciabatta(Vegan)"}); 
        bob1.addChild(bun1);
		Side side1 = new Side (bun1, new String[]{"Shoestring Fries"});
		bob1.addChild(side1);
		bob1.setPriceDecorator(side1);
		order.addChild(bob1);
		
		        
        BuildOwnBurger bob2 = new BuildOwnBurger("Build Your Own Burger ");
		
		BurgerDecorator b2 = new Burger (new String[] {"Hormone & Antibiotic Free Beef*", "1/3lb.", "On a Bun"});
		bob2.addChild(b2);
        Cheese c2 = new Cheese (b2, new String[] {"Smoked Gouda", "Greek Feta"});
        bob2.addChild(c2);
		PremiumCheese p2 = new PremiumCheese (c2, new String[] {"Fresh Mozzarella"});
        bob2.addChild(p2);
		Sauce s2 = new Sauce (p2, new String[]{"Habanero Salsa"}); 
        bob2.addChild(s2);
		UnlimitedToppings u2 = new UnlimitedToppings (s2, new String[]{"Crushed Peanuts"});
        bob2.addChild(u2);
		PremiumToppings pt2 = new PremiumToppings (u2, new String[]{"Sunny Side Up Egg*", "Marinated Tomatoes"});
        bob2.addChild(pt2);
		Bun bun2 = new Bun (pt2, new String[]{"Gluten-Free Bun"}); 
        bob2.addChild(bun2);
		Side side2 = new Side (bun2, new String[]{"Shoestring Fries"});
		bob2.addChild(side2);
		bob2.setPriceDecorator(side2);
		order.addChild(bob2);   
       
        
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/