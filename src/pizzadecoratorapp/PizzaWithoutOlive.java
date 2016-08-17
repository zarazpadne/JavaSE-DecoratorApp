package pizzadecoratorapp;

public class PizzaWithoutOlive extends PizzaDecorator{
    public PizzaWithoutOlive(Pizza newPizza) {
        super(newPizza);
    }
    
    public String getDescription() {
        String desc = pizza.getDescription().replace(", olive", "");
        return desc;
    }
    
    public double getCost() {
        return pizza.getCost() - 1.50;
    }
    
    public String toString() {
        return this.getDescription();
    }
}