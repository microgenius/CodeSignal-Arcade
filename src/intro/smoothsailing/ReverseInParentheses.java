package intro.smoothsailing;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseInParentheses {
  String reverseInParentheses(String inputString) {
    char[] inputCharArray = inputString.toCharArray();
    Stack<ParenthesesRange> parenthesesStack = new Stack<>();
    List<ParenthesesRange> completedIndexes = new ArrayList<>();

    for(int i = 0; i < inputCharArray.length; i++) {
      if (inputCharArray[i] == '('){
        ParenthesesRange range = new ParenthesesRange();
        range.beginIndex = i;

        parenthesesStack.push(range);
      } else if (inputCharArray[i] == ')') {
        ParenthesesRange range = parenthesesStack.pop();
        range.endIndex = i;

        completedIndexes.add(range);
      }
    }

    for(ParenthesesRange range : completedIndexes) {
      reverseArrayByRange(inputCharArray, range);
    }

    String reversedString = new String(inputCharArray);

    return reversedString.replace("(", "").replace(")", "");
  }

  public void reverseArrayByRange(char[] source, ParenthesesRange range) {
    int startIndex = range.beginIndex;
    int endIndex = range.endIndex;

    while(startIndex < endIndex) {
      char temp = source[endIndex];
      source[endIndex] = source[startIndex];
      source[startIndex] = temp;
      startIndex++;
      endIndex--;
    }
  }

  public class ParenthesesRange {
    public int beginIndex;
    public int endIndex;
  }
}
