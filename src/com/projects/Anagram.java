import java.util.*;

public class Anagram {

  public static String reverse(String str) {
    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.charAt(i);
    }
    return reverse;
  }

  public static char[] sort(String str) {
    char[] strChar = str.toCharArray();
    int len = strChar.length;

    for (int i = 0; i < len - 1; i++) {
      for (int j = 0; j < len - i - 1; j++) {
        if (strChar[j] > strChar[j + 1]) {
          char temp = strChar[j];
          strChar[j] = strChar[j + 1];
          strChar[j + 1] = temp;
        }
      }
    }
    return strChar;
  }

  public static boolean isAnagram(String a, String b) {
    // quick length check
    if (a.length() != b.length())
      return false;

    // sort both the strings
    char[] sortedA = sort(a);
    char[] sortedB = sort(b);

    // loop through just one to compare
    for (int i = 0; i < sortedA.length; i++) {
      if (sortedA[i] != sortedB[i]) 
      {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isAnagram("test", "banana")); //false
    System.out.println(isAnagram("abcde", "edcba")); //true
    System.out.println(isAnagram("asdfgh", "hgfdsa")); //true
    System.out.println(isAnagram("pqowieuryt", "qwertyuiop")); //true

  }
}