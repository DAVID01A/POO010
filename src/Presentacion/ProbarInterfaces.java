package Presentacion;

import Modelo.Interfaces.*;

public class ProbarInterfaces {
    public static void main(String[] args) {

        //Instanciar un avion con el nombre de objeto a1
        Avion a1 = new Avion();
        //Instanciar un avion con el nombre de objeto a2 en una referencia de ObjetoVolador
        IobjetoVolador a2 = new Avion();
        //Instanciar un avion con el nombre de objeto a3 en una referncia de ObjetoVolador
        IobjetoVolador a3 = new Avion();
        //Instanciar un ave con el nombre de a4 usando el constructor
        Ave a4 = new Ave();
        //Instanciar un ave con el nombre de a5 usando el constructor completo
        //en una referencia de ObjetoVolador
        IobjetoVolador a5 = new Ave();
        //Instanciar un avión con el nombre de objeto a6 usando el constructor completo
        // en una referencia de ObjetoVolador
        IobjetoVolador a6 = new Avion();
        //Instanciar un Superman con el nombre de a7
        // en una referencia de ObjetoVolador
        IobjetoVolador a7 = new Superman();

        IobjetoVolador[] objetos = {a1,a2,a3,a4,a5,a6,a7};

        for(IobjetoVolador elemento: objetos ){
            System.out.println(elemento.despegar());
            System.out.println(elemento.volar());
            System.out.println(elemento.aterrizar() +"\n");
        }
        //Instanciar un Hidroavion
        HidroAvion ha1 = new HidroAvion();
        // Instanciar un Hidroavion con el nombre de objeto ha2 en una referencia Nautico
        Nautico ha2 = new HidroAvion();
        // Instanciar una barcaza con el nombre de objeto b1
        Barcaza b1 = new Barcaza();
        // Instanciar una barcaza con el nombre de objeto b2, en una referencia de Nautico
        Nautico b2 = new Barcaza();

        Nautico[] objeto1={ha1,ha2,b1,b2};
        for (Nautico elemento1 : objeto1){
            System.out.println(elemento1.atracar());
            System.out.println(elemento1.navegar() + "\n");
        }

    }
}
