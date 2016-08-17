package pizzadecoratorapp;

public class PizzaWithSalami extends PizzaDecorator{
    public PizzaWithSalami(Pizza newPizza) {
        super(newPizza);
    }
    
    public String getDescription() {
        return pizza.getDescription() + ", salami";
    }
    
    public double getCost() {
        return pizza.getCost() + 2.50;
    }
    
    public String toString() {
        return this.getDescription();
    }
}
