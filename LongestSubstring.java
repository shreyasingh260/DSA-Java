class Solution {
    public int lengthOfLongestSubstring(String s) {
         Map<Character, Integer> lastIndex = new HashMap<>();
        int low=0;
        int maxlen=0;
        for(int high=0;high<s.length();high++){
            char c = s.charAt(high);
            if(lastIndex.containsKey(c)){
                low=Math.max(low,lastIndex.get(c)+1);
            }
            lastIndex.put(c,high);
    maxlen=Math.max(maxlen,high-low+1);
        }
    return maxlen;
    }
}
