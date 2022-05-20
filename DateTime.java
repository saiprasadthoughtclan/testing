import java.text.*;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class DateTime{
    public static void main(String[] args) {
        // local time
        LocalTime local = LocalTime.now(); 
        String dateStart=local.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        System.out.println("Local Time now : "+dateStart);
        //utc time
        OffsetDateTime utc = OffsetDateTime.now(ZoneOffset.UTC); 
        String dateStop=utc.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        System.out.println("UTC Time now : "+dateStop);
        // Custom date format
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");  
        Date d1 = null;
        Date d2 = null;
        try {
        d1 = format.parse(dateStart);
        d2 = format.parse(dateStop);
        } catch (ParseException e) {
        e.printStackTrace();
        }    
        // Get min from each, and subtract.
        long diff = d2.getTime() - d1.getTime();
        long diffMinutes = diff / (60 * 1000); 
        System.out.println("Time in minutes: " + diffMinutes + " minutes."); 


    }
}
