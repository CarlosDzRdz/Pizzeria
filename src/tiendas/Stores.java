package tiendas;

import enums.Tiendas;
import factory.Sucursales;

public class Stores {

    public Sucursales getSucursal(Tiendas tienda) {
        switch (tienda) {
            case SucursalTecnológico:
                return new SucursalTecnologico();
            case SucursalCentro:
                return new SucursalCentro();
            case SucursalJoséMaríaIglesias:
                return new SucursalJoséMaríaIglesias();
            case SucursalCampobello:
                return new SucursalCampobello();
            default:
                return null; // Si no es una tienda válida
        }
    }
}
