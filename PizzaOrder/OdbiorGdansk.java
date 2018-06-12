package Pl.Pizza.PizzaOrder;

import Pl.Pizza.PizzaModel.Pizza;

public class OdbiorGdansk extends Order {
    Pizza pizza;

    public OdbiorGdansk(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", odbior w Gdansku";
    }

    @Override
    public double koszt() {
        return pizza.koszt()+5;
    }
}
