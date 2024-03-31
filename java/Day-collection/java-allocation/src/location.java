public class location {
private String name;
private int population;
private double cost;

    public location(String name, int population, double cost) {
        this.name = name;
        this.population = population;
        this.cost = cost;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "location{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", cost=" + cost +
                '}';
    }
}




