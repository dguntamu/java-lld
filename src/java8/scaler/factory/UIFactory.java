package java8.scaler.factory.components;

import java8.scaler.factory.components.button.Button;
import java8.scaler.factory.components.dropdown.DropDown;
import java8.scaler.factory.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    DropDown createDropDown();
}
