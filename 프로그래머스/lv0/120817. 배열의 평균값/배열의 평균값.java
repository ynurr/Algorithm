class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        
        for(int i : numbers) {
            sum += i;
        }
        
        answer = sum / numbers.length;
        
        return answer;
    }
}