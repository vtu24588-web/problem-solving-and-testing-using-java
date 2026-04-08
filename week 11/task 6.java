import java.util.*;

class Solution {
    Map<Integer, Employee> map;

    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        return dfs(id);
    }

    private int dfs(int id) {
        Employee employee = map.get(id);
        int totalImportance = employee.importance;
        
        for (Integer subId : employee.subordinates) {
            totalImportance += dfs(subId);
        }
        
        return totalImportance;
    }
}
