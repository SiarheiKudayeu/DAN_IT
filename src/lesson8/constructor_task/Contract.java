package lesson8.constructor_task;

public class Contract {
    private int idOfContract;
    private Human human;

    public Contract(int idOfContract, Human human) {
        this.idOfContract = idOfContract;
        this.human = human;
    }

    public int getIdOfContract() {
        return idOfContract;
    }

    public void setIdOfContract(int idOfContract) {
        this.idOfContract = idOfContract;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
