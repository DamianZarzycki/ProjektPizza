package Pl.Pizza.PizzaModel.PizzaSize;

import Pl.Pizza.PizzaModel.Pizza;
import Pl.Pizza.PizzaModel.RawPizza;

public class LargePizza extends PizzaSizing {
    Pizza rawPizza;
    public LargePizza(Pizza rawPizza){
        this.rawPizza=rawPizza;
    }

    @Override
    public String pobierzOpis() {
        return rawPizza.pobierzOpis() + ", średnia";
    }

    @Override
    public double koszt() {
        return rawPizza.koszt()+5;
    }
}
