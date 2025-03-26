package pizzas;

import factory.Pizza;

public class CicciaPizza extends Pizza {
    public CicciaPizza() {
        name = "Ciccia Pizza";
        dough = "Delgada";
        sauce = "Tomate";

        Ingredientes ingredientes = new Ingredientes();
        toppings.add(ingredientes.getCarne(3));  // "Carne Seca"
    }
}
