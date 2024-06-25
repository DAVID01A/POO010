package Modelo.Interfaces;

public class HidroAvion implements IobjetoVolador,Nautico {


    @Override
    public String volar() {
        return "el hidroavion esta volando";
    }

    @Override
    public String despegar() {
        return "el hidroavion esta despegando";
    }

    @Override
    public String aterrizar() {
        return "el hidroavion esta aterrizando";
    }

    @Override
    public String atracar() {
        return "el hidroavion esta atracando";
    }

    @Override
    public String navegar() {
        return "el hidroavion esta navegando";
    }
}
