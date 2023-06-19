package Lv_1;

public class HarshadNumber {
	public boolean solution(int x) {
		boolean answer = true;
		String str = String.valueOf(x);
		String[] arr = new String[str.length()];
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			arr[i] = String.valueOf(str.charAt(i) - '0');
			sum += Integer.parseInt(arr[i]);
		}
		if (x % sum == 0)
			answer = true;
		else
			answer = false;
		return answer;
	}

}
