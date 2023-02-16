package SorpresaSorpresa.factories;
import SorpresaSorpresa.buttons.Buttons;
import SorpresaSorpresa.buttons.ButtonsMac;
import SorpresaSorpresa.checkbox.Checkbox;
import SorpresaSorpresa.checkbox.CheckboxMac;

public class MacOSFactory implements GUIFactory{
    public Buttons createButton() {
        return new ButtonsMac();
    }
    public Checkbox createCheckbox() {
        return new CheckboxMac();
    }
}
