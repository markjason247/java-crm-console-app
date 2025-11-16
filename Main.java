import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the CRM app");
        try (Scanner scanner = new Scanner(System.in)) {
            int userOption;
            do {
                System.out.println("Choose an option below:");
                System.out.println("""
                               1. Add Lead
                               2. View Leads
                               3. Update Lead (optional for now)
                               4. Delete Lead (optional for now)
                               5. Exit""");
                 userOption = scanner.nextInt();
                System.out.println("User selected: " + userOption);
                if(userOption == 1) {
                    System.out.println("Adding a lead...");
                }
                else if (userOption == 2) {
                    System.out.println("Viewing leads...");
                }
                else if (userOption == 3) {
                    System.out.println("Updating lead...");
                }
                else if (userOption == 4) {
                    System.out.println("Deleting lead...");
                }
                else if (userOption == 5) {
                    System.out.println("Exiting program...");
                }
            } while(userOption != 5);
        }
        System.out.println("Goodbye!");
    }
}