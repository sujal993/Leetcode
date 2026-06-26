class Solution {
    public boolean isPalindrome(int x) 
    {
        int temp  = x;
        boolean ans = false;
        int reverse = 0;
        while(x>0)
        {
            int digit = x % 10;
            x = x/10;
            reverse = reverse*10 + digit; 
        }
        return reverse == temp?true:false;
    }
}