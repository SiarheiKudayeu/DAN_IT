package lesson8.constructor_task;

public class Auto {
    private String name;
    private int cost;
    private int lastTOdistance;
    private int currentTOdistance;
    private int futureTOdistance;

    public Auto(String name, int cost, int lastTOdistance, int currentTOdistance, int futureTOdistance) {
        this.name = name;
        this.cost = cost;
        this.lastTOdistance = lastTOdistance;
        this.currentTOdistance = currentTOdistance;
        this.futureTOdistance = futureTOdistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getLastTOdistance() {
        return lastTOdistance;
    }

    public void setLastTOdistance(int lastTOdistance) {
        this.lastTOdistance = lastTOdistance;
    }

    public int getCurrentTOdistance() {
        return currentTOdistance;
    }

    public void setCurrentTOdistance(int currentTOdistance) {
        this.currentTOdistance = currentTOdistance;
    }

    public int getFutureTOdistance() {
        return futureTOdistance;
    }

    public void setFutureTOdistance(int futureTOdistance) {
        this.futureTOdistance = futureTOdistance;
    }
}
