package org.example.stack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveCharacterInBracketTest {
	private RemoveCharacterInBracket rcib = new RemoveCharacterInBracket();

	@Test
	void test1() {
		// given, when
		String result = rcib.solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)");

		// then
		assertThat(result).isEqualTo("EFLM");
	}

}
