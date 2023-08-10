public class Main {

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Console console = new Console();

        boolean running = true;
        while (running) {
            console.presentWelcomeMessage();
            int option = console.selectOption();

            switch (option) {
                case 1 -> addressBook.addEntry(console);
                case 2 -> addressBook.searchForEntry();
                case 3 -> addressBook.saveEntries();
                case 4 -> addressBook.displayEntries();
                case 5 -> System.exit(0);
            }
        }

    }

}
