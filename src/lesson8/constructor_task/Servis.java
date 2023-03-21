package lesson8.constructor_task;

public class Servis {
    private  String name;

    public Servis(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void readyForService(Contract contract, City city){
        int lastTODistance = contract.getHuman().getAuto().getLastTOdistance();
        int currentDistance = contract.getHuman().getAuto().getCurrentTOdistance();
        int nextTODistance = contract.getHuman().getAuto().getFutureTOdistance();
        int distanseForTo = nextTODistance-lastTODistance;
        int currentKM= currentDistance-lastTODistance;
        int distanceForCity= (city.getDistanceToGet())*2;
        if(currentKM+distanceForCity<distanseForTo){
            System.out.println("Уважаемый "+ contract.getHuman().getName()+".");
            System.out.println("Езжайте в "+city.getName()+". Но не забывайте, что согласно\n" +
                    "договору "+contract.getIdOfContract()+" вы обслуживаетесь у нас.\n" +"Ваша "+ getName());
        }else {
            System.out.println("Уважаемый "+ contract.getHuman().getName()+".");
            System.out.println("Прежде чем вы направитесь в " +city.getName() +" вам понадобится пройти ТО.");
        }

    }
}
