package web.service;

import java.util.List;
import web.model.Car;

public interface CarService {
    public List<Car> getCars(int count);
}
