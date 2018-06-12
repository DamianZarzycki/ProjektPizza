package Pl.Pizza;

import Pl.Pizza.PizzaFactory.PizzaType;
import Pl.Pizza.PizzaModel.Pizza;
import Pl.Pizza.PizzaModel.PizzaSize.SizeOfPizza;
import Pl.Pizza.PizzaModel.ToppingElements.PizzaTop;
import Pl.Pizza.PizzaModel.ToppingElements.Ser;
import Pl.Pizza.PizzaModel.ToppingElements.Szynka;
import Pl.Pizza.PizzaOrder.Deliver;
import Pl.Pizza.PizzaOrder.MyPizzaBuilder;
import Pl.Pizza.PizzaOrder.PizzaBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        List<Pizza> order = new ArrayList<>();
        int i = 0;


        while (true) {
            PizzaType type = setPizza();
            Deliver deliver = setDeliver();


            PizzaBuilder builder = new MyPizzaBuilder();
            builder
                    .setType(type)
                    .setDelivery(deliver);



            while (true) {
                if (setSizing(builder)) {
                    break;
                }
            }
            while (true){
                if (!setToppings(builder)){
                    break;
                }
            }

            order.add(builder.getPizza());


            if (!addNextPizza()) {



                break;
            }

        }

        for (Pizza p:
                order) {

            i++;
            System.out.println("Twoja #" + i + " pizza to: " + p.pobierzOpis() +", ostrosc: "+ p.ostrosc()+ ", cena: " + p.koszt());

        }

    }

    private static boolean addNextPizza() {
        System.out.println("Czy chcesz zamówić kolejną pizzę? (true/false)");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }

    private static PizzaType setPizza() {
        System.out.println("Wybierz pizzę");
        System.out.println("1 - wegetariańska");
        System.out.println("2 - peperoni");
        System.out.println("3 - capriciosa");

        Scanner scanner = new Scanner(System.in);

        int selection = scanner.nextInt();

        switch(selection) {
            case 1:
                return PizzaType.WEGETARIANSKA;
            case 2:
                return PizzaType.PEPPERONI;
            case 3:
                return PizzaType.CAPRICIOSA;
            default:
                throw new IllegalArgumentException();

        }
    }


    private static boolean setToppings(PizzaBuilder builder) {
        System.out.println("Wybierz dodatek");
        System.out.println("1 - cebula");
        System.out.println("2 - papryka");
        System.out.println("3 - papryka ostra");
        System.out.println("4 - pieczarki");
        System.out.println("5 - pomidor");
        System.out.println("6 - salami");
        System.out.println("7 - ser");
        System.out.println("8 - sos");
        System.out.println("9 - szynka");
        System.out.println("0 - zakończ");


        Scanner scanner = new Scanner(System.in);

        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                builder.setAddTop(PizzaTop.CEBULA);
                break;
            case 2:
                builder.setAddTop(PizzaTop.PAPRYKA);
                break;
            case 3:
                builder.setAddTop(PizzaTop.PAPRYKAHOT);
                break;
            case 4:
                builder.setAddTop(PizzaTop.PIECZARKI);
                break;
            case 5:
                builder.setAddTop(PizzaTop.POMIDOR);
                break;
            case 6:
                builder.setAddTop(PizzaTop.SALAMI);
                break;
            case 7:
                builder.setAddTop(PizzaTop.SER);
                break;
            case 8:
                builder.setAddTop(PizzaTop.SOS);
                break;
            case 9:
                builder.setAddTop(PizzaTop.SZYNKA);
                break;
            case 0:
                break;
            default:
                throw new IllegalArgumentException("Zły numer");
        }

        return selection != 0;
    }

      private static Deliver setDeliver() {
          System.out.println("Wybierz dostawe");
          System.out.println("1 - odbior Gdynia");
          System.out.println("2 - odbior Gdansk");
          System.out.println("3 - odbior Sopot");
          System.out.println("4 - na adres");

          Scanner scanner = new Scanner(System.in);

          int selection = scanner.nextInt();

          switch(selection) {
              case 1:
                  return Deliver.ODBIOR_GDYNIA;
              case 2:
                  return Deliver.ODBIOR_GDANSK;
              case 3:
                  return Deliver.ODBIOR_SOPOT;
              case 4:
                  return Deliver.DOJAZD;

              default:
                  throw new IllegalArgumentException();

          }

     }

    private static boolean setSizing(PizzaBuilder builder) {
        System.out.println("Wybierz wielkosc");
        System.out.println("1 - mala");
        System.out.println("2 - srednia");
        System.out.println("3 - duza");
        System.out.println("0 - zakończ");


        Scanner scanner = new Scanner(System.in);

        int selection = scanner.nextInt();

        switch(selection) {
            case 1:
                builder.setSize(SizeOfPizza.SMALL);
                break;
            case 2:
                builder.setSize(SizeOfPizza.LARGE);
                break;
            case 3:
                builder.setSize(SizeOfPizza.BIG);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return selection != 0;

    }

}