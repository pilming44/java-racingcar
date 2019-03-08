package calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//point: import static
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    //point: before > 각 test 실행 전 모두 실행
    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");
    }

    //point: 테스트의 실행순서는 랜덤 >> 테스트간 의존관계 가지면안됨
    @Test
    public void 덧셈() {
        System.out.println("add");
        int result = Calculator.add(1, 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void 뺄셈() {
        System.out.println("subtract");
        int result = Calculator.subtract(2, 1);
        assertThat(result).isEqualTo(1);
    }

    //point: after > 각 test 실행 후 모두 실행
    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }
}
