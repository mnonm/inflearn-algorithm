package org.example.sort;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class MischievousBoyTest {
    private MischievousBoy mischievousBoy = new MischievousBoy();

    @Test
    void test1() {
        // given
        int[] heights = {120, 125, 152, 130, 135, 135, 143, 127, 160};

        // when
        List<Integer> result = mischievousBoy.solution(heights);

        // then
        assertThat(result).isEqualTo(List.of(3, 8));
    }

}