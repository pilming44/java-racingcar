package racingGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingGame.domain.Car;
import racingGame.racingRule.FowardRule;
import racingGame.racingRule.NotMoveRule;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    private FowardRule fowardRule = new FowardRule();

    @Test
    @DisplayName("입력 받은 이름을 반환한다.")
    void getName(){
        Car car = new Car("test");

        assertThat(car.getCarName()).isEqualTo("test");
    }

    @Test
    @DisplayName("움직이는 성공했을시 createTrace를 성공한 만큼 -를 반환")
    void createTrace() {
        Car car = new Car("Move");

        car.move(fowardRule);
        car.move(fowardRule);
        assertThat(car.createTrace("-")).isEqualTo("--");
    }

    @Test
    @DisplayName("움직이는 실패할 시 공백을 반환.")
    void not_move() {
        Car car = new Car("notMove");

        car.move(new NotMoveRule());
        assertThat(car.createTrace("-")).isEqualTo("");
    }
}