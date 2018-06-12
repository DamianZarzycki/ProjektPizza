package Pl.Pizza.PizzaOrder;

import Pl.Pizza.PizzaModel.ToppingElements.*;


public class MyPizzaBuilder extends  PizzaBuilder {


    @Override
    public PizzaBuilder setAddTop(PizzaTop pizzaTop) {


        switch (pizzaTop) {

            case CEBULA:
                this.pizza = new Cebula(this.pizza);
                return this;
            case PAPRYKA:
                this.pizza = new Papryka(this.pizza);
                return this;
            case PAPRYKAHOT:
                this.pizza = new PaprykaHot(this.pizza);
                return this;
            case SER:
                this.pizza = new Ser(this.pizza);
                return this;
            case SALAMI:
                this.pizza = new Salami(this.pizza);
                return this;
            case POMIDOR:
                this.pizza = new Pomidor(this.pizza);
                return this;
            case SOS:
                this.pizza = new Sos(this.pizza);
                return this;
            case PIECZARKI:
                this.pizza = new Pieczarki(this.pizza);
                return this;
            case SZYNKA:
                this.pizza = new Szynka(this.pizza);
                return this;
            default:
                throw new IllegalArgumentException("Nie ma takiego dodatku!");

        }

    }

    @Override
    public PizzaBuilder setDelivery(Deliver deliver) {
        switch (deliver) {
            case ODBIOR_GDYNIA:
                this.pizza = new OdbiorGdynia(this.pizza);
                return this;
            case ODBIOR_GDANSK:
                this.pizza = new OdbiorGdansk(this.pizza);
                return this;
            case ODBIOR_SOPOT:
                this.pizza = new OdbiorSopot(this.pizza);
                return this;
            case DOJAZD:
                this.pizza = new DostawaNaAdres(this.pizza);
                return this;
            default:throw new IllegalArgumentException("Trzeba wybrać sposób dostawy!");
        }

    }


}