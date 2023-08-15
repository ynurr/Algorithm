class Solution {
    public int solution(int hp) {
        int x = 0;
        int y = 0;
    
        if(hp >= 5) {
            x += hp / 5;
            y = hp % 5;
            if(y >= 3) {
                x += (y / 3) + (y % 3);
            } else {
                x += y;
            }
        } else if(hp >= 3) {
            x += (hp / 3) + (hp % 3);
        } else {
            x += hp;
        }
        
        return x;
    }
}