package tiendas;

import enums.Tiendas;
import factory.Sucursales;

public class Stores {
    //SucursalTecnológico, SucursalCentro, SucursalJoséMaríaIglesias, SucursalCampobello;
    // Método que retorna la tienda correspondiente según el enum Tiendas
    public Sucursales getSucursal(Tiendas tienda) {
        switch (tienda) {
            case SucursalTecnológico:
                return new SucursalTecnologico();
            case SucursalCentro:
                return new SucursalCentro();
            case SucursalJoséMaríaIglesias:
                return new SucursalMariaIglesias();
            case SucursalCampobello:
                return new SucursalCampobello();
            default:
                return null; // Si no es una tienda válida
        }
    }
}
