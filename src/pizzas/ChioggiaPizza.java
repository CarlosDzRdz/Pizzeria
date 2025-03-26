package pizzas;

import factory.Pizza;

public class ChioggiaPizza extends Pizza {
    public ChioggiaPizza() {
        name = "Chioggia Pizza";
        dough = "Delgada";
        sauce = "Tomate";

        Ingredientes ingredientes = new Ingredientes();
        toppings.add(ingredientes.getCarne(1));  // "Jamón"
        toppings.add(ingredientes.getCarne(4));  // "Carne"
        toppings.add(ingredientes.getCarne(5));  // "Chorizo"
    }
}
