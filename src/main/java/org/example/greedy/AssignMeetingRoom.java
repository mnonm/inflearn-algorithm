package org.example.greedy;

import java.util.Arrays;

public class AssignMeetingRoom {

	public int solution(Time[] input) {
		Arrays.sort(input);

		int max = 0;
		for (int i = 0; i < input.length - 1; i++) {
			int result = 1;
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].getEnd() <= input[j].getStart()) {
					result++;
					i = j;
				}
			}
			max = Math.max(max, result);
		}
		return max;
	}

	/**
	 * 이중 반복문을 생각했으나 끝나는 시간 기준으로 정렬하면 한 번 순회만 해도 정답을 구할 수 있었다.
	 */
	public int solution2(Time[] input) {
		Arrays.sort(input);

		int cnt = 0;
		int endTime = 0;
		for (Time time : input) {
			if (endTime <= time.getStart()) {
				cnt++;
				endTime = time.getEnd();
			}
		}

		return cnt;
	}

	static class Time implements Comparable<Time> {
		private Integer start;
		private Integer end;

		@Override
		public int compareTo(Time o) {
			if (this.end.equals(o.end)) {
				return this.start.compareTo(o.start);
			}

			return this.end.compareTo(o.end);
		}

		public Integer getStart() {
			return start;
		}

		public Integer getEnd() {
			return end;
		}

		public Time(Integer start, Integer end) {
			this.start = start;
			this.end = end;
		}
	}
}
