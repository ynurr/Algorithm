class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]","");
        String arr[] = my_string.split("");
        
        for(String i : arr) {
            answer += Integer.parseInt(i);
        }
        
        return answer;
    }
}