public class ForLoopExamples {


    //Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
    public static int reverseInteger(int input){

        int result = 0;
        int loopCondition = (input + "").length();
        for (int i =0; i< loopCondition; i++){
            result *= 10;
            result = result + input % 10;
            input/=10;
        }
        return result;
    }

    public static int reverseInteger2(int input){

        int result = 0;
        int loopCondition = String.valueOf(input).length();
        for (int i = 0; i < loopCondition; i++, input/=10){
            result = (result*10) + input % 10;
        }
        return result;

    }

    public static void main(String[] args) {
//        System.out.println(reverseInteger(12345));
        System.out.println(reverseInteger2(12345));
    }
}
