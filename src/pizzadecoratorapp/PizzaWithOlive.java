package pizzadecoratorapp;

public class PizzaWithOlive extends PizzaDecorator{
    public PizzaWithOlive(Pizza newPizza) {
        super(newPizza);
    }
    
    public String getDescription() {
        return pizza.getDescription() + ", olive";
    }
    
    public double getCost() {
        return pizza.getCost() + 1.50;
    }
    
    public String toString() {
        return this.getDescription();
    }
}
