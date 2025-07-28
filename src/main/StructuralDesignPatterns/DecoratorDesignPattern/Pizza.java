package DecoratorDesignPattern;
//Interface Pizza. It declares two methods getDescription()
// and getCost() which must be
// implemented by concrete components and decorators.
public interface Pizza {

    String getDescription();

    double getCost();
}
