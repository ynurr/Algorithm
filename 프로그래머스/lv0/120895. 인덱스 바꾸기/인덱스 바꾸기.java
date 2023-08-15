class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] arr = my_string.split("");
        String temp = "";
        temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        for(String i : arr) {
            answer += i;
        }
        return answer;
    }
}