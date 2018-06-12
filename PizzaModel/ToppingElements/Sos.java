package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.Pizza;

public class Sos extends PizzaTopping {
    Pizza pizza;

    public Sos(Pizza pizza){
        this.pizza=pizza;
    }


    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", sos pomidorowy";
    }

    @Override
    public double ostrosc() {
        return pizza.ostrosc()+1;
    }

    @Override
    public double koszt() {
        return pizza.koszt()+7;
    }
}
