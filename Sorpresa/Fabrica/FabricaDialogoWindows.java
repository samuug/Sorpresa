package Sorpresa.Fabrica;
import Sorpresa.Dialogo.Dialogo;
import Sorpresa.Dialogo.DialogoWindows;
public abstract class FabricaDialogoWindows implements GUIFactory {
    public Dialogo crearDialogo() {
        return new DialogoWindows();
    }
}
