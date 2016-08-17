package pizzadecoratorapp;

public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Pizza with tomato sauce and mozzarella";
    }

    @Override
    public double getCost() {
        return 10.00;
    }
    
    public String toString() {
        return this.getDescription();
    }
    
}
