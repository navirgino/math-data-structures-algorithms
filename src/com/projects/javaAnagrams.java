import java.util.HashMap;
import java.util.Map;

public class javaAnagrams {
    static boolean isAnagram(String a, String b) {

        //test for invalid input
        if (a == null || b == null || a.equals("") || b.equals(""))
            throw new IllegalArgumentException();


        int aLen = a.length();
        int bLen = b.length();
        //initial quick test for non-anagrams
        if (aLen != bLen) return false;

        //unify string case
        a = a.toLowerCase();
        b = b.toLowerCase();

        //populate a map w/ letters and frequencies of String b
        Map<Character, Integer> map = new HashMap<>();

        //loop through b string
        for (int i = 0; i < bLen; i++) {
            char letter = b.charAt(i);
            //if hashmap contains any of the letters in the key put it in
            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                Integer frequency = map.get(letter);
                map.put(letter, ++frequency);
            }
        }
        //test each letter in String a against data in the map
        //return if letter is absent in the map or its frequency is 0
        //otherwise decrease the frequency by 1
        for (int i = 0; i < aLen; i++){
            char letter = a.charAt(i);

            if(! map.containsKey( letter )) return false;
            Integer frequency = map.get( letter );

            if( frequency == 0 )
                return false;
            else
                map.put( letter, --frequency );
        }
        //if the code got that far it is an anagram
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("hello", "olleh"));
        System.out.println(isAnagram("banana", "bana"));
    }
}
