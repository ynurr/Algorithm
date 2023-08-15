import java.util.*;

class Solution {
    public ArrayList solution(int n, int[] numlist) {

        ArrayList<Integer> answer = new ArrayList<>();

        for(int num : numlist){
            if(num % n == 0){
                answer.add(num);
            }
        }

        return answer;
    }
}
