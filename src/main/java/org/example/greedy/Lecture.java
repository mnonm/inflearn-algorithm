package org.example.greedy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Lecture {
	public int solution(List<PayWithDay> payWithDays) {

		Collections.sort(payWithDays);
		int result = 0;
		int maxDay = payWithDays.stream()
			.mapToInt(PayWithDay::getDay)
			.max()
			.orElse(0);

		Map<Integer, List<PayWithDay>> payWithDaysByDay = payWithDays.stream()
			.collect(Collectors.groupingBy(PayWithDay::getDay));

		PriorityQueue<Integer> pQ = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i = maxDay; i > 0; i--) {
			List<PayWithDay> list = payWithDaysByDay.getOrDefault(i, new ArrayList<>());
			for (PayWithDay payWithDay : list) {
				pQ.add(payWithDay.getPay());
			}

			if (pQ.isEmpty()) {
				continue;
			}
			result += pQ.poll();
		}

		return result;
	}


	static class PayWithDay implements Comparable<PayWithDay> {
		private Integer pay;
		private Integer day;

		public PayWithDay(Integer pay, Integer day) {
			this.pay = pay;
			this.day = day;
		}

		@Override
		public int compareTo(PayWithDay o) {
			if (this.pay.equals(o.pay)) {
				return o.day.compareTo(this.day);
			}

			return o.pay.compareTo(this.pay);
		}

		public Integer getPay() {
			return this.pay;
		}

		public Integer getDay() {
			return this.day;
		}

		public static PayWithDay create(Integer pay, Integer day) {
			return new PayWithDay(pay, day);
		}
	}
}
