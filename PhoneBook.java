import java.util.*;

public class PhoneBook{

    Map<String, Set<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов", 3212, bookPhone);
        addNumber("Петров", 1234, bookPhone);
        addNumber("Сидоров", 546585, bookPhone);
        addNumber("Иванов", 8956477, bookPhone);
        addNumber("Сидоров", 12356233, bookPhone);
        addNumber("Иванов", 787897, bookPhone);
        printPhoneBook(bookPhone);
       }

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printPhoneBook(Map<String, ArrayList<Integer>> map){
        for (var elem : map.entrySet()) {
            String phones = "";
            for(int el: elem.getValue()){
                phones = phones + el + ",";
            }
            System.out.printf("%s: %s \n", elem.getKey(), phones);
        }
    }
}