package Pl.Pizza.PizzaModel.PizzaSize;

import Pl.Pizza.PizzaModel.Pizza;
import Pl.Pizza.PizzaModel.RawPizza;

public class BigPizza extends PizzaSizing {
    Pizza rawPizza;
    public BigPizza(Pizza rawPizza){
        this.rawPizza=rawPizza;
    }

    @Override
    public String pobierzOpis() {
        return rawPizza.pobierzOpis() + ", duża";
    }

    @Override
    public double koszt() {
        return rawPizza.koszt()+10;
    }
}
