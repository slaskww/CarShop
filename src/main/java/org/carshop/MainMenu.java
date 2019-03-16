package org.carshop;

import java.util.Scanner;

public class MainMenu {

   private Integer choice  = 0;
   private Car soldCar = null;

    public MainMenu() {}


    public Integer getChoice() {
        return choice;
    }

    public void showMainMenu(){
        Scanner input = new Scanner(System.in);

        System.out.println("1 - dodaj nowy smochód");
        System.out.println("2 - usuń samochód");
        System.out.println("3 - wyświetl listę samochodów");
        System.out.println("4 - zakończ");
        this.choice =  input.nextInt();
    }


    public  void executeMainMenu(MyGarage garage){

        switch(choice){

            case 1 : garage.addCar();
                break;

            case 2 : garage.removeCar(soldCar);
                break;

            case 3 : MenuUtil.showCars(garage.carList);

            default:
                    System.out.println("Brak takiej opcji");
        }
    }
}
