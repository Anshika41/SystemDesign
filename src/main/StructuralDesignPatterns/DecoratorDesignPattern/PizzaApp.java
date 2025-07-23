package DecoratorDesignPattern;

public class PizzaApp {
    public static void main(String[] args) {
        //Basic pizza
        Pizza pizza = new BasicPizza();

        //Add Cheese
        pizza = new CheeseDecorator(pizza);

        //Add Olive
        pizza = new OliveDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
