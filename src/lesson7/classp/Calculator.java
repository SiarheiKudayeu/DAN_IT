package lesson7.classp;

public class Calculator {
    public static void dosmth(){
        System.out.println("do smth");
    }
    /*public static void calculate(){
        System.out.println("Я не могу ничего посчитать");
    }*/
    public static void calculate(String text){
        System.out.println("Я не могу ничего посчитать");
        System.out.println("Вы ввели текст: "+text);
    }
    public static void calculate(int number1, int number2){
        System.out.println("Умножение параметров равно "+number1*number2);
    }
    public static void calculate(int number1, String text, int number2 ){
        calculate(number1,number2);
        calculate(text);
        dosmth();
    }

    public static void main(String[] args) {
        calculate(1,"Text",5);
    }

}
