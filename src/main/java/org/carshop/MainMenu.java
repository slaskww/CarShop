package org.carshop;

public class MainMenu {

   private Integer choice  = 0;

    public MainMenu() {

    }


    public Integer getChoice() {
        return choice;
    }


    public  void executeMainMenu(MyGarage garage){

        choice = CarUtil.showMainMenu();

        switch(choice){
            case 1 :
                Car carToAdd = CarUtil.newCar();
                garage.addCar(carToAdd);
                break;

            case 2 :
                Car carToRemove = CarUtil.removeCarMenu(garage.carList);
                garage.removeCar(carToRemove);
                break;

            case 3 :
                CarUtil.showList(garage.carList);
                break;

            case 4 :
                SortMenu.sortByChosen(garage.carList);
                break;

            case 5 :
                FilterMenu.filterByChosen(garage.carList);
                break;

            case 6 :
                System.out.println("Empty");
                break;

            case 7 :
                System.out.println(CarProfit.getBalance());
                CarProfit.getAccountHistory();
              // System.out.println(CarUtil.getDate());
                break;

            case 9 :
                System.out.println();
                break;

            default:
                    System.out.println("Brak takiej opcji");
        }
    }
}
