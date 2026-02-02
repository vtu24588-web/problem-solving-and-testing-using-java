import java.time.LocalDate;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, LocalDate> events = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String date = sc.next();
            events.put(name, LocalDate.parse(date));
        }
        int month = sc.nextInt();
        List<Map.Entry<String, LocalDate>> list =new ArrayList<>(events.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, LocalDate> e : list) {
            System.out.print(e.getKey() + " ");
        }
        System.out.println();
        System.out.println(list.get(0).getKey());
        System.out.println(list.get(list.size() - 1).getKey());
        for (Map.Entry<String, LocalDate> e : list) {
            if (e.getValue().getMonthValue() == month) {
                System.out.print(e.getKey() + " ");
            }
        }
        sc.close();
    }
}
