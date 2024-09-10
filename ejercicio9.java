class PalindromeCheck {
    public static void main(String[] args) {
        String text = "madam"; 
        boolean isPalindrome = isPalindrome(text);
        System.out.println("\"" + text + "\" is a palindrome: " + isPalindrome);
    }

    static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
