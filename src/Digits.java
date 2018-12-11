import java.util.ArrayList;
import java.util.Arrays;

public class Digits {

    private int num;
    private ArrayList<Integer> digits;

    public Digits(int num)
    {
        digits = new ArrayList<Integer>();
        String numstr = String.valueOf(num);
        for(int i = 0; i < numstr.length(); i++)
        {
            int j = Character.digit(numstr.charAt(i),10);
            Integer k = new Integer(j);
            digits.add(k);
        }
    }

    public boolean isStrictlyIncreasing()
    {
        for(int i = 1; i < digits.size()-1; i++)
        {
            if(digits.get(i) > digits.get(i + 1) || digits.get(i).equals(digits.get(i + 1)))
            {
                return false;
            }
        }
        return true;
    }

    public String getDigitList()
    {
        System.out.println(Arrays.deepToString(digits.toArray()));
        return "";
    }
}
