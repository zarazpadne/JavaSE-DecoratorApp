package pizzadecoratorapp;

public class PizzaWithoutSalami extends PizzaDecorator{
    public PizzaWithoutSalami(Pizza newPizza) {
        super(newPizza);
    }
    
    public String getDescription() {
        String desc = pizza.getDescription().replace(", salami", "");
        return desc;
    }
    
    public double getCost() {
        return pizza.getCost() - 2.50;
    }
    
    public String toString() {
        return this.getDescription();
    }
}
