public class Variables {
    public static void main(String[] args) {
        
        String name = "Lucas";
        byte number = -128; //-128 à 127
        int integer = 12345;
        long longInteger = 123456789012345L;
        float floatDecimal = 1.1234567f;
        double doubleDecimal = 1.12345678912;
        boolean bool = true;
        
        System.out.println(name);
        System.out.println(number);
        System.out.println(integer);
        System.out.println(longInteger);
        System.out.println(floatDecimal);
        System.out.println(doubleDecimal);
        System.out.println(bool);

        int num = 0;
        System.out.println(num);
        num = 1;
        System.out.println(num);

        //can`t modify a final variable
        //final int num1 = 0; 
        //num1 = 1;
    }
}
