public class Main {

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Console console = new Console();

        boolean running = true;

        while (running) {

            console.presentWelcomeMessage();
            int option = console.selectOption();

        }

    }

}
