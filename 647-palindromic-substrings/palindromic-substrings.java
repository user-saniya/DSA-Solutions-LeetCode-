class Solution {

    public boolean isPalindrom(String s) {

        int low = 0;
        int high = s.length() - 1;

        while (low < high) {

            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }

            low++;
            high--;
        }

        return true;
    }

    public int countSubstrings(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            int low = i;

            for (int high = i; high < s.length(); high++) {

                String ans = s.substring(low, high + 1);

                if (isPalindrom(ans)) {
                    count++;
                }
            }
        }

        return count;
    }
}