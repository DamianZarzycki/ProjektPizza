package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.Pizza;

public class Pomidor extends PizzaTopping {
    Pizza pizza;

    public Pomidor(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", pomidor";
    }

    @Override
    public double ostrosc() {
        return pizza.ostrosc();
    }

    @Override
    public double koszt() {
        return pizza.koszt()+7;
    }
}
