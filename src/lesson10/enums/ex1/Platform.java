package lesson10.enums.ex1;

public enum Platform {IOS("IOS"),ANDROID("ANDROID");
    String name;

    Platform(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
