import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class allocation {
    private Set<location> locations = new HashSet<>();

    public void setLocations(Set<location> locations) {
        this.locations = locations;
    }
    public void allocationRelief(double budget, List<location> allocatedLocations){
        double totalpop = 0;
        for(location loc : allocatedLocations){
            totalpop += loc.getPopulation();
        }

        double maxBenefit = 0;
        location bestlocation = null;

        for(location loc : locations){
            if(loc.getCost() <= budget){
                double benefit = loc.getPopulation() / loc.getCost();
                if(benefit > maxBenefit){
                    maxBenefit = benefit;
                    bestlocation = loc;
                }
            }
        }
        if(bestlocation != null){
            allocatedLocations.add(bestlocation);
            budget -= bestlocation.getCost();
            allocatedLocations(budget, allocatedLocations);
        }

    }

    private void allocatedLocations(double budget, List<location> allocatedLocations) {
    }
}
