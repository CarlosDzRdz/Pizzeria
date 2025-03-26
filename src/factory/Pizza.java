package factory;

import ingredientes.Ingredientes;

import java.util.ArrayList;

import enums.Menu;

public abstract class Pizza extends Ingredientes {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void prepara() {
        System.out.println("Preparando                " + name);
        System.out.println("Amazando               ...");
        System.out.println("Aagregando salsa       ...");
        System.out.println("Ingredientes adicionales: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void hornea() {
        System.out.println("Hornear por 25 minutes a 350");
    }

    void corta() {
        System.out.println("Cortar la pizza  en diagonal");
    }

    void embalar() {
        System.out.println("Enpaquetando la pizza en su recipiente");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

}
