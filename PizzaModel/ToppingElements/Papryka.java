package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.Pizza;

public class Papryka extends PizzaTopping{
    Pizza pizza;

    public Papryka(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", papryka";
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
