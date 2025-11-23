import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the CRM app");

        ArrayList<Lead> newLeads = new ArrayList<>();
        Lead l1 = new Lead("John Doe", "john@example.com", "New");
        Lead l2 = new Lead("Jane Smith", "jane@example.com", "Contacted");
        Lead l3 = new Lead("Alice Kim", "alice@example.com", "Closed");

        newLeads.add(l1);
        newLeads.add(l2);
        newLeads.add(l3);

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
                    for (Lead lead : newLeads) {
                        System.err.println(lead);
                    }
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


        newLeads.add(l1);
        newLeads.add(l2);
        newLeads.add(l3);

        System.out.println("Leads in the system:");
        for (Lead lead : newLeads) {
            System.out.println(lead);
        }
    }
}