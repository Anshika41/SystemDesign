package factoryAbstractFactoryDesignPattern.normal;

import factoryAbstractFactoryDesignPattern.components.button.Button;
import factoryAbstractFactoryDesignPattern.components.dropdown.DropDown;
import factoryAbstractFactoryDesignPattern.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    DropDown createDropDown();
}
