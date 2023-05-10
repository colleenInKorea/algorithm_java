package Day05.Test02;

class Solution {
    public int solution(int a, int b) {
        int answer2 = 2 * a * b;
        int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        if(answer >= answer2){
            return answer;
        }else{
            return answer2;
        }
    }
}
