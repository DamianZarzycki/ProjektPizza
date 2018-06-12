package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.Pizza;

public class PaprykaHot extends PizzaTopping {
    Pizza pizza;

    public PaprykaHot(Pizza pizza){
        this.pizza=pizza;
    }


    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", papryka ostra";
    }

    @Override
    public double koszt() {
        return pizza.koszt()+7;
    }

    @Override
    public double ostrosc() {
        return pizza.ostrosc()+5;
    }

}
