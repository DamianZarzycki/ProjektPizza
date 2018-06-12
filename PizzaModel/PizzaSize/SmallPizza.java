package Pl.Pizza.PizzaModel.PizzaSize;

import Pl.Pizza.PizzaModel.Pizza;
import Pl.Pizza.PizzaModel.RawPizza;


import Pl.Pizza.PizzaModel.RawPizza;

    public class SmallPizza extends PizzaSizing {
        Pizza rawPizza;
        public SmallPizza(Pizza rawPizza){
            this.rawPizza=rawPizza;
        }

        @Override
        public String pobierzOpis() {
            return rawPizza.pobierzOpis() + ", mała";
        }

        @Override
        public double koszt() {
            return rawPizza.koszt();
        }


}
