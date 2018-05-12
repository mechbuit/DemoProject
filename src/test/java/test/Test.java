package test;

public class Test 
{
    public static void main(String[] args)
    {
        int day = 5;
        String dayString;
         
        // switch statement with int data type
        switch (2) 
        {
            case 1:  dayString = "Monday";
            break;
                     
            case 2:  dayString = "Tuesday";
           
            case 3:  dayString = "Wednesday";
                     
            case 4:  dayString = "Thursday";
            break;      
            case 5:  dayString = "Friday";
                     
            case 6:  dayString = "Saturday";
                     
            case 7:  dayString = "Sunday";
                     
            default: dayString = "Invalid day";
                     
        }
        System.out.println(dayString);
    }
}
