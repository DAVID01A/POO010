package Modelo.Interfaces;

public class Ave extends Animal implements IobjetoVolador{
    @Override
    public String volar() {
        return "el ave esta volando";
    }

    @Override
    public String despegar() {
        return "el ave esta despegando";
    }

    @Override
    public String aterrizar() {
        return "el ave esta aterrizando";
    }
}
