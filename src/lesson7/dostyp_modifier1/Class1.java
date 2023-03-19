package lesson7.dostyp_modifier1;

public class Class1 {
    public String publicString = "publicString";
    private String privateString = "privateString";
    public String protectedString = "protectedString";
    String defaultString="defaultString";

    public static void main(String[] args) {
        Class1 fedor = new Class1();
        System.out.println(fedor.privateString);
        System.out.println(fedor.defaultString);
    }
}
