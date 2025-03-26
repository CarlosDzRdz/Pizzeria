package ingredientes;

import java.util.ArrayList;
import java.util.Arrays;

public class Ingredientes {

    ArrayList<String> Carne;
    ArrayList<String> Vegetales;

    // Constructor
    public Ingredientes() {
        // Inicializar los ArrayList con los valores predeterminados
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

    public ArrayList<String> getCarne() {
        return Carne;
    }

    public void setCarne(ArrayList<String> carne) {
        Carne = carne;
    }

    public ArrayList<String> getVegetales() {
        return Vegetales;
    }

    public void setVegetales(ArrayList<String> vegetales) {
        Vegetales = vegetales;
    }
}
