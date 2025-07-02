public class AnagramCheck {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // assuming only lowercase letters

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // Increment for s
            count[t.charAt(i) - 'a']--;  // Decrement for t
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagrams", "nagaram")); // true
        System.out.println(isAnagram("rast", "car"));         // false
    }
}
