import java.util.*;

class Solution {
    public int maxVowels(String s, int k) {
        // String이 아닌 Character 유의, Character는 작은 따음표 사용
        final HashSet<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int cur = 0;
        int ret = 0;    
        int start = 0;

        for (int i = 0; i < k; i++) {
            if (vowel.contains(s.charAt(i))) {
                cur++;
                ret++;
            }
        }

        for (int i = k; i < s.length(); i++) {
            if (vowel.contains(s.charAt(start))) {
                cur--;
            }
            if (vowel.contains(s.charAt(i))) {
                cur++;
            }

            ret = Math.max(ret, cur);

            start++;
        }    

        return ret;
    }
}