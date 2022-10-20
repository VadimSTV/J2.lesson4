package J2.lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"White", "Black", "Orange", "Red", "Blue", "Yellow", "Black",
                            "Pink", "White", "Green", "Grey", "Grey", "Blue", "Purple",
                            "Green", "Brown", "Orange", "White", "Pink", "Black", "Yellow"};
        System.out.println("Начальный массив: " + Arrays.asList(colors));
        Set<String> colorsUnique = new HashSet<>(Arrays.asList(colors));
        System.out.println("Список уникальных слов начального массива: " + colorsUnique);
        Map<String, Integer> colorsRepeat = new HashMap<>();
        for (String color : colors) {
            if (colorsRepeat.containsKey(color)) {
                colorsRepeat.put(color, colorsRepeat.get(color) + 1);
            } else {
                colorsRepeat.put(color, 1);
            }
        }
        System.out.println("Количество или повторение каждого слова: " + colorsRepeat + "\n");

        // №2
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Petrov", "+79609999999");
        telephoneDirectory.add("Sidorov", "+79610220222");
        telephoneDirectory.add("Ivanchenko", "+79624601111");
        telephoneDirectory.add("Kravchenko", "+79630040123");
        telephoneDirectory.add("Petrov", "+79059874561");
        telephoneDirectory.add("Sidorenko", "+79066543210");
        telephoneDirectory.add("Molodec", "+79031234560");
        telephoneDirectory.add("Sidorov", "+79097707222");
        telephoneDirectory.add("Kravchenko", "+79969966900");
        telephoneDirectory.add("Kravetc", "+79969996600");
        System.out.println(telephoneDirectory.get("Kravchenko"));
        System.out.println(telephoneDirectory.get("Sidorenko"));
        System.out.println(telephoneDirectory.get("Molodec"));
        System.out.println(telephoneDirectory.get("Kravetc"));
    }
}
