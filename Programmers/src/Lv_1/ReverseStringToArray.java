package Lv_1;

import java.util.Arrays;

public class ReverseStringToArray {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        int[] answer = new int [str.length()];
        sb.reverse();
        for(int i=0; i<str.length();i++) {
        	answer[i]= Character.getNumericValue(sb.charAt(i));
        }
        return answer;
    }
    public static void main(String[] args) {
		ReverseStringToArray rsta = new ReverseStringToArray();
		int []result = rsta.solution(12345);
		System.out.println(Arrays.toString(result));
		
	}

}
