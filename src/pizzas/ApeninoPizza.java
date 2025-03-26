package pizzas;

import factory.Pizza;

public class ApeninoPizza extends Pizza {
    public ApeninoPizza() {
        name = "Apenino Pizza";
        dough = "Delgada";
        sauce = "Tomate";

        Ingredientes ingredientes = new Ingredientes();
        toppings.add(ingredientes.getCarne(1));  // "Jamón"
        toppings.add(ingredientes.getCarne(0));  // "Salami"
        toppings.add(ingredientes.getVegetal(0)); // "Chile Morrón"
    }
}
