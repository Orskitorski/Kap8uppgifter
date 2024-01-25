import java.time.LocalTime;
import java.util.Calendar;

public class Main {
    public static void main(String[] arg) {
        System.out.println(upg87()); //Kallar på metoden och skriver ut metodens return value i konsolen
        System.out.println(upg88());
    }

    public static String upg87() {
        return (LocalTime.now().toString());
    }

    public static String upg88() {
        String date = Calendar.getInstance().getTime().toString();
        String[] montharray = new String[]{("Jan"), ("Feb"), ("Mar"), ("Apr"), ("May"), ("Jun"), ("Jul"), ("Aug"), ("Sep"), ("Oct"), ("Nov"), ("Dec")};
        String[] datearray = date.split(" "); //Splittar upp datumet till en array där alla strings separeras där det finns ett mellanslag

        String month = null; //Initierar variabeln month som kommer användas i for loopen
        String day = datearray[2]; //Sätter variabeln day till stringen på plats 2 i arrayen
        String year = datearray[5]; //Sätter variabeln year till stringen på plats 5 i arrayen

        //For loop för att gå igenom varje månad i arrayen steg för steg (i ökar varje gång loopen körs) och kolla om datumet innehåller den specifika stringen
        for (int i = 0; i<12; i++) {
            if (date.contains(montharray[i])) {
                i++; //adderar 1 på i för att månaden ska bli rätt (array börjar alltid på plats 0)
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