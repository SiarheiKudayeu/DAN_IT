package lesson8.constructor_task;

public class City {
    private String name;
    private int distanceToGet;

    public City(String name, int distanceToGet) {
        this.name = name;
        this.distanceToGet = distanceToGet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceToGet() {
        return distanceToGet;
    }

    public void setDistanceToGet(int distanceToGet) {
        this.distanceToGet = distanceToGet;
    }
}
