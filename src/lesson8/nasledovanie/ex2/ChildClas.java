package lesson8.nasledovanie.ex2;

public class ChildClas extends ParentClass{
    private String childString;
    public ChildClas(String a, String b, int x, String childString){
        super(a,b,x);
        this.childString=childString;
    }
    public void childclassVoid(){
        System.out.println("child class void");
    }
}
