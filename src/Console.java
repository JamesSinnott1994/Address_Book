import java.util.Scanner;

public class Console {

    Scanner in = new Scanner(System.in);

    public void presentWelcomeMessage() {
        System.out.println();
        System.out.println("Welcome to the Address Book program! \nPlease select an option below:");
        System.out.println();

        System.out.println("1. Add an Entry");
        System.out.println("2. Search for an Entry");
        System.out.println("3. Save Entries");
        System.out.println("4. Display Entries");
        System.out.println("5. Exit");
    }

    public int selectOption() {
        System.out.println();
        System.out.println("Enter option number:");
        int option = Integer.parseInt(in.nextLine());

        while (option < 1 || option > 5) {
            System.out.println();
            System.out.println("Invalid option number entered, please select a number between 1 and 5:");
            option = Integer.parseInt(in.nextLine());
        }
        return option;
    }

    public String promptEntryField(String field) {
        System.out.println();
        System.out.println(field);
        return in.nextLine();
    }

}

