public class leapYear {
    static void leapArea(int year){
        //Check Leap year condition.
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + ": Leap year.");
        }else{
            System.out.println(year + ": Not a leap year.");
        }
    }

    public static void main(String[] args){
        //method call
        leapArea(2024);
    }
}
