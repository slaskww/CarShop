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
                if (choice.equals(CarUtil.NO_ELEMENTS_TO_SORT)) {
                    break;
                }
                List<Car> sortedList = new ArrayList<>(SortMenu.sortByOneElementAndReturn(garage.carList, choice));
                CarUtil.showList(sortedList);
                break;

            case "5":
                List<Car> filteredList = garage.carList;
                boolean isRequired;
                do {
                    choice = CarUtil.showFilterMenuAndReturnChoice(filteredList);
                    if (choice.equals(CarUtil.NO_ELEMENTS_TO_FILTER)) {
                        break;
                    }
                    filteredList = FilterMenu.filterByChosen(filteredList, choice);
                    CarUtil.showList(filteredList);

                    if(filteredList.size() == CarUtil.ONE_ELEMENT){
                        break;
                    }
                    isRequired = CarUtil.isAnotherFilteringRequired();
                } while(isRequired);
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
                CarSaveLoadData.writeCurrentStateToFile(garage.carList, CarProfit.getAccountHistory(), CarProfit.getBalance());
                System.out.println("Zapisano stan programu.");

                break;

            default:
                CarUtil.defaultMessage();
        }
    }

    void loadFromFile(MyGarage garage){

        if(CarUtil.isloadingFromFileChosen()){
            System.out.println("Laduje dane...");
            garage.addCarList(CarSaveLoadData.readCarListFromFile());
            CarProfit.loadAccountHistory(CarSaveLoadData.loadHistoryStateAfterStart());
            CarProfit.loadBalance(CarSaveLoadData.loadBalanceStateAfterStart());
        }
    }
}
