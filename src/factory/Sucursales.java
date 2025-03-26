package factory;
import enums.Menu;

import tiendas.Stores;

public abstract class Sucursales extends Stores {

    protected abstract Pizza creaPizza(Menu item);

    public Pizza ordenaPizza(Menu type) {
        Pizza pizza = creaPizza(type);
        System.out.println("--- Preparando una pizza de: " + pizza.getName() + " ---");
        pizza.prepara();
        pizza.hornea();
        pizza.corta();
        pizza.embalar();
        return pizza;
    }
}
