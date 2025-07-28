package factoryAbstractFactoryDesignPattern.normal;

public class Flutter {
    private SupportedPlaforms platform;

    public Flutter(SupportedPlaforms platform){
        this.platform = platform;
    }

    public UIFactory factory(){
        return UIFactoryFactory.getUIFactory(platform);
    }
}
