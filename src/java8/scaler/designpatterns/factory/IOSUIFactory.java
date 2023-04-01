package java8.scaler.designpatterns.factory;

import java8.scaler.designpatterns.factory.components.button.Button;
import java8.scaler.designpatterns.factory.components.button.IOSButton;
import java8.scaler.designpatterns.factory.components.dropdown.DropDown;
import java8.scaler.designpatterns.factory.components.dropdown.IOSDropDown;
import java8.scaler.designpatterns.factory.components.menu.IOSMenu;
import java8.scaler.designpatterns.factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    /**
     * @return
     */
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    /**
     * @return
     */
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    /**
     * @return
     */
    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
