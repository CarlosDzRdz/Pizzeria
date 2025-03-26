import enums.Tiendas;
import factory.Pizza;
import factory.Sucursales;
import tiendas.Stores;

import java.util.EnumSet;

import static enums.Tiendas.SucursalTecnológico;

public class Main {

    public static void main(String[] args) {
        // Crear instancias de las sucursales
        Sucursales tecnologico = new SucursalTecnologico();
        Sucursales centro = new SucursalCentro();

        // Ordenar pizzas desde la sucursal Tecnológico
        Pizza pizza = tecnologico.ordenaPizza(Menu.Bari); // Usar el Enum de tipo de pizza
        System.out.println("Milton ordeno: " + pizza.getName() + "\n");

        /*
        Pizza pizza = tecnologico.ordenaPizza("Bari");
        System.out.println("Milton ordeno  " + pizza.getName() + "\n");

        pizza = tecnologico.ordenaPizza("camarones");
        System.out.println("Joel ordeno una " + pizza.getName() + "\n");

        pizza = centro.ordenaPizza("Ciciia");
        System.out.println("Milton ordeno" + pizza.getName() + "\n");

        pizza = centro.orderPizza("Chioggia ");
        System.out.println("Joel ordeno una  " + pizza.getName() + "\n");

        */
    }
}
