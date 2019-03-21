package org.carshop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class MyGarage {

   List<Car> carList = new ArrayList<>();

   MyGarage() {
//        carList.add(new Car("zielony", "BMW", new BigDecimal(35000), 5, 2008, 100000));
//        carList.add(new Car("zielony", "Mazda", new BigDecimal(70000), 5, 2018, 200000));
//        carList.add(new Car("bialy", "Nissan", new BigDecimal(12000), 3, 2000, 50000));
//        carList.add(new Car("czarny", "BMW", new BigDecimal(15000), 3, 1999, 300000));
//        carList.add(new Car("czarny", "Citroen", new BigDecimal(7000), 5, 2017, 105000));
//        carList.add(new Car("czerwony", "Dacia", new BigDecimal(50000), 5, 2007, 230000));
    }

    void addCar(Car car){
        carList.add(car);
        BigDecimal costReducingBalance = car.getPrice().negate();
        CarProfit.editBalance((costReducingBalance));
    }


    void removeCar(Car car){
        carList.remove(car);
        CarProfit.editBalance(car.getPrice().multiply((CarProfit.ROI)));
    }

    void addCarList(List<Car> list){
        carList.addAll(list);
    }

    public List<Car> getCarList() {
        return carList;
    }
}
