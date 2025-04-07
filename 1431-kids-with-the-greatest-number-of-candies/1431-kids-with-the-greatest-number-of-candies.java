class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandyCnt = Integer.MIN_VALUE;
        Boolean[] ret = new Boolean[candies.length];

        for (int i : candies) {
            maxCandyCnt = Math.max(maxCandyCnt, i);
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandyCnt) {
                ret[i] = true;
            } else {
                ret[i] = false;
            }
        }
        
        return Arrays.asList(ret);
    }
}