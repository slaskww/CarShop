package org.carshop;

import java.io.*;
import java.math.BigDecimal;
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
            case "1": //add a new car
                Car carToAdd = CarUtil.newCar();
                if (carToAdd == null) {
                    break;
                }
                garage.addCar(carToAdd);
                CarUtil.messageAfterAddingNewCar();
                break;

            case "2": //remove a car
                Car carToRemove = CarUtil.removeCarMenu(garage.getCarList());
                if (carToRemove != null) {
                    garage.removeCar(carToRemove);
                }
                break;

            case "3": //show list
                CarUtil.showList(garage.getCarList());
                break;

            case "4": //sort list
                choice = CarUtil.showSortMenuAndReturnChoiceNumber(garage.getCarList());
                if (choice.equals(CarUtil.NO_ELEMENTS_TO_SORT)) {
                    break;
                }
                List<Car> sortedList = new ArrayList<>(SortMenu.sortByOneElementAndReturn(garage.getCarList(), choice));
                CarUtil.showList(sortedList);
                break;

            case "5": //filter list
                List<Car> filteredList = garage.getCarList();
                boolean isRequired;
                do {
                    choice = CarUtil.showFilterMenuAndReturnChoice(filteredList);
                    if (choice.equals(CarUtil.NO_ELEMENTS_TO_FILTER)) {
                        break;
                    }
                    filteredList = FilterMenu.filterByChosen(filteredList, choice);
                    CarUtil.showList(filteredList);

                    if (filteredList.size() == CarUtil.ONE_ELEMENT) {
                        break;
                    }
                    isRequired = CarUtil.isAnotherFilteringRequired();
                } while (isRequired);
                break;

            case "6": //sort and filter list
                choice = CarUtil.showSortMenuAndReturnChoiceNumber(garage.getCarList());
                if (choice.equals(CarUtil.NO_ELEMENTS_TO_SORT)) {
                    break;
                }
                List<Car> sortedAndFilteredList = new ArrayList<>(SortMenu.sortByOneElementAndReturn(garage.getCarList(), choice));
                CarUtil.showList(sortedAndFilteredList);

                choice = CarUtil.showFilterMenuAndReturnChoice(sortedAndFilteredList);
                sortedAndFilteredList = FilterMenu.filterByChosen(sortedAndFilteredList, choice);
                CarUtil.showList(sortedAndFilteredList);
                break;

            case "7": //check balance
                CarUtil.showBalance(CarProfit.getBalance());
                CarUtil.showAccountHistory(CarProfit.getAccountHistory());
                break;

            case "8": //change language version
                CarUtil.changeLanguage();
                break;

            case "9": //close program
                CarUtil.writeCurrentStateToFile(garage.getCarList(), CarProfit.getAccountHistory(), CarProfit.getBalance());
                CarUtil.messageAfterSaving();

                break;

            default:
                CarUtil.defaultMessage();
        }
    }


}

