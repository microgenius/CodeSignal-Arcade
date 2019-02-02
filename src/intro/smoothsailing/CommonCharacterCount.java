package intro.smoothsailing;

import java.util.HashMap;
import java.util.Map;

public class CommonCharacterCount {
  int commonCharacterCount(String s1, String s2) {
    Map<Character, Integer> s1CharMap = createCharMap(s1);
    Map<Character, Integer> s2CharMap = createCharMap(s2);

    int commonCharCount = 0;

    for(Map.Entry<Character, Integer> entry : s1CharMap.entrySet()) {
      if (s2CharMap.containsKey(entry.getKey())) {
        int s2Value = s2CharMap.get(entry.getKey());
        commonCharCount += Math.min(s2Value, entry.getValue());
      }
    }

    return commonCharCount;
  }

  Map<Character, Integer> createCharMap(String source){
    Map<Character, Integer> charMap = new HashMap<>();
    char[] sourceCharArray = source.toCharArray();
    for(int i = 0; i < sourceCharArray.length; i++){
      Integer charCount = charMap.get(sourceCharArray[i]);
      if (charCount == null) {
        charCount = 0;
      }

      charMap.put(sourceCharArray[i], ++charCount);
    }

    return charMap;
  }
}
