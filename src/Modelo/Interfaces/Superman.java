package Modelo.Interfaces;

public class Superman extends Kriptoniano implements IobjetoVolador{
    @Override
    public String volar() {
        return "superman esta volando";
    }

    @Override
    public String despegar() {
        return "Superman esta despegando";
    }

    @Override
    public String aterrizar() {
        return "Superman esta aterrizando";
    }
}
