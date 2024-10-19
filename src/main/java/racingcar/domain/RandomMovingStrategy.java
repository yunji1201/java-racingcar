package racingcar.domain;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy {

    private static final int MOVE_CONDITION = 4;
    public static final int MAX_BOUND = 10;

    private final Random random;

    public RandomMovingStrategy(Random random) {
        this.random = random;
    }

    @Override
    public boolean movable() {
        return random.nextInt(MAX_BOUND) >= MOVE_CONDITION;
    }
}
