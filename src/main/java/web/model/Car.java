package web.model;

import java.util.Objects;

public class Car {
    private final String model;

    private final Integer series;

    private final String color;

    public Car(String model, Integer series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Integer getSeries() {
        return series;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model)
                && Objects.equals(series, car.series)
                && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, color);
    }

    @Override
    public String toString() {
        return "Car: model: " + model + ", series: " + series + ", color: " + color;
    }
}
