package org.carshop;

import java.util.ArrayList;
import java.util.List;

class MainMenu {


    private String choice;


    MainMenu() {
        choice = CarUtil.CHOICE_OUT_OF_RANGE;
    }

    String getChoice() {
        return choice;
    }

    void executeMainMenu(MyGarage garage) {

        choice = CarUtil.showMainMenu();

        switch (choice) {
            case "1":
                Car carToAdd = CarUtil.newCar();
                if (carToAdd == null) {
                    break;
                }
                garage.addCar(carToAdd);
                break;

            case "2":
                Car carToRemove = CarUtil.removeCarMenu(garage.carList);
                if (carToRemove != null) {
                    garage.removeCar(carToRemove);
                }
                break;

            case "3":
                CarUtil.showList(garage.carList);
                break;

            case "4":
                choice = CarUtil.showSortMenuAndReturnChoiceNumber(garage.carList);
                if (choice.equals(CarUtil.NO_ELEMENTS_TO_CHOOSE)) {
                    break;
                }
                List<Car> sortedList = new ArrayList<>(SortMenu.sortByOneElementAndReturn(garage.carList, choice));
                CarUtil.showList(sortedList);
                break;

            case "5":
                choice = CarUtil.showFilterMenuAndReturnChoice(garage.carList);
                if (choice.equals(CarUtil.NO_ELEMENTS_TO_CHOOSE)) {
                    break;
                }
                List<Car> filteredList = FilterMenu.filterByChosen(garage.carList, choice);
                CarUtil.showList(filteredList);
                break;

            case "6":
                System.out.println("Empty");
                break;

            case "7":
                CarUtil.showBalance(CarProfit.getBalance());
                CarUtil.showAccountHistory(CarProfit.getAccountHistory());
                break;

            case "8":
                CarUtil.changeLanguage();
                break;

            case "9":
                System.out.println("Zapisano stan programu.");
                break;

            default:
                CarUtil.defaultMessage();
        }
    }
}
