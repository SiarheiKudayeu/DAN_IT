package lesson8.incaps;

public class Student {
    private String name;
    private int age;
    private  boolean isMale;
    private String courseName;
    public Student(String name, int age, boolean isMale, String courseName){
        this.name=name;
        this.age = age;
        this.isMale= isMale;
        this.courseName= courseName;
    }
    public Student(String name, String courseName, int age, boolean isMale){
        this(name,age,courseName);
        this.isMale= isMale;
    }
    public Student(String name, int age,  String courseName){
        this.name=name;
        this.age = age;
        this.courseName= courseName;
    }
    public Student(){
        this.name="Ивасик";
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    private String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void getInfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(isMale());
        System.out.println(getCourseName());
    }
}
