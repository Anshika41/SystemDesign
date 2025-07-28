package factoryAbstractFactoryDesignPattern.normal;

import factoryAbstractFactoryDesignPattern.components.button.AndroidButton;
import factoryAbstractFactoryDesignPattern.components.button.Button;
import factoryAbstractFactoryDesignPattern.components.dropdown.AndroidDropdown;
import factoryAbstractFactoryDesignPattern.components.dropdown.DropDown;
import factoryAbstractFactoryDesignPattern.components.menu.AndroidMenu;
import factoryAbstractFactoryDesignPattern.components.menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropdown();
    }
}
