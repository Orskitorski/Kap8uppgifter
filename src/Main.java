import javax.swing.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;

public class Main {
    public static void main(String[] arg) {
        JOptionPane.showMessageDialog(null, upg87());
        JOptionPane.showMessageDialog(null, upg88());
    }

    public static String upg87() {
        LocalTime currentTime = LocalTime.now();
        return (currentTime.toString());
    }

    public static String upg88() {
        String Format = "yyyy/MM/dd";
        Date currentDate = Calendar.getInstance().getTime();
        DateFormat DF = new SimpleDateFormat(Format);
        return (DF.format(currentDate));
    }
}