package SorpresaSorpresa.factories;
import SorpresaSorpresa.buttons.Buttons;
import SorpresaSorpresa.checkbox.Checkbox;
public interface GUIFactory {
    Buttons createButton();
    Checkbox createCheckbox();
}
