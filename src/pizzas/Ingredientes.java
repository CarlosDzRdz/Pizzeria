package pizzas;

import java.util.ArrayList;
import java.util.Arrays;

public class Ingredientes {

    private ArrayList<String> Carne;
    private ArrayList<String> Vegetales;

    // Constructor
    public Ingredientes() {
        Carne = new ArrayList<>(Arrays.asList(
                "salami",
                "jamón",
                "camarones",
                "carne seca",
                "carne",
                "chorizo"
        ));

        Vegetales = new ArrayList<>(Arrays.asList(
                "chile morrón",
                "elote",
                "anchoas"
        ));
    }

    // Getters para acceder a los ingredientes
    public ArrayList<String> getCarne() {
        return Carne;
    }

    public ArrayList<String> getVegetales() {
        return Vegetales;
    }

    // Si necesitas acceder por índice de forma más directa
    public String getVegetal(int index) {
        return Vegetales.get(index);
    }

    public String getCarne(int index) {
        return Carne.get(index);
    }
}
