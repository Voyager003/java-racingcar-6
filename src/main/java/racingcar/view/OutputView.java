package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

public class OutputView {

    public static void printConsole() {
        System.out.println("실행 결과");
    }

    public static void printGameResult(List<Car> carNames) {
        for (Car car : carNames) {
            String movingDistance = "-".repeat(car.getMovingCount());
            System.out.println(car.getName() + " : " + movingDistance);
        }
        System.out.println();
    }

    public static void printGameWinner(List<String> gameWinner) {
        String winnerNames = String.join(", ", gameWinner);
        System.out.println("최종 우승자 : " + winnerNames);
    }
}
