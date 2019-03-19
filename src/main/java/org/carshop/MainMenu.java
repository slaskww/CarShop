package org.carshop;

import java.util.ArrayList;
import java.util.List;

class MainMenu {

   private Integer choice  = 0;

   MainMenu() {}

    Integer getChoice() {
        return choice;
    }

    void executeMainMenu(MyGarage garage){

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
                int choice = CarUtil.showSortMenuAndReturnChoiceNumber();
                List<Car> sortedList= new ArrayList<>(SortMenu.sortByOneElementAndReturn(garage.carList, choice));
                CarUtil.showList(sortedList);
                break;

            case 5 :
                choice = CarUtil.showFilterMenuAndReturnChoice();
                List<Car> filteredList = FilterMenu.filterByChosen(garage.carList, choice);
                CarUtil.showList(filteredList);
                break;

            case 6 :
                System.out.println("Empty");
                break;

            case 7 :
                System.out.println(CarProfit.getBalance());
                CarUtil.showAccountHistory(CarProfit.getAccountHistory());
                break;

            case 8 :
                CarUtil.changeLanguage();
                break;

            case 9 :
                System.out.println();
                break;

            default:
                CarUtil.defaultMessage();
        }
    }
}
