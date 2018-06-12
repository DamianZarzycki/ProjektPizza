package Pl.Pizza.PizzaOrder;

import Pl.Pizza.PizzaModel.Pizza;

public class OdbiorSopot extends Order {
    Pizza pizza;

    public OdbiorSopot(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", odbior w Sopocie";
    }

    @Override
    public double koszt() {
        return pizza.koszt()+5;
    }
}
