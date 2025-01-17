

public class Calculator {

    public static int calc(String s) throws Exception {

        char[] chars = s.toCharArray();
        int posAct = Util.findPositionAction(chars);
        int[] nums = Util.creatingNumsFromString(chars, posAct);
        Util.myExceptions(chars, nums, posAct);

        if (chars[posAct] == '+') return nums[0] + nums[1];
        else if (chars[posAct] == '*') return nums[0] * nums[1];
        else if (chars[posAct] == '-') return nums[0] - nums[1];
        else if (chars[posAct] == '/') return nums[0] / nums[1];

        return 0;

    }
}
