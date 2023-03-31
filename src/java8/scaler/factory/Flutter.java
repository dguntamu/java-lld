package java8.scaler.factory;

public class Flutter {
    private SupportedPlatforms supportedPlatforms;
    public Flutter(SupportedPlatforms supportedPlatforms){
        this.supportedPlatforms = supportedPlatforms;
    }
    public void setTheme(){
        System.out.println("Setting up theme");
    }
    public void setRefreshRate(){
        System.out.println("Setting up refresh rate");
    }
    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(this.supportedPlatforms);
    }
}
