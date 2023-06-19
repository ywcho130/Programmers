package Lv_1;

class Collatz {
	public int solution(int num) {
		int answer = 0;

		while (num != 1) {
			if (answer > 500) {
				return -1;
			}
			if (num % 2 == 0) {
				num /= 2;
				answer++;
			} else if (num % 2 != 0) {
				num = num * 3 + 1;
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Collatz co = new Collatz();
		System.out.println(co.solution(626331));
	}
}
