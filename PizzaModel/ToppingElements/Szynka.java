package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.Pizza;

public class Szynka extends PizzaTopping {
    Pizza pizza;

    public Szynka(Pizza pizza){

        this.pizza=pizza;
    }

    @Override
    public String pobierzOpis() {

        return pizza.pobierzOpis() + ", szynka";
    }

    @Override
    public double ostrosc() {
        return pizza.ostrosc();
    }

    @Override
    public double koszt() {
        return pizza.koszt()+8;

    }
}
