package J2.lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory { //Публичный класс нашей телефонной книги
    private final Map<String, ArrayList<String>> phoneBook = new HashMap<>();
    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phoneNumberList = new ArrayList<>();
        if (phoneBook.containsKey(lastName)){
            phoneNumberList = phoneBook.get(lastName);
            phoneNumberList.add(phoneNumber);
            System.out.println("For the subscriber (" + lastName + ") an additional number has been added: " + phoneNumber);
        } else {
            phoneNumberList.add(phoneNumber);
            phoneBook.put(lastName, phoneNumberList);
            System.out.println("A new subscriber has been added to the directory." + lastName + ": " + phoneNumber);
        }
    }

    public String get(String lastname) {
        return "In the directory the subscriber " + lastname + " owns the following numbers: " + phoneBook.get(lastname);
    }
}
