package Lv_1;


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


}
