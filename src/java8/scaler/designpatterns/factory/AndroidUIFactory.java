package java8.scaler.designpatterns.factory;

import java8.scaler.designpatterns.factory.components.button.Button;
import java8.scaler.designpatterns.factory.components.button.AndroidButton;
import java8.scaler.designpatterns.factory.components.dropdown.AndroidDropDown;
import java8.scaler.designpatterns.factory.components.dropdown.DropDown;
import java8.scaler.designpatterns.factory.components.menu.AndroidMenu;
import java8.scaler.designpatterns.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    /**
     * @return
     */
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    /**
     * @return
     */
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    /**
     * @return
     */
    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
