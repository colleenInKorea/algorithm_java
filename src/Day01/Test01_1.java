package Day01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Test01_1 {
    public int findRunner(String[] players, String callName) {
        int idx = 0;

        for (int i = 0; i < players.length; i++) {
            if (callName.equals(players[i])) {
                idx = i;
            }
        }

        return idx;
    }

    public void swapRunner(String[] players, int idx) {
        String temp = players[idx - 1];
        players[idx - 1] = players[idx];
        players[idx] = temp;
    }

    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        System.arraycopy(players, 0, answer, 0, players.length);

        // calling의 배열 길이만큼 순회
        for (int i = 0; i < callings.length; i++) {
            int idx = findRunner(answer, callings[i]);
            swapRunner(answer, idx);
        }

        return answer;
    }
}
