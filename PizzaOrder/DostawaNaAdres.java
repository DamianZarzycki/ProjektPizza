package Pl.Pizza.PizzaOrder;

import Pl.Pizza.PizzaModel.Pizza;

public class DostawaNaAdres extends Order{
    Pizza pizza;

    public DostawaNaAdres(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", dostawa na adres klienta";
    }

    @Override
    public double koszt() {
        return pizza.koszt()+5;
    }
}
