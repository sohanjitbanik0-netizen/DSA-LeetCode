class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        for (string w:words){
            int i = 0;
            int j = w.length()-1;
            bool palindrome = true;;
            while(i<j){
                if(w[i] != w[j]){
                     palindrome = false;
                    break;
                }
               
                i++;
                j--;   
            }
            if(palindrome){return w;}
        }
    return "";
    }
};