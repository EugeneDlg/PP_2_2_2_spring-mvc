package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Nissan", 123, "black"));
        cars.add(new Car("Mitsubishi", 234, "white"));
        cars.add(new Car("Alpha Romeo", 456, "green"));
        cars.add(new Car("Lamborghini", 678, "red"));
        cars.add(new Car("Rolls Royce", 789, "yellow"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(Math.abs(count), 5));
    }
}
