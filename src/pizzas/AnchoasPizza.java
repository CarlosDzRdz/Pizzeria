package pizzas;

import factory.Pizza;

public class AnchoasPizza extends Pizza {
    public AnchoasPizza() {
        name = "Anchoas Pizza";
        dough = "Delgada";
        sauce = "Tomate";

        // Añadir ingredientes
        Ingredientes ingredientes = new Ingredientes();
        toppings.add(ingredientes.getVegetal(2));// Anchoas
    }
}
