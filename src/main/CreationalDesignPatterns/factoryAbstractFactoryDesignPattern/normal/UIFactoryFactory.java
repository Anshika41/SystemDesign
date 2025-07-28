package factoryAbstractFactoryDesignPattern.normal;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlaforms platform){
        switch(platform){
            case ANDROID:
                return new AndroidFactory();
            case IOS:
                return new IosFactory();
            case WINDOWS:
                return new WindowsFactory();

            default:
                throw new IllegalArgumentException("Invalid platform");
        }
    }
}
