public class Util {

    public static boolean checkingCorrectSymbols(char[] chars) {
        for (char aChar : chars) {
            if (Character.isDigit(aChar) || aChar == '+' || aChar == '-' || aChar == '*' || aChar == '/')
                continue;
            return false;
        }

        return true;
    }


    public static int findPositionAction(char[] chars) {
        int pos = 0;

        for (int i = 0; i < chars.length; i++)
            if (chars[i] == '+' || chars[i] == '-' || chars[i] == '*' || chars[i] == '/')
                pos = i;

        return pos;
    }

    public static int countSymbolsAction(char[] chars) {
        int count = 0;

        for (char aChar : chars)
            if (aChar == '+' || aChar == '-' || aChar == '*' || aChar == '/')
                count++;

        return count;
    }

    public static int[] creatingNumsFromString(char[] chars, int posAct) {
        String a = "";
        String b = "";

        for (int i = 0; i < posAct; i++) a += chars[i];
        for (int i = posAct + 1; i < chars.length; i++) b += chars[i];
        if (posAct == 0) {
            a = "0";
            b = "0";
        }
        return new int[]{Integer.parseInt(a), Integer.parseInt(b)};

    }

    public static boolean checkingValueNum(int[] ints) {
        for (int anInt : ints) if (anInt > 10) return false;
        return true;
    }

    public static void myExceptions(char[] chars, int[] nums, int posAct) throws Exception {
        if (!Util.checkingCorrectSymbols(chars)) throw new Exception("Присутствуют некорректные символы");
        if (Util.countSymbolsAction(chars) == 0) throw new Exception("Не является математической операцией");
        if (Util.countSymbolsAction(chars) != 1) throw new Exception("Слишком много действий");
        if (posAct > 2 || posAct < 1) throw new Exception("Используй числа не больше 10");
        if (!Util.checkingValueNum(nums)) throw new Exception("Используй числа не больше 10");
    }

}
