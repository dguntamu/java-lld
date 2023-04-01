package java8.scaler.designpatterns.factory;

import java8.scaler.designpatterns.factory.components.button.Button;
import java8.scaler.designpatterns.factory.components.dropdown.DropDown;
import java8.scaler.designpatterns.factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.IOS);
        //Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        DropDown dropDown = uiFactory.createDropDown();
        Menu menu = uiFactory.createMenu();

    }
}
