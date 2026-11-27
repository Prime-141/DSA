class Solution {
    public boolean canAliceWin(int n) {
        int turn = 10;
        int steps=0;
        while(n>=turn)
        {
            n -= turn;
            turn = turn-1;
            steps++;
        }
        if(steps%2==0)
        {
            return false;
        }
        return true;


        

    }
}