package Day06.Test03;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int result = 0;
        for (int i = 0; i < included.length; i++){
            result = a + (i * d);
            if (included[i] == true) {
                answer += result;
            }
        }
        return answer;
    }
}
