package pl.mpas.git_examples.car.service;

import pl.mpas.git_examples.car.model.Car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarFilter {

    static public List<Car> findCarsOfColor(List<Car> cars, String color) {
        List<Car> x = new ArrayList<Car>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getColor().equals(color)) {
                x.add(cars.get(i));
            }
        }
        return x;
    }

    static public List<Car> findCarsOfColorJava8(List<Car> cars, String color) {

        return cars.stream()
                .filter(car -> car.getColor().equals(color))
                .collect(Collectors.toList());

        // return Collections.emptyList();

    }

    static public List<Car> getCarsWithGivenEngineAndCostsLessThan(List<Car> cars, BigDecimal maxPrice, int minimalEngine) {
        return cars.stream()
                .filter(car -> car.getEngine() >= minimalEngine)
                .filter(car -> car.getPrice().compareTo(maxPrice) == -1)
                .collect(Collectors.toList());
    }

    static public List<Car> filterCars(List<Car> cars, Predicate<Car> MyFilter){
        return cars.stream()
                .filter(MyFilter)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterCars(CarProvider.getMyCars(),car -> car.getBrand().equals("Audi") && car.getModel().equals("a4"))
                .forEach(car -> System.out.println(car));

    }
}
