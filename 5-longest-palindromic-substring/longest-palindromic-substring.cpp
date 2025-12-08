class Solution {
public:
    string longestPalindrome(string s) {
         int n = s.length();
        if(n <= 1) return s;

        string longest = "";

        for(int i = 0; i < n; i++) {
            int left = i, right = i;
            while(left >= 0 && right < n && s[left] == s[right]) {
                if(right - left + 1 > longest.length())
                    longest = s.substr(left, right - left + 1);
                left--;
                right++;
            }
            left = i;
            right = i + 1;
            while(left >= 0 && right < n && s[left] == s[right]) {
                if(right - left + 1 > longest.length())
                    longest = s.substr(left, right - left + 1);
                left--;
                right++;
            }
        }
        return longest;
    }
};