package Pl.Pizza.PizzaOrder;

import Pl.Pizza.PizzaModel.Pizza;

public class OdbiorGdynia extends Order {
    Pizza pizza;

    public OdbiorGdynia(Pizza pizza){
        this.pizza=pizza;
    }


    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", odbiór w Gdyni";
    }

    @Override
    public double koszt() {
        return pizza.koszt();
    }
}

