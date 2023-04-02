package lesson10.Ex23;

public class Person {
    int salary;
    String name;
    int coutOfFriens;

    public Person(int salary, String name, int coutOfFriens) {
        this.salary = salary;
        this.name = name;
        this.coutOfFriens = coutOfFriens;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoutOfFriens() {
        return coutOfFriens;
    }

    public void setCoutOfFriens(int coutOfFriens) {
        this.coutOfFriens = coutOfFriens;
    }
    private void isDayOFF(DaysOfWeek daysOfWeek) throws NotWeekEndsException {
        if(daysOfWeek.equals(DaysOfWeek.SAT)||daysOfWeek.equals(DaysOfWeek.SUN)){
            System.out.println("Ура выходные");
        }else {
            throw new NotWeekEndsException();
        }
    }
    private void isSlaryEnough() throws LowSalaryException {
        if(salary<5000){
            throw new LowSalaryException();
        }else {
            System.out.println("Денег вроде хватит");
        }
    }
    private void doYouHaveFriends() throws NofriendsException {
        if(coutOfFriens<=0){
            throw new NofriendsException();
        }else {
            System.out.println("С друзьями все в порядке");
        }
    }
    public void canIhaveParty(DaysOfWeek daysOfWeek) throws NotWeekEndsException, LowSalaryException, NofriendsException {
        isDayOFF(daysOfWeek);
        isSlaryEnough();
        doYouHaveFriends();
        System.out.println("Ура праздник");
    }
}
