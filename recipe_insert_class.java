/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recipe.inventory.system;
import dao.usertablequery;
import dao.usertablequery.RecipeTableQuery;
import java.sql.Clob;
import java.io.StringReader;

import model.Recipes;

/**
 *
 * @author my
 */
public class recipe_insert_class {
    public static void main(String args[]){
    
    Recipes r1 = new Recipes(
            "Guacamole",
            "Appetizer",
            "Mexican",
            "Creamy avocado dip made with ripe avocados",
            "15 minutes",
            "Avocados, tomatoes, onions, lime juice, cilantro",
            "1. Mash avocados in a bowl. \n2. Stir in diced tomatoes, onions, lime juice, and chopped cilantro.\n3. Season with salt and pepper.\n4. Serve with tortilla chips or as a topping for tacos.",
            6,
            "",
            ""
        );

        Recipes r2 = new Recipes(
            "Tacos al Pastor",
            "Main Course",
            "Mexican",
            "Traditional Mexican street food featuring marinated pork cooked on a vertical spit",
           "30 minutes",
                "Pork, pineapple, onions, spices, corn tortillas, cilantro, salsa verde",
                "1. Marinate pork with pineapple, onions, and spices. /n2. Grill or roast the marinated pork until cooked. /n3. Slice pork thinly. /n4. Serve in corn tortillas with onions, cilantro, and salsa verde. /n5. Enjoy!",
            4,
            "",
            ""
        );

        Recipes r3 = new Recipes(
            "Chicken Enchiladas",
            "Main Course",
            "Mexican",
                  "Corn tortillas filled with shredded chicken, rolled, and baked with enchilada sauce and cheese",
            "45 minutes",
                "Chicken, corn tortillas, enchilada sauce, cheese, rice, beans",
          
                "1. Cook chicken until tender and shred. /n2. Roll shredded chicken in corn tortillas. /n3. Place rolled enchiladas in a baking dish. /n4. Cover with enchilada sauce and cheese. /n5. Bake until bubbly and cheese is melted. /n6. Serve hot with rice and beans.",
            4,
            "",
            ""
        );

        Recipes r4 = new Recipes(
            "Chiles Rellenos",
            "Main Course",
            "Mexican",
                 "Stuffed poblano peppers filled with cheese, meat, or beans, battered, and fried",
            "60 minutes",
                "Poblano peppers, cheese, meat, beans, batter, tomato salsa",
           
                "1. Roast poblano peppers until charred. /n2. Peel off the skin and make a slit to remove seeds. /n3. Stuff peppers with cheese, meat, or beans. /n4. Dip stuffed peppers in batter. /n5. Fry until golden brown. /n6. Serve hot with tomato salsa.",
            4,
            "",
            ""
        );

        Recipes r5 = new Recipes(
            "Salsa Verde",
            "Appetizer",
            "Mexican",
                  "Spicy and tangy Mexican green salsa made with tomatillos, jalapenos, onions, and cilantro",
            "20 minutes",
                "Tomatillos, jalapenos, onions, garlic, cilantro, salt, lime juice, tortilla chips",
          
                "1. Roast tomatillos and jalapenos until charred. /n2. Blend roasted vegetables with onions, garlic, and cilantro. /n3. Season with salt and lime juice. /n4. Serve chilled with tortilla chips or as a condiment.",
            6,
            "",
            ""
        );

        Recipes r6 = new Recipes(
            "Margarita",
            "Beverage",
            "Mexican",
            "Classic Mexican cocktail made with tequila, lime juice, triple sec, and simple syrup",
           "10 minutes",
                "Tequila, lime juice, triple sec, simple syrup, salt, lime wedge",
                "1. Rim a glass with salt. /n2. Fill a shaker with ice, tequila, lime juice, triple sec, and simple syrup. /n3. Shake well. /n4. Strain into the prepared glass. /n5. Garnish with a lime wedge. /n6. Enjoy!",
            1,
            "",
            ""
        );

        Recipes r7 = new Recipes(
            "Queso Fundido",
            "Appetizer",
            "Mexican",
            "Melted cheese dip with chorizo, onions, and peppers, served hot with tortilla chips",
           "25 minutes",
                "Chorizo, onions, peppers, shredded cheese, tortilla chips",
                "1. Cook chorizo in a skillet until browned. /n2. Add onions and peppers, cook until soft. /n3. Add shredded cheese and melt until bubbly. /n4. Serve hot with tortilla chips for dipping.",
            6,
            "",
            ""
        );

        Recipes r8 = new Recipes(
            "Carnitas",
            "Main Course",
            "Mexican",
            "Slow-cooked Mexican pork dish, tender and crispy, typically served with tortillas and salsa",
            "60 minutes",
                "Pork shoulder, salt, pepper, spices, tortillas, salsa, toppings of your choice",
     
                "1. Season pork shoulder with salt, pepper, and spices. 2. Cook in a slow cooker until tender. 3. Shred the pork and spread it on a baking sheet. 4. Broil until crispy. 5. Serve hot with tortillas, salsa, and toppings.",
            4,
            "",
            ""
        );

        Recipes r9 = new Recipes(
            "Mexican Street Corn (Elote)",
            "Appetizer",
            "Mexican",
            "Grilled corn on the cob coated with mayonnaise, cheese, chili powder, and lime juice",
              "30 minutes",
                "Corn on the cob, mayonnaise, cheese, chili powder, lime juice",
                "1. Grill corn on the cob until charred. /n2. Spread mayonnaise over the grilled corn. /n3. Roll in crumbled cotija cheese. /n4. Sprinkle with chili powder and drizzle with lime juice. /n5. Serve hot.",
            6,
            "",
            ""
        );

        Recipes r10 = new Recipes(
            "Sopa de Tortilla (Tortilla Soup)",
            "Appetizer",
            "Mexican",
            "Mexican soup made with chicken, tomatoes, onions, garlic, and crispy tortilla strips",
           "40 minutes",
                "Chicken, tomatoes, onions, garlic, tortilla strips, avocado, cheese, cilantro",
                "1. Cook chicken in a pot until tender. /n2. Saute onions and garlic until soft. /n3. Add diced tomatoes and spices. /n4. Shred chicken and add it to the pot. /n5. Simmer until flavors meld. /n6. Serve hot with crispy tortilla strips and garnish with avocado, cheese, and cilantro.",
            4,
            "",
            ""
        );

        // Save recipes to the database
        RecipeTableQuery.save(r1);
        RecipeTableQuery.save(r2);
        RecipeTableQuery.save(r3);
        RecipeTableQuery.save(r4);
        RecipeTableQuery.save(r5);
        RecipeTableQuery.save(r6);
        RecipeTableQuery.save(r7);
        RecipeTableQuery.save(r8);
        RecipeTableQuery.save(r9);
        RecipeTableQuery.save(r10);
    }
}
