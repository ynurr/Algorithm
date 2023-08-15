class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] s = Integer.toString(order).split("");

        for(String i : s) {
            if(i.equals("3") || i.equals("6") || i.equals("9")) {
                answer += 1;   
            }
        }
        
        return answer;
    }
}