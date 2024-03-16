//https://leetcode.com/problems/palindrome-number/submissions/1204819484/

class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0)
        return false;
        int digits = String.valueOf(x).length();
        int[] array = new int[digits];

        for (int i = 0; i < digits && x >= 10; i++) {
            array[i] = x % 10;  
            x /= 10; 
        }

        if (digits % 2 != 0 || x < 10) {
            array[digits - 1] = x % 10;
        }

        for (int l = 0, k = (digits - 1); l <= (digits / 2) ; l++ , k--) {
            if (array[l] != array[k]) {
                return false;
            }
        }
        return true;
    }
}

