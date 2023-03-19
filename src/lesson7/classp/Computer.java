package lesson7.classp;

public class Computer {
    public String name;
    public int price;
    public int ram;
    public int video;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public boolean mouseInclude;

    public String getName(){
        return name;
    }

    public void setName(String vasia){
        this.name=vasia;
    }
    public int plus (int number1,int number2){
        return number1+number2;
    }
    public String helloWord(){
        String hello= "hello world";
        return hello;
    }
    public boolean getMouseInclude(){
        return mouseInclude;
    }
    public void setMouseInclude(boolean mouse){
        this.mouseInclude=mouse;
    }
}


