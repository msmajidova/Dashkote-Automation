public class Math {
    public static void main(String[] args) {
//        addition(2,3);
//        System.out.println(additionWithReturn(5,5));

        // TC1: (10 < 20) = 0
        System.out.println(substruction(10, 20));
        // TC2: (-10, 11) = -21
        System.out.println(substruction(-10, 11));
    }

    // Addition
    public static void addition(int num1, int num2){
        int sum = num1+num2;
        System.out.println(sum);
    }

    // Addition with return
    public static int additionWithReturn(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }

    // Substruction
    public static int substruction(int num1, int num2) {
        if (num1 < num2 && num1 > 0)
            return 0;
        else return num1-num2;
    }

    // Multiplication

    // Division
}