public class Main {

    public static void main(String[] args) {
        String str = "мадам";

        if (isPalindrome(str)) {
            System.out.println(str + " является палиндромом.");
        } else {
            System.out.println(str + " не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}