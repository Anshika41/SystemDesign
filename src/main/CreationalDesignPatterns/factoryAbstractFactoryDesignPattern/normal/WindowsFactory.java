package factoryAbstractFactoryDesignPattern.normal;

import factoryAbstractFactoryDesignPattern.components.button.Button;
import factoryAbstractFactoryDesignPattern.components.button.WindowsButton;
import factoryAbstractFactoryDesignPattern.components.dropdown.DropDown;
import factoryAbstractFactoryDesignPattern.components.menu.Menu;
import factoryAbstractFactoryDesignPattern.components.menu.WindowsMenu;

public class WindowsFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public DropDown createDropDown() {
        return null;
    }
}
