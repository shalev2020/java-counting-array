package practice1;

public class CountingArrayAssignment {
    // תרגיל 1
    public static boolean isBalanced(String s) {
        if (s == null || s.length() == 0) return false;
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'a' || s.charAt(i) > 'z') {
                return false;
            }
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 != 0) return false;
        }
        return true;
    }

    // תרגיל 2
    public static boolean sameLetters(String s1, String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < 'a' || s1.charAt(i) > 'z') {
                return false;
            }
            count1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) < 'a' || s2.charAt(i) > 'z') {
                return false;
            }
            count2[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    // תרגיל 3
    public static boolean isMostlyEven(String s) {
        int[] count1 = new int[26];
        int evenCount = 0;
        int different = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'a' || s.charAt(i) > 'z') {
                return false;
            }
            count1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count1[i] > 0) {
                different++;
                if (count1[i] % 2 == 0)
                    evenCount++;
            }
        }
        return evenCount > different / 2;
    }

    // תרגיל 4
    public static boolean sameUniqueLetters(String s1, String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < 'a' || s1.charAt(i) > 'z') {
                return false;
            }
            count1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) < 'a' || s2.charAt(i) > 'z') {
                return false;
            }
            count2[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count1[i] > 0 != count2[i] > 0) {
                return false;
            }
        }
        return true;
    }

    // תרגיל 5
    public static boolean isAlmostSpecial(String s) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'a' || s.charAt(i) > 'z') {
                return false;
            }
            count[s.charAt(i) - 'a']++;
        }
        int oddCount = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount == 1;
    }

    // תרגיל 6
    public static int countOddLetters(String s) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                count[s.charAt(i) - 'a']++;
            }
        }
        int count1 = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                count1++;
            }
        }
        return count1;
    }

    // תרגיל 8
    public static boolean areComplementary(String s1, String s2) {
        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < 'a' || s1.charAt(i) > 'z') {
                return false;
            }
            count[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) < 'a' || s2.charAt(i) > 'z') {
                return false;
            }
            count[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0)
                return false;
        }
        return true;
    }

    // תרגיל 11
    public static boolean sameFrequencySet(String s1, String s2) {
        int[] count = new int[26];
        int[] count1 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < 'a' || s1.charAt(i) > 'z') {
                return false;
            }
            count[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) < 'a' || s2.charAt(i) > 'z') {
                return false;
            }
            count1[s2.charAt(i) - 'a']++;
        }
        int[] A = new int[s1.length() + 1];
        int[] B = new int[s1.length() + 1];

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                A[count[i]]++;
            }
            if (count1[i] > 0) {
                B[count1[i]]++;
            }
        }
        for (int i = 0; i <= s1.length(); i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }

    // תרגיל 7 א && ב
    public static boolean isSpecial(String s) {
        if (s == null) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'a' || s.charAt(i) > 'z') {
                return false;
            }
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0)
                return false;
        }
        return true;
    }

    public static int countSpecialStrings(String[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int countEven = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isSpecial(arr[i])) {
                countEven++;
            }
        }
        return countEven;
    }

    public static int longestSpecialIndex(String[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int index = -1;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isSpecial(arr[i])) {

                if (arr[i].length() > max) {
                    max = arr[i].length();
                    index = i;
                }
            }
        }
        return index;
    }

    // תרגיל 12 א && ב
    public static int isGone(char[] arr) {
        int[] count = new int[26];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                count[arr[i] - 'a']++;
            }
        }
        int countGone = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                countGone++;
            }
        }
        return countGone;
    }

    public static int countMissingLetters(char[] arr) {
        if (arr == null) return 0;
        return isGone(arr);
    }

    public static char mostCommonLetter(char[] arr) {
        int[] count = new int[26];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                count[arr[i] - 'a']++;
            }
        }
        int max = -1;
        int index = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return (char) (index + 'a');
    }

    // תרגיל 9
    public static boolean sameDigitsCount(int num1, int num2) {
        int[] count = new int[10];
        int[] count1 = new int[10];

        while (num1 > 0) {
            int digit = num1 % 10;
            count[digit]++;
            num1 /= 10;
        }
        while (num2 > 0) {
            int digit = num2 % 10;
            count1[digit]++;
            num2 /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (count[i] != count1[i]) {
                return false;
            }
        }
        return true;
    }

    // תרגיל 10
    public static boolean isSpecialNumber(int num) {
        int[] count = new int[10];
        while (num > 0) {
            int digit = num % 10;
            count[digit]++;
            num /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (count[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // תרגיל 1
        System.out.println("isBalanced:");
        System.out.println(isBalanced("aabb"));
        System.out.println(isBalanced("aabc"));
        System.out.println();

        // תרגיל 2
        System.out.println("sameLetters:");
        System.out.println(sameLetters("aabbc", "bcaab"));
        System.out.println(sameLetters("aabb", "abbb"));
        System.out.println();

        // תרגיל 3
        System.out.println("isMostlyEven:");
        System.out.println(isMostlyEven("aabbc"));
        System.out.println(isMostlyEven("abc"));
        System.out.println();

        // תרגיל 4
        System.out.println("sameUniqueLetters:");
        System.out.println(sameUniqueLetters("aabcc", "abc"));
        System.out.println(sameUniqueLetters("aab", "bcc"));
        System.out.println();

        // תרגיל 5
        System.out.println("isAlmostSpecial:");
        System.out.println(isAlmostSpecial("aab"));
        System.out.println(isAlmostSpecial("aabb"));
        System.out.println();

        // תרגיל 6
        System.out.println("countOddLetters:");
        System.out.println(countOddLetters("aabccc"));
        System.out.println(countOddLetters("aabb"));
        System.out.println();

        // תרגיל 7 א
        System.out.println("countSpecialStrings:");
        String[] arr1 = {"aabb", "abc", "ccdd", "ab"};
        System.out.println(countSpecialStrings(arr1));
        System.out.println();

        // תרגיל 7 ב
        System.out.println("longestSpecialIndex:");
        String[] arr2 = {"aabb", "abc", "ccddff", "ab"};
        System.out.println(longestSpecialIndex(arr2));
        System.out.println();

        // תרגיל 8
        System.out.println("areComplementary:");
        System.out.println(areComplementary("ab", "ba"));
        System.out.println(areComplementary("ab", "bc"));
        System.out.println();

        // תרגיל 9
        System.out.println("sameDigitsCount:");
        System.out.println(sameDigitsCount(1223, 3212));
        System.out.println(sameDigitsCount(1223, 3222));
        System.out.println();

        // תרגיל 10
        System.out.println("isSpecialNumber:");
        System.out.println(isSpecialNumber(1221));
        System.out.println(isSpecialNumber(1231));
        System.out.println();

        // תרגיל 11
        System.out.println("sameFrequencySet:");
        System.out.println(sameFrequencySet("aabbc", "xxyyz"));
        System.out.println(sameFrequencySet("aabbc", "xxxyy"));
        System.out.println();

        // תרגיל 12 א
        System.out.println("countMissingLetters:");
        char[] chars1 = {'a', 'b', 'c', 'a', 'z'};
        System.out.println(countMissingLetters(chars1));
        System.out.println();

        // תרגיל 12 ב
        System.out.println("mostCommonLetter:");
        char[] chars2 = {'a', 'b', 'c', 'a', 'z', 'a', 'b'};
        System.out.println(mostCommonLetter(chars2));
        System.out.println();
    }
}
