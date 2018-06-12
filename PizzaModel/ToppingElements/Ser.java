package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.Pizza;

public class Ser extends PizzaTopping{
    Pizza pizza;

    public Ser(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", ser";
    }

    @Override
    public double ostrosc() {
        return pizza.ostrosc();
    }

    @Override
    public double koszt() {
        return pizza.koszt()+6;

    }
}
