package tiendas;

import factory.Pizza;
import enums.Menu;
import factory.Sucursales;
import pizzas.*;

public class SucursalJoséMaríaIglesias extends Sucursales {
    @Override
    public Pizza creaPizza(Menu type) {
        Pizza pizza = null;
        switch (type) {
            case ANCHOAS_PIZZA:
                pizza = new AnchoasPizza();
                break;
            case APENINO_PIZZA:
                pizza = new ApeninoPizza();
                break;
            case BARI_PIZZA:
                pizza = new BariPizza();
                break;
            case CAMARONES_PIZZA:
                pizza = new CamaronesPizza();
                break;
            case CHIOGGIA_PIZZA:
                pizza = new ChioggiaPizza();
                break;
            case CICCIA_PIZZA:
                pizza = new CicciaPizza();
                break;
            default:
                System.out.println("Tipo de pizza no disponible en esta sucursal.");
        }
        return pizza;
    }
}
