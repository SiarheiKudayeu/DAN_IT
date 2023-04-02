package lesson10.exceptions.ex2;

class NoSuchMAilException extends Exception{
    public String getMessage(){
        return "Данный мейл занят";
    }
}
