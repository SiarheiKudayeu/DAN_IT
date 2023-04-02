package lesson10.exceptions.ex2;

public class Main {
    public void insert2() throws NoSuchMAilException{
        InsertName insertName = new InsertName();
        insertName.insertName();
    }
    public static void main(String[] args)  {
        InsertName insertName = new InsertName();
        try {
            insertName.insertName();
        }catch (NoSuchMAilException te){
            System.out.println(te.getMessage());
        }

    }
}
