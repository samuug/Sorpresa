package SorpresaSorpresa.app;

import SorpresaSorpresa.buttons.Buttons;
import SorpresaSorpresa.checkbox.Checkbox;
import SorpresaSorpresa.factories.GUIFactory;
public class Application {
    private Buttons button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
