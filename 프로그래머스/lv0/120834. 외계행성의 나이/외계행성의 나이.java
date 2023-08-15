class Solution {
    public String solution(int age) {
        String answer = "";
        String num = age+"";
        
        for(int i = 0; i < num.length(); i++) {
            answer += (char)(num.charAt(i)+49);
        }
        
        return answer;
    }
}