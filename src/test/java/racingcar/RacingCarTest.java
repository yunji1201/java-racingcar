package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {

    @Test
    @DisplayName("자동차가 이동하는 값이 4 이상일 경우 전진하는지 확인")
    void carMovesWhenFourOrMore() {
        Car car = new Car();
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차가 이동하는 값이 4 이하일 경우 멈춰있는지 확인")
    void carStopWhenLessThanFour() {
        Car car = new Car();
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }

}
