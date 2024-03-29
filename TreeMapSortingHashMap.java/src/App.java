import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        Map<Integer, String> employeeMap = new HashMap<>();

    employeeMap.put(123, "Alex");
    employeeMap.put(342, "Ryan");
    employeeMap.put(143, "Joe");
    employeeMap.put(234, "Allen");
    employeeMap.put(432, "Roy");

    System.out.println("Unsorted map " + employeeMap);

    TreeMap<Integer, String> sortedMap = new TreeMap<>();
    sortedMap.putAll(employeeMap);
    System.out.println("Sorted map " + sortedMap);
    }
}
