package pizzas;

import factory.Pizza;

public class BariPizza extends Pizza {
    public BariPizza() {
        name = "Bari Pizza";
        dough = "Delgada";
        sauce = "Tomate";

        Ingredientes ingredientes = new Ingredientes();
        toppings.add(ingredientes.getCarne(1));  // "Jamón"
        toppings.add(ingredientes.getVegetal(1)); // "Elote"
        toppings.add(ingredientes.getVegetal(0)); // "Chile Morrón"
    }
}
