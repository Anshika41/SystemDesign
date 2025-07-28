package DecoratorDesignPattern;
//CheeseDecorator is an abstract class implementing Pizza interface.
//It maintains a reference to the decorated Pizza object.
public abstract class PizzaDecorator implements Pizza{
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza){
        this.decoratedPizza = pizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }
}
