package lesson10.hm;

public class Converter {
    String name;

    public Converter(String name) {
        this.name = name;
    }
    public int convertToInt(int number){
        return number;
    }
    public int convertToInt(byte b){
        return b;
    }
    public int convertToInt(short s){
        return s;
    }
    public int convertToInt(long l){
        return (int) l;
    }
    public int convertToInt(float f){
        return (int) f;
    }
    public int convertToInt(double d){
        return (int) d;
    }
    public void array(int[] i){

    }
    public int convertToInt(String s){
        return Integer.parseInt(s);
    }
    public int convertToInt(boolean b){
        System.out.println("Вы ввели boolean");
        return 0;
    }
}
