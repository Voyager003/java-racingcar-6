package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Winner {

    private List<String> winners;

    public Winner(List<Car> cars) {
        int maxMovingCount = getMaxMovingCount(cars);
        this.winners = cars.stream()
                .filter(car -> car.getMovingCount() == maxMovingCount)
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    public List<String> getWinners() {
        return this.winners;
    }

    private int getMaxMovingCount(List<Car> cars) {
        return cars.stream()
                .mapToInt(Car::getMovingCount)
                .max()
                .orElse(0);
    }
}
