package Day08.Test01;

import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        int idxLast = num_list.length;
        int[] answer = new int[idxLast + 1];
        System.arraycopy(num_list, 0, answer, 0, idxLast);

        answer[idxLast] = answer[idxLast - 1] > answer[idxLast - 2]
                ? answer[idxLast - 1] - answer[idxLast - 2]
                : answer[idxLast - 1] * 2;
        return answer;
    }
}
