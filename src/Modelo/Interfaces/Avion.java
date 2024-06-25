package Modelo.Interfaces;

public class Avion extends Vehiculo implements IobjetoVolador{
    @Override
    public String volar() {
        return "el avion esta volando";
    }

    @Override
    public String despegar() {
        return "el avion esta despegando";
    }

    @Override
    public String aterrizar() {
        return "el avion esta aterizando";
    }
}
