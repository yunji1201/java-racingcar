package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {

    private final Cars cars;
    private final MovingStrategy movingStrategy;

    public Racing(Cars cars, MovingStrategy movingStrategy) {
        this.cars = cars;
        this.movingStrategy = movingStrategy;
    }

    public List<RacingResult> play() {
        List<RacingResult> racingResults = new ArrayList<>();

        for (Car car : cars.getCars()) {
            car.move(movingStrategy);
            RacingResult racingResult = new RacingResult(car.getName(), car.getCurrentPosition());
            racingResults.add(racingResult);
        }
        return racingResults;
    }

}
