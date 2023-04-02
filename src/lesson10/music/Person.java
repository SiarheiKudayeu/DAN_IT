package lesson10.music;

public class Person {
    private int money;
    private String name;

    public Person(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void goToConcert(){
        if(money<Groups.METALLIC.getCost()) {
            System.out.println(name + " сиди дома");
        } else if (money<Groups.ACDC.getCost()) {
            System.out.println(name + " можешь сходить на "+Groups.METALLIC.getName());
        } else if (money<Groups.QUEEN.getCost()) {
            System.out.println(name + " можешь сходить на "+Groups.METALLIC.getName() +","
            +Groups.ACDC.getName());
        }else {
            System.out.println("Иди куда хочешь");
        }
    }
}
