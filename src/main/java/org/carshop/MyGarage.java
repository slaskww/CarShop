package org.carshop;

import java.util.ArrayList;
import java.util.List;

public class MyGarage {

   public List<Car> carList = new ArrayList<Car>();

    public MyGarage() {}

    public void addCar(){
        carList.add(MenuUtil.newCar());
    }

    public void removeCar(Car car){
        carList.remove(car);
    }



}
