class Solution {

    public boolean alphaNum(char c){
        return (c>='a' && c<='z' || c>='0' && c<='9');
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int left = 0, right = s.length()-1;
        while(left < right){
            while(left < right && !alphaNum(s.charAt(left))) left++;
            while(right > left && !alphaNum(s.charAt(right))) right--;

            if(s.charAt(left) != s.charAt(right)) return false;
            left++; right--;
        }

        return true;
    }
}
