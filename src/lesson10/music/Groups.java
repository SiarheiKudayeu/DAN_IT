package lesson10.music;

public enum Groups {
    METALLIC("Metallica", 3000), ACDC("ACDC", 5000), QUEEN("Queen", 8000);
    String name;
    int cost;

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

    Groups(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
