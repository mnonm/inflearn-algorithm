package org.example.greedy;

import java.util.Arrays;

public class Wedding {
	public int solution(TimeState[] timeStates) {
		Arrays.sort(timeStates);

		int maxCnt = 0;
		int cnt = 0;
		for (int i = 0; i < timeStates.length; i++) {
			if (timeStates[i].isStart()) {
				cnt++;
			} else {
				cnt--;
			}

			maxCnt = Math.max(maxCnt, cnt);
		}

		return maxCnt;
	}

	static class TimeState implements Comparable<TimeState> {
		private Integer time;
		private String state;

		private TimeState(Integer time, String state) {
			this.time = time;
			this.state = state;
		}

		public static TimeState createStart(Integer time) {
			return new TimeState(time, "s");
		}

		public static TimeState createEnd(Integer time) {
			return new TimeState(time, "e");
		}

		@Override
		public int compareTo(TimeState o) {
			if (this.time.equals(o.time)) {
				return this.state.compareTo(o.state);
			}
			return this.time.compareTo(o.time);
		}

		public boolean isStart() {
			return state.equals("s");
		}
	}
}
