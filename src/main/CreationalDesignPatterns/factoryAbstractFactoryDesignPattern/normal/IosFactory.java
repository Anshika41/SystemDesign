package factoryAbstractFactoryDesignPattern.normal;

import factoryAbstractFactoryDesignPattern.components.button.Button;
import factoryAbstractFactoryDesignPattern.components.button.IOSButton;
import factoryAbstractFactoryDesignPattern.components.dropdown.DropDown;
import factoryAbstractFactoryDesignPattern.components.dropdown.IOSDropDown;
import factoryAbstractFactoryDesignPattern.components.menu.IOSMenu;
import factoryAbstractFactoryDesignPattern.components.menu.Menu;

public class IosFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
