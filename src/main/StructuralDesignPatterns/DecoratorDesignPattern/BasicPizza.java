package DecoratorDesignPattern;

public class BasicPizza implements Pizza{

    //BasicPizza is a concrete class implements pizza interface.
    //provide description and cost of Basic pizza by implementing methods.
    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
