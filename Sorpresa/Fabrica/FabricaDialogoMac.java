package Sorpresa.Fabrica;
import Sorpresa.Dialogo.Dialogo;
import Sorpresa.Dialogo.DialogoMac;
public abstract class FabricaDialogoMac implements GUIFactory {
    public Dialogo crearDialogo() {
        return new DialogoMac();
    }
}
