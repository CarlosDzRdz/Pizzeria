package factory;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<String>();

    void prepara() {
        System.out.println("Preparando " + name);
        System.out.println("Amasando...");
        System.out.println("Agregando salsa...");
        System.out.println("Ingredientes adicionales:");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void hornea() {
        System.out.println("Horneando por 25 minutos a 350 grados.");
    }

    void corta() {
        System.out.println("Cortando la pizza en diagonal.");
    }

    void embalar() {
        System.out.println("Empacando la pizza en su recipiente.");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

}

