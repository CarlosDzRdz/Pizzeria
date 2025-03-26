package tiendas;

import factory.Pizza;
import enums.Menu;
import factory.Sucursales;


public class SucursalTecnologico extends Sucursales {

    @Override
    public Pizza creaPizza(Menu type) {
        // Aquí puedes usar el switch para elegir el tipo de pizza que quieres crear
        Pizza pizza = null;
        switch (type) {
            case Bari:
                pizza = new AnchoasPizza();
                break;
            case AnchoasPizza:
                pizza = new AnchoasPizza();
                break;
            // Agrega los demás casos según las pizzas que tengas
            default:
                System.out.println("Tipo de pizza no disponible en esta sucursal.");
        }
        return pizza;
    }
}
