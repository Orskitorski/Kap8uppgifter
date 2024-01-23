import java.time.LocalTime;
import java.util.Calendar;

public class Main {
    public static void main(String[] arg) {
        System.out.println(upg87());
        System.out.println(upg88());
    }

    public static String upg87() {
        return (LocalTime.now().toString());
    }

    public static String upg88() {
        String date = Calendar.getInstance().getTime().toString();
        String[] montharray = new String[]{("Jan"), ("Feb"), ("Mar"), ("Apr"), ("May"), ("Jun"), ("Jul"), ("Aug"), ("Sep"), ("Oct"), ("Nov"), ("Dec")};
        String[] datearray = date.split(" ");

        String month = null;
        String day = datearray[2];
        String year = datearray[5];

        for (int i = 0; i<12; i++) {
            if (date.contains(montharray[i])) {
                i++;
                if (i < 10) {
                    month = ("0"+ i);
                }
                else {
                    month = String.valueOf(i);
                }
            }
        }
        return (year + "/" + month + "/" + day);
    }
}