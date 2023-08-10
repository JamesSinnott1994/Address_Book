import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    private List<Entry> entries;
    Scanner in = new Scanner(System.in);

    public AddressBook() {
        entries = new ArrayList<>();
    }

    public void addEntry(Console console) {

        System.out.println();
        System.out.println("Add Entry information");
        Entry entry = new Entry();

        String firstName = console.promptEntryField("First name:");
        String lastName = console.promptEntryField("Last name:");
        String phoneNumber = console.promptEntryField("Phone Number:");
        String address = console.promptEntryField("Address");
        String email = console.promptEntryField("Email:");

        entry.setFirstName(firstName);
        entry.setLastName(lastName);
        entry.setPhoneNumber(phoneNumber);
        entry.setAddress(address);
        entry.setEmail(email);

        entries.add(entry);

        System.out.println();
        System.out.println("Below entry successfully added!");
        System.out.println(entry);
        System.out.println();

    }

    public void searchForEntry(Console console) {
        String lastNameToSearchFor = console.promptEntryField("Enter last name to search for:");

        boolean found = false;

        for (Entry entry : entries) {
            if (entry.getLastName().equals(lastNameToSearchFor)) {
                found = true;
                System.out.println();
                System.out.println("Entry found! See below");
                System.out.println(entry);
            }
        }

        if (!found) {
            System.out.println();
            System.out.println("Entry could not be found. Tá brón orm!");
        }
    }

    public void saveEntries() {
        Path path = Paths.get("AddressBook.txt");

        for (Entry entry : entries) {
            try {
                Files.writeString(path, entry.toString(), StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println("Invalid path");
            }
        }
    }

    public void displayEntries() {

        System.out.println();
        if (entries.size() > 0) {
            for (Entry entry : entries) {
                System.out.println(entry);
            }
        } else {
            System.out.println("There are no entries in the address book. Fill it up!");
        }
    }
}
