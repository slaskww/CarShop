package org.carshop;

import java.util.ArrayList;
import java.util.List;

public class MyGarage {

   public List<Car> carList = new ArrayList<Car>();

    public MyGarage() {}

    public void addCar(){
        carList.add(CarUtil.newCar());
    }

    public void removeCar(){
        carList.remove(CarUtil.removeCarMenu(carList));
    }

    public void showCars() {CarUtil.showList(carList);}


}
