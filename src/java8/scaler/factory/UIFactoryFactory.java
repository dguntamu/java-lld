package java8.scaler.factory;

public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatforms supportedPlatforms){
        if(supportedPlatforms.equals(SupportedPlatforms.ANDROID)){
            return new AndroidUIFactory();
        }else if(supportedPlatforms.equals(SupportedPlatforms.IOS)){
            return new IOSUIFactory();
        }
        return null;
    }
}
