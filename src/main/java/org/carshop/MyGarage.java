package org.carshop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MyGarage {

   public List<Car> carList = new ArrayList<Car>();

    public MyGarage() {
        carList.add(new Car("zielony", "BMW", new BigDecimal(35000), 5, 2008, 100000));
        carList.add(new Car("zielony", "Mazda", new BigDecimal(70000), 5, 2018, 200000));
        carList.add(new Car("bialy", "Nissan", new BigDecimal(12000), 3, 2000, 50000));
        carList.add(new Car("czarny", "BMW", new BigDecimal(15000), 3, 1999, 300000));
        carList.add(new Car("czarny", "Citroen", new BigDecimal(7000), 5, 2017, 105000));
        carList.add(new Car("czerwony", "Dacia", new BigDecimal(50000), 5, 2007, 230000));
    }

    public void addCar(){
        carList.add(CarUtil.newCar());
    }



    public void removeCar(){
        carList.remove(CarUtil.removeCarMenu(carList));
    }

    public void showCars() {CarUtil.showList(carList);}


}
