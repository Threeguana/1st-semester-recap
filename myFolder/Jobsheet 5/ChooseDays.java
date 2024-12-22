import java.util.Scanner;

public class ChooseDays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String days, dayType;

            System.out.print("Input day name: ");
            days = sc.nextLine();

            dayType = switch (days.toLowerCase()) {
                case "monday", "tuesday", "wednesday", "thursday", "friday" -> "weekday";
                case "saturday", "sunday" -> "weekend";
                default -> "Invalid day name";
            };   
            System.out.println(days + " is a " + dayType);
        }
    }
}
