class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int Left = 0;
        int Right = s.length() - 1;

        while (Left < Right) {

            if (s.charAt(Left) != s.charAt(Right)) {
                return false;
            }

            Left++;
            Right--;
        }

        return true;
    }
}

