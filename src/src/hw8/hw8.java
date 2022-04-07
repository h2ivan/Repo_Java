package hw8;


import java.text.SimpleDateFormat;
import java.util.Calendar;


public class hw8 {

    // creating class name
    public static class printTime {

        public static void main(String[] args) {

            // calling generatePrintTime and passing 5 as an argument
            generatePrintTime(5);
        }

        // creating method named generatePrintTime which takes one int parameter
        public static void generatePrintTime(int time)
        {
            // creating calendar object getting current time
            Calendar calendar = Calendar.getInstance();
            // creating dateFormat object with hour and minute format
            SimpleDateFormat dateFormat = new SimpleDateFormat("ha");

            System.out.print("Now");
            // iterate from i is equal to 1, i is less than time and increment i by 1
            for(int i=1;i < time;i++)
            {
                // adding 2 in hour
                calendar.add(Calendar.HOUR, 2);
                // display output with format value of time
                System.out.print(" "+dateFormat.format(calendar.getTime()));

            }

        }
    }
}
