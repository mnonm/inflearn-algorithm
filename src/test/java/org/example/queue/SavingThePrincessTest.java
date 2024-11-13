package org.example.queue;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SavingThePrincessTest {
    private SavingThePrincess savingThePrincess = new SavingThePrincess();

    @Test
    void test1() {
        // given, when
        int result = savingThePrincess.solution(8, 3);

        // then
        assertThat(result).isEqualTo(7);
    }
}