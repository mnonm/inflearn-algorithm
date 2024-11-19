package org.example.greedy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class IsFriendTest {

    @Test
    void test1() {
        // given
        IsFriend.unf = IntStream.rangeClosed(0, 9).toArray();

        IsFriend.union(1, 2);
        IsFriend.union(2, 3);
        IsFriend.union(3, 4);
        IsFriend.union(1, 5);
        IsFriend.union(6, 7);
        IsFriend.union(7, 8);
        IsFriend.union(8, 9);

        int targetA = 3;
        int targetB = 8;

        // when
        boolean result = IsFriend.find(targetA) == IsFriend.find(targetB);

        // then
        assertThat(result).isFalse();
    }

    @Test
    void test2() {
        // given
        IsFriend.unf = IntStream.rangeClosed(0, 20).toArray();

        IsFriend.union(18, 9);
        IsFriend.union(4, 15);
        IsFriend.union(12, 16);
        IsFriend.union(9, 10);
        IsFriend.union(10, 7);
        IsFriend.union(14, 9);
        IsFriend.union(13, 3);
        IsFriend.union(17, 5);
        IsFriend.union(6, 1);
        IsFriend.union(1, 14);
        IsFriend.union(12, 4);
        IsFriend.union(9, 11);
        IsFriend.union(7, 5);
        IsFriend.union(17, 4);
        IsFriend.union(6, 17);
        IsFriend.union(12, 9);
        IsFriend.union(18, 10);
        IsFriend.union(17, 8);
        IsFriend.union(11, 18);
        IsFriend.union(7, 19);
        IsFriend.union(4, 3);
        IsFriend.union(3, 4);

        int targetA = 10;
        int targetB = 15;

        // when
        boolean result = IsFriend.find(targetA) == IsFriend.find(targetB);

        // then
        assertThat(result).isTrue();
    }
}