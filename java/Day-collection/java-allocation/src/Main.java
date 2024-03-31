import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        location l1 = new location ("city A",10000,500000);
        location l2 = new location ("city B",15000,700000);
        location l3 = new location ("city C",20000,800000);


        allocation alloc = new allocation();
        Set<location> locations = new HashSet<>();
        locations.add(l1);
        locations.add(l2);
        locations.add(l3);
        alloc.setLocations(locations);

        double budget = 1500000;
        List<location> allocatedLocations = new ArrayList<>();
        alloc.allocationRelief(budget,allocatedLocations);

        System.out.println("Allocated Locations");
        for(location loc : allocatedLocations){
            System.out.println(loc);

        }


    }
}