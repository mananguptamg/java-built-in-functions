import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();

        // Define the required date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Format and display the date
        System.out.println("Date in dd/MM/yyyy format: " + today.format(format1));
        System.out.println("Date in yyyy-MM-dd format: " + today.format(format2));
        System.out.println("Date in EEE, MMM dd, yyyy format: " + today.format(format3));
    }
}
