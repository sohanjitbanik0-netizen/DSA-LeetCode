class Solution {
public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        int i=0;
        int j=s.length()-1;
        s=s.toLowerCase();
        boolean palindrome = true;
             while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                     palindrome = false;
                    break;
                }
               
                i++;
                j--;   
            }
            if(palindrome){return true;}
      return false;      
    }
};