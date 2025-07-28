package factoryAbstractFactoryDesignPattern.normal;

import factoryAbstractFactoryDesignPattern.normal.UIFactory;
import factoryAbstractFactoryDesignPattern.components.button.Button;
import factoryAbstractFactoryDesignPattern.components.dropdown.DropDown;
import factoryAbstractFactoryDesignPattern.components.menu.Menu;

public class FactoryMainClient {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlaforms.IOS);
        UIFactory factory = flutter.factory();

        Menu menu = factory.createMenu();
        DropDown dropDown = factory.createDropDown();
        Button button = factory.createButton();

        System.out.println(menu);
        System.out.println(dropDown);
        System.out.println(button);
    }
}
