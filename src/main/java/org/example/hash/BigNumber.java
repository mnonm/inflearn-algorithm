package org.example.hash;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BigNumber {

	/**
	 * @param size - array.length
	 * @param nThBigNumber - N 번째 큰 수
	 * @param array
	 * @return
	 */
	public int solution(int size, int nThBigNumber, int[] array) {
		Set<Integer> sets = new HashSet<>();

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				for (int k = j + 1; k < size; k++) {
					sets.add(array[i] + array[j] + array[k]);
				}
			}
		}

		List<Integer> sortedList = sets.stream()
			.sorted(Comparator.reverseOrder())
			.collect(toList());

		try {
			return sortedList.get(nThBigNumber - 1);
		} catch (IndexOutOfBoundsException e) {
			return -1;
		}
	}
}
