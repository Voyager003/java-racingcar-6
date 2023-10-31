package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Car {
    String name;
    int movingCount;

    public Car(String carName, int count) {
        this.name = carName;
        this.movingCount = count;
    }

    public String getName() {
        return name;
    }

    public int getMovingCount() {
        return movingCount;
    }

    public void increaseMovingCount() {
        this.movingCount++;
    }

    public static List<String> getRacingGameWinner(List<Car> carNames) {
        int maxMovingCount = carNames.stream()
                .mapToInt(Car::getMovingCount)
                .max()
                .orElse(0);

        return carNames.stream()
                .filter(car -> car.getMovingCount() == maxMovingCount)
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
