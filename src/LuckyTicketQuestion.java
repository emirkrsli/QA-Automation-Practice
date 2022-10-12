public class LuckyTicketQuestion {
    /*
    Create method
boolean isMyTicketLucky(? ticketNumber);
- You need to choose a type of the parameter ticketNumber.
- Ticket number is 6-digits number like 123456 or 404404.
- The method returns true if sum of the first three digits is equal to sum of the last three digits. If the sums are different the method returns false.
     */
    //123456
    static boolean isMyTicketLucky(int ticketNumber){
        int firstHalf = 0, secondHalf = 0;
        int firstHalfDivisor = 100000,secondHalfDivisor=1;
        for (int i = 0; i<3; i++,firstHalfDivisor/=10,secondHalfDivisor*=10){
            firstHalf+=(ticketNumber/firstHalfDivisor)%10;
            secondHalf+=(ticketNumber/secondHalfDivisor)%10;
        }
        return firstHalf == secondHalf;
    }

    static boolean isMyTicketLucky2(int ticketNumber){
        int firstHalf = 0, secondHalf = 0;
        for (int i = 0; i<6;i++,ticketNumber/=10){
            if (i<3){
                firstHalf += ticketNumber%10;
            }else {
                secondHalf += ticketNumber%10;
            }
        }
        return firstHalf == secondHalf;
    }
}
