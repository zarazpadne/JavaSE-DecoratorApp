package pizzadecoratorapp;

public class PizzaDecorator implements Pizza{
    protected Pizza pizza;
    
    public PizzaDecorator(Pizza nowaPizza){
        pizza = nowaPizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
         return pizza.getCost();
    }
}
