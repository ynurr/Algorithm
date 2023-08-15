class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String n = num+"";
        String x = k+"";
        if(n.contains(x)) {
            answer = n.indexOf(x)+1;
        } else {
            answer = -1;
        }
        return answer;
    }
}