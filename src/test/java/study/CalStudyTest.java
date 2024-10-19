package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// 프로덕트 코드 짤 때 확인하는 용도
public class CalStudyTest {

    @Test
    @DisplayName("그냥 문자열을 콤마로 나누었을때 어떻게 나오는지 확인하기")
    void split() {
        String[] result = "1".split(",");
        assertThat(result).hasSize(1);

        assertThat(result).contains("1");
    }

}
