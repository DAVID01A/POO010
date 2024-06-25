package Modelo.Interfaces;

public class Barcaza extends Vehiculo implements Nautico {

    @Override
    public String atracar() {
        return "la barcaza esta atracando";
    }

    @Override
    public String navegar() {
        return "la barcaza esta navegando";
    }
}
