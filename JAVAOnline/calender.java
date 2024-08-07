import java.util.Calendar;

public class calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getCalendarType());
    }
}
