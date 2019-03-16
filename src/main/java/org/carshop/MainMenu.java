package org.carshop;

public class MainMenu {

   private Integer choice  = 0;

    public MainMenu() {}


    public Integer getChoice() {
        return choice;
    }


    public  void executeMainMenu(MyGarage garage){

        choice = CarUtil.showMainMenu();

        switch(choice){
            case 1 : garage.addCar();
                break;

            case 2 : garage.removeCar();
                break;

            case 3 : garage.showCars();
                break;

            case 4 : SortMenu.sortByChosen(garage.carList);
                break;

            case 5 :
                System.out.println();
                break;

            case 6 :
                System.out.println();
                break;

            case 0 :
                System.out.println();
                break;

            default:
                    System.out.println("Brak takiej opcji");
        }
    }
}
