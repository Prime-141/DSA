import java.util.*;
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
      /*  HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] match : matches)
        {
            map.put(match[0],0);
            map.put(match[1],0);
        }
        for(int[] match : matches)
        {
            int loser = match[1];
            map.put(loser,map.get(loser)+1);
        }
        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for(Integer player : map.keySet())
        {
            int losses = map.get(player);
            if(losses ==0)
            {
                zeroLoss.add(player);
            }
            else if(losses ==1)
            {
                oneLoss.add(player);
            }
        }
        Collections.sort(zeroLoss);
        Collections.sort(oneLoss);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(zeroLoss);
        ans.add(oneLoss);
        return ans; */
        HashMap<Integer,Integer> map = new HashMap<>();
       // Initialy putting all nos as 0 frequency 
        for(int[] match : matches)
        {
            map.put(match[0],0);
            map.put(match[1],0);
        }

        for(int[] match : matches)
        {
            int loser = match[1];
            map.put(loser,map.get(loser)+1);
        }

        List<Integer> zeroL = new ArrayList<>();
        List<Integer> oneL = new ArrayList<>();

        for(Integer player : map.keySet())
        {
            int lose = map.get(player);
            if(lose == 0)
            {
                zeroL.add(player);
            }
            else if(lose==1)
            {
                oneL.add(player);
            }
        }
        Collections.sort(zeroL);
        Collections.sort(oneL);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(zeroL);
        ans.add(oneL);
        return ans;

    }
}