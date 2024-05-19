package org.example.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VisibleStudentTest {
	private VisibleStudent visibleStudent = new VisibleStudent();

	@Test
	void test1() {
		// given, when
		int result = visibleStudent.solution(8, new int[] {130, 135, 148, 140, 145, 150, 150, 153});

		// then
		assertThat(result).isEqualTo(5);
	}
}
