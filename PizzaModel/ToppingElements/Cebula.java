package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.Pizza;

public class Cebula extends PizzaTopping {
    Pizza pizza;
// todo zmienic Raw na Pizza
    public Cebula(Pizza Pizza){
        this.pizza=Pizza;
    }

    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() +  ", cebula";
    }

    @Override
    public double ostrosc() {
        return pizza.ostrosc();
    }

    @Override
    public double koszt() {
        return pizza.koszt() + 3;
    }
}
