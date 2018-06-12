package Pl.Pizza.PizzaOrder;

import Pl.Pizza.PizzaFactory.PizzaFactory;
import Pl.Pizza.PizzaFactory.PizzaType;
import Pl.Pizza.PizzaFactory.StandardPizzaFactory;
import Pl.Pizza.PizzaModel.Pizza;
import Pl.Pizza.PizzaModel.PizzaSize.BigPizza;
import Pl.Pizza.PizzaModel.PizzaSize.LargePizza;
import Pl.Pizza.PizzaModel.PizzaSize.SizeOfPizza;
import Pl.Pizza.PizzaModel.PizzaSize.SmallPizza;
import Pl.Pizza.PizzaModel.ToppingElements.*;



public abstract class PizzaBuilder {
  protected   Pizza pizza;
  protected   PizzaFactory pizzaFactory = new StandardPizzaFactory();



    public Pizza getPizza() {
        return this.pizza;
    }
    public  PizzaBuilder setType(PizzaType type){
        this.pizza=pizzaFactory.create(type);
        return this;
    }
    public PizzaBuilder setSize(SizeOfPizza size){

        switch (size) {
            case SMALL:
                this.pizza = new SmallPizza(this.pizza);
                return this;
            case LARGE:
                this.pizza = new LargePizza(this.pizza);
                return this;
            case BIG:
                this.pizza = new BigPizza(this.pizza);
                return this;
            default:
                throw new IllegalArgumentException("Nie ma takiego rozmiaru!");
        }

    }

    public  PizzaBuilder setAddTop(PizzaTop pizzaTop)
    {
        return this;
    }


    public PizzaBuilder setDelivery(Deliver deliver)
    {
        return this;
    }



}
