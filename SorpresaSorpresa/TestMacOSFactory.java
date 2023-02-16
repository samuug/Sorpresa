package SorpresaSorpresa;

import junit.framework.TestCase;
import SorpresaSorpresa.factories.GUIFactory;
import SorpresaSorpresa.factories.MacOSFactory;
import SorpresaSorpresa.buttons.Buttons;
import SorpresaSorpresa.checkbox.Checkbox;

public class TestMacOSFactory {
    public static void testMacOSFactory() {
        GUIFactory factory = new MacOSFactory();
        Buttons button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        testMacOSFactory();
    }
}
