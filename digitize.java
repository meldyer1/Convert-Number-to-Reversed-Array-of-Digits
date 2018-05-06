import java.util.*;
import java.lang.*;

public class Kata
{
  public static int[] digitize(long n) 
  {
    //reverse the long before converting it into a string
    String tempString = new StringBuilder().append(n).reverse().toString();
    int[] ans = new int[tempString.length()];
    for (int i = 0; i < tempString.length(); i++)
    {
      // for each number in the string array, parse it to a long and add it to the array ans
      ans[i] = Character.getNumericValue(tempString.charAt(i));
    }
    return ans;
  }
}
