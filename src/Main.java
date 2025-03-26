
import enums.Menu;

import factory.Pizza;
import factory.Sucursales;

import tiendas.*;


public class Main {
    public static void main(String[] args) {
        Sucursales tecnologico = new SucursalTecnologico();
        Sucursales centro = new SucursalCentro();

        Pizza pizza = tecnologico.ordenaPizza(Menu.BARI_PIZZA);
        System.out.println("Carlos ordenó una " + pizza.getName() + "\n");

        /*
        pizza = tecnologico.ordenaPizza(Menu.CAMARONES_PIZZA);
        System.out.println("Joel ordenó una " + pizza.getName() + "\n");

        pizza = centro.ordenaPizza(Menu.CICCIA_PIZZA);
        System.out.println("Milton ordenó una " + pizza.getName() + "\n");
        */

        pizza = centro.ordenaPizza(Menu.CHIOGGIA_PIZZA);
        System.out.println("Andres ordenó una " + pizza.getName() + "\n");
    }
}
