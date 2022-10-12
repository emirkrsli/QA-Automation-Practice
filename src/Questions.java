public class Questions {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(power(1,3));
        System.out.println(power(0,3));
        System.out.println(power(2,0));
        System.out.println(power(0,0));

    }

    // Write a Java Program to swap two numbers without using temp
    public static void swapWithoutTemp(int a, int b){

        System.out.println("Değişim öncesi:");
        System.out.println("a: "+a + ","+ "b: "+ b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Değişim sonrası:");
        System.out.println("a: "+a + ","+ "b: "+ b);
    }


    // Write a Java Program to swap two numbers
    public static void swapNumbers(int a,int b){

        System.out.println("Değişim öncesi:");
        System.out.println("a: "+a + ","+ "b: "+ b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Değişim sonrası:");
        System.out.println("a: "+a + ","+ "b: "+ b);
    }

    //Write a Java Program to check if given year is leap or not
    public static boolean LeapYear(int year){
        if(year % 4==0 && year %100 !=0) {
            return true;
        } else if (year%400 ==0) {
                return true;
        }
        return false;
    }

    // Write a Java Program to find sum of the digits of a given number
    public static int sumOfDigits(int number){
        if (number < 0){
            System.out.println("number cannot be negative. return will be -1");
            return -1;
        }else {
            int result = 0;
            for (;number>0;number=number/10){
                result = result + number%10;
            }
            return result;
        }
    }

    //Write a program to print numbers from 1 to 10.
    public static void printNumbers(){
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }

    public static void printNumbersWithoutLoops(){
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
    }

    //Write a program to calculate the sum of first 10 natural number.
    public static int sumOfFirst10NaturalNumber(){
        int result = 0;
        for (int i =0;i <10; i++){
            result+=i;
        }
        return result;
    }

    //Write a program to calculate the sum of first 10 natural number. Kemal Aymaz Solution
    public static void kemalAymaz() {
        int num = 10, aym = 0;
        for (int i = 1; i <= num; ++i) {
            aym += i;
        }
        System.out.println(aym);
    }

    // 6*5*4*3*2*1
    //Write a program to find the factorial value of given number.
    public static int findFactorial(int input){
        int result = 1;
        for (int i = input;i>0;i--){
            result = result * i;
        }
        return result;
    }

    public static void timer(int second) throws InterruptedException {
        for (;second>=0;second--){
            System.out.println(second+ " Second left.");
            Thread.sleep(1000);
        }
    }

    //Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
    public static int power(int a, int b){
        if (a == 0  && b == 0){
            return 0;
        }
        int result = 1;
        for (int i=1;i<=b;i++){
            result = result * a;
        }
        return result;
    }

    //GITHUB TEST METHODS
    //public static void TestMethod(){
    //    System.out.println("test");
    //}


    //public static void MesutTestMethod(){
    //    System.out.println("test");
    //}
    //GITHUB TEST METHODS
}
