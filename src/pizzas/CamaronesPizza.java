package pizzas;

import factory.Pizza;

public class CamaronesPizza extends Pizza {
    public CamaronesPizza() {
        name = "Camarones Pizza";
        dough = "Delgada";
        sauce = "Tomate";

        Ingredientes ingredientes = new Ingredientes();
        toppings.add(ingredientes.getCarne(2));  // "Camarones"
    }
}
