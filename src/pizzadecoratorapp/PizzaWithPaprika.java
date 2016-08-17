package pizzadecoratorapp;

public class PizzaWithPaprika extends PizzaDecorator{
    public PizzaWithPaprika(Pizza newPizza) {
        super(newPizza);
    }
    
    public String getDescription() {
        return pizza.getDescription() + ", paprika";
    }
    
    public double getCost() {
        return pizza.getCost() + .50;
    }
    
    public String toString() {
        return this.getDescription();
    }
}
