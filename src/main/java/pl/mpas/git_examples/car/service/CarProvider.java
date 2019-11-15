package pl.mpas.git_examples.car.service;

import pl.mpas.git_examples.car.model.Car;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CarProvider {
    public static List<Car> getMyCars() {
        return Arrays.asList(
                new Car("Audi", "a4", "red", new BigDecimal("10000"), 1),
                new Car("Audi", "a5", "blue", new BigDecimal("20000"), 2),
                new Car("Toyota", "yaris", "black", new BigDecimal("30000"), 3),
                new Car("mazda", "6", "yellow", new BigDecimal("40000"), 4),
                new Car("BMW", "e46", "white", new BigDecimal("50000"), 5)
        );
    }
}
