import java.time.*;

class DateAddition {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate newDate = today.plusDays(7).plusMonths(1).plusYears(2);

        System.out.println("New date after adding 7 days, 1 month, and 2 years is "+newDate);

        LocalDate resultDate = newDate.minusWeeks(3);

        System.out.println("Date after subtraction of three weeks from new date " +resultDate);
    }
}
