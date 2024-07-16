package PhoneBookProject;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи в телефонную книгу
    public void addContact(String name, String phone) {
        phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phone);
    }

    // Метод для получения всех контактов, отсортированных по убыванию числа телефонов
    public List<Map.Entry<String, Set<String>>> getSortedContacts() {
        List<Map.Entry<String, Set<String>>> contacts = new ArrayList<>(phoneBook.entrySet());
        contacts.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        return contacts;
    }

    // Метод для печати телефонной книги
    public void printPhoneBook() {
        List<Map.Entry<String, Set<String>>> sortedContacts = getSortedContacts();
        for (Map.Entry<String, Set<String>> entry : sortedContacts) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
