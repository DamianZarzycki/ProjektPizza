package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.Pizza;

public class Pieczarki extends PizzaTopping {
    Pizza pizza;

    public Pieczarki(Pizza pizza){
        this.pizza=pizza;
    }


    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", pieczarki";
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
