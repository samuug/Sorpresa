package SorpresaSorpresa;
import SorpresaSorpresa.factories.GUIFactory;
import SorpresaSorpresa.factories.MacOSFactory;
import SorpresaSorpresa.factories.WindowsFactory;
import SorpresaSorpresa.app.Application;
public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}