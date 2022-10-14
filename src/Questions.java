public class Questions {

//    public static void main(String[] args) throws InterruptedException {
//        whichDayIsIt(10);
//    }

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

    // 6*5*4*3*2*1
    //Write a program to find the factorial value of given number using while loop.
    public static int findFactorialUsingWhile(int input){
        int result = 1;
        while (input > 0){
            result = result*input;
            input--;
        }
        return result;
    }

    //Write a program to print numbers from 1 to 10 using while loop.
    public static void printNumbersWhileLoop(){
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }

    //Write a program to print numbers from 1 to 10 using while loop. - Kemal Aymaz Solution
    public static void printNumbersWhileLoopKemalAymaz(){
        int i=1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }
    }

    public static void printNumbersDoWhile(){
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i <= 10);
    }

    /*
        A do-while loop is executed:
           At least once - correct answer
           At least twice - x
           At most once - x
    */


    //What can be done using one type of loop can also be done using the other two types of loops - True or False.
    //-True

    public static void ternaryExample(int x){
        String c;
        if (x % 2 == 0){
            c = "Even";
        }else{
            c = "Odd";
        }
        System.out.println(c);
    }

    /*
    Try to convert if statement below to a ternary operation:

    if(x.length>=6){
        result = "length of x is bigger than or equals 6";
    }else {
        result = "length of x is less than 6";
    }
     */
    public static void ternaryExample2(String x){
        String result;
        result =  x.length() >= 6 ? "length of x is bigger than or equals 6" : "length of x is less than 6";
        System.out.println(result);
    }


    /*
    if(marks >= 90) {
            grade = "A";
        } else if( marks >= 80 ) {
            grade = "B";
        } else {
            grade = "C";
        }
     */
    public static void ternaryExample3(int marks){
        String grade;
        grade = marks >= 90 ? "A" : marks >= 80 ? "B" : "C";
        System.out.println(grade);

    }

    //Write a Java Program to check if given year is leap or not using ternary operator
    public static boolean leapYearUsingTernary(int year){
//        if(year % 4==0 && year %100 !=0) {
//            return true;
//        } else if (year%400 ==0) {
//            return true;
//        }
//        return false;
//        result = year % 4 == 0 && year % 100 != 0 || (year % 400 == 0 ? true : false);

        boolean result;
        result = year % 4 == 0 && year %100 != 0 ?  true : year%400 == 0 ? true : false;
        return result;
    }



    //Switch case

    public static void whichDayIsIt(int x){
//        if (x == 1){
//            System.out.println("monday");
//        }else if (x == 2){
//            System.out.println("tuesday");
//        }else if (x == 3){
//            System.out.println("wednesday");
//        }else if (x == 4){
//            System.out.println("thursday");
//        }else if (x == 5){
//            System.out.println("friday");
//        }else if (x == 6){
//            System.out.println("saturday");
//        }else if (x == 7){
//            System.out.println("sunday");
//        }

        switch(x) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesdau");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("not a day");
        }
    }

    /*
    String manipulations:
	concat();
	charAt();
	toUpperCase();
	toLowerCase();
	equals();
	equalsIgnoreCase();
	subString();
	split();
	length();
	indexOf();
	lastIndexOf();
	contains();
	startsWith();
	endsWith();
	isEmpty();
	trim();
	isBlank();
	replace();
	replaceAll(); -- regex
     */

    public static void main(String[] args) {
        String e = "emir";
        String a = "karslı";
        //concat
        System.out.println(e.concat(a));
        //charAt
        System.out.println(e.charAt(0));
    }


}
