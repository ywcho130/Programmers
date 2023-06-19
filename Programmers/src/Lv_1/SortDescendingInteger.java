package Lv_1;

import java.util.Arrays;
import java.util.Collections;

public class SortDescendingInteger {
	public long solution(long n) {
		long answer = 0;

		String[] str = Long.toString(n).split("");
		Arrays.sort(str, Collections.reverseOrder());
		for (int i = 0; i < str.length; i++) {
			long num = Long.parseLong(str[i]);
			// 현재까지 더해진 값에 10을 곱한 후 num 추가 반복
		    answer = answer * 10 + num;
		}
		
		
		return answer;

	}
	public static void main(String[] args) {
		SortDescendingInteger sdi = new SortDescendingInteger();
		System.out.println(sdi.solution(12345));
	}

}
