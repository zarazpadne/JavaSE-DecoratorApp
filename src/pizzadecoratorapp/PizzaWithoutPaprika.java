package pizzadecoratorapp;

public class PizzaWithoutPaprika extends PizzaDecorator{
    public PizzaWithoutPaprika(Pizza newPizza) {
        super(newPizza);
    }
    
    public String getDescription() {
        String desc = pizza.getDescription().replace(", paprika", "");
        return desc;
    }
    
    public double getCost() {
        return pizza.getCost() - .50;
    }
    
    public String toString() {
        return this.getDescription();
    }
}