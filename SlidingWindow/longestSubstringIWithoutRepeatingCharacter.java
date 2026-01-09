class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;

        int left = 0;
        HashSet <Character> set = new HashSet<>();

        //sliding win
        for(int right = 0; right < n; right++)
        {
            char ch = s.charAt(right);

            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
