package Lv_1;

public class Sqrt {
	public long solution(long n) {
		long answer = 0;
		double x = Math.sqrt(n);

		return answer = (long) (x * x == n && x % 1 == 0.0 ? (x + 1) * (x + 1) : -1);
	}

}
