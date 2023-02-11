package SorpresaSorpresa.factories;
import SorpresaSorpresa.buttons.Buttons;
import SorpresaSorpresa.buttons.ButtonsWindows;
import SorpresaSorpresa.checkbox.Checkbox;
import SorpresaSorpresa.checkbox.CheckboxWindows;
public class WindowsFactory implements GUIFactory{
    public Buttons createButton() {
        return new ButtonsWindows();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxWindows();
    }
}
