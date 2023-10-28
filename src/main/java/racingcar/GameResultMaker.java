package racingcar;

import java.util.List;

public class GameResultMaker {

    public void makeGameResult(List<Car> carNames) {
        for (Car car : carNames) {
            if (RacingGameExecutor.isCarMoved()) {
                car.increaseMovingCount();
            }
        }
    }
}
