package Lv_1;

public class CharCount {
	boolean solution(String s) {
		boolean answer = true;
		String a = s.toLowerCase();
		int countP = 0;
		int countY = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'p') {
				countP++;
			} else if (a.charAt(i) == 'y') {
				countY++;
			}

		}
		if (countY == countP) {
			answer = true;
		}
		return answer;

	}

}
