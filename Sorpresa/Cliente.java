package Sorpresa;

import Sorpresa.Dialogo.Dialogo;
import Sorpresa.Dialogo.DialogoWindows;
import Sorpresa.Dialogo.DialogoMac;

public class Cliente {
    public static void main(String[] args) {
        Dialogo dialogoW = new DialogoWindows();
        Dialogo dialogoM = new DialogoMac();
        dialogoW.mostrar();
        dialogoM.mostrar();

    }
}
