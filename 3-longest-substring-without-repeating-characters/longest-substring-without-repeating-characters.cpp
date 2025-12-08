class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int maxLen = 0;
        for(int i=0; i<s.length(); i++){
            bool freq[256] = {false};
            int len = 0;
            for(int j=i; j<s.length(); j++){
                int idx = (int)s[j];
                if(freq[idx] == true){
                    break;
                }
                freq[idx] = true;
                len++;
            }
            maxLen = max(maxLen,len); 
        }
        return maxLen;
    }
};