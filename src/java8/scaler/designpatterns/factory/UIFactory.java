package java8.scaler.designpatterns.factory;

import java8.scaler.designpatterns.factory.components.button.Button;
import java8.scaler.designpatterns.factory.components.dropdown.DropDown;
import java8.scaler.designpatterns.factory.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    DropDown createDropDown();
}
