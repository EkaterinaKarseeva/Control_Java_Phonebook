package PhoneBookProject;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        
        // Добавление контактов
        phoneBook.addContact("Alice", "123-456-7890");
        phoneBook.addContact("Bob", "234-567-8901");
        phoneBook.addContact("Alice", "345-678-9012");
        phoneBook.addContact("Bob", "456-789-0123");
        phoneBook.addContact("Charlie", "567-890-1234");
        phoneBook.addContact("Alice", "678-901-2345");

        // Печать телефонной книги
        phoneBook.printPhoneBook();
    }
}

