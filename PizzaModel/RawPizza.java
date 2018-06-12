package Pl.Pizza.PizzaModel;


public  class RawPizza implements Pizza {
    String opis = "";
    String name = "";



    double spice=0;

    public void setSpice(double spice) {
        this.spice=spice;
    }
    public double getSpice() {
        return spice;
    }

    public void setName(String name){
        this.name=name;
    }


    public  String pobierzOpis(){
    return name + opis;
    }


    @Override
    public double koszt() {
        return 0;
    }

    @Override
    public double ostrosc() {
        return 0;
    }


}
