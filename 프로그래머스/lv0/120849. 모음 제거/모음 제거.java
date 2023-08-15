class Solution {
    public String solution(String my_string) {
        String answer = "";
        String arr[] = {"a","e","i","o","u"};
        
        for(String i : arr) {
            my_string = my_string.replace(i,"");
        }
        
        return my_string;
    }
}