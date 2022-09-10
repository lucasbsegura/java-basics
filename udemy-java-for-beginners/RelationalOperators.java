public class RelationalOperators {
    
    public static void main(String[] args) {

        int val1 = 20;
        int val2 = 10;

        boolean isEqual = (val1 == val2);
        System.out.println(isEqual);

        boolean isBigger = (val1 > val2);
        System.out.println(isBigger);

        boolean isSmaller = (val1 < val2);
        System.out.println(isSmaller);

        boolean isBiggerOrEqual = (val1 >= val2);
        System.out.println(isBiggerOrEqual);

        boolean isSmallerOrEqual = (val1 <= val2);
        System.out.println(isSmallerOrEqual);

        boolean isDifferent = (val1 != val2);
        System.out.println(isDifferent);
    }

}
