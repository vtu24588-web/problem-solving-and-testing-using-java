import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Static method for filtering
    public static boolean isOlderThanLimit(Person p, int ageLimit) {
        return p.age > ageLimit;
    }
}

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            persons.add(new Person(name, age));
        }

        int ageLimit = sc.nextInt();

        // 1️⃣ Sort alphabetically by name (method reference)
        String sortedNames = persons.stream()
                .map(Person::getName)
                .sorted(String::compareTo)
                .collect(Collectors.joining(" "));
        System.out.println(sortedNames);

        // 2️⃣ Filter persons older than ageLimit (static method reference)
        String filteredNames = persons.stream()
                .filter(p -> Person.isOlderThanLimit(p, ageLimit))
                .map(Person::getName)
                .collect(Collectors.joining(" "));
        System.out.println(filteredNames);

        // 3️⃣ Convert all names to uppercase (instance method reference)
        String upperCaseNames = persons.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));
        System.out.println(upperCaseNames);
    }
}
