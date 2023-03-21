package lesson8.constructor_task;

public class Main {

 /*Написать метод при помощи объектного подхода.
    Которая будет выводить сообщение о том нужно ли человеку,
    владеющему автомобилем и имеющему договор с автосервисом
    перед поездкой в какой-нибудь город пройти ТО.

    Решение о том, нужно ли человеку проходить ТО, происходит в атосервисе.
    Для этого у человека должен быть заключен контракт с сервисом.

    В контракте содержится id этого контракта, и закрепленный к нему человек
    с определенным именем.

    У каждого автомобиля есть цена, назавание, текущий пробег, пробег на момент финального ТО,
    и расстояние, после проезда которго автомобиль должен проходить ТО.

    Автомобиль закреплен за определенным человеком.

    Если при поездке в определеный город, пробег после финального ТО превышает расстояние,
    после проезда которго автомобиль должен проходить ТО. То на консоль выводится сообщение типа:

    Уважаемый {Имя человека}.
    Прежде чем вы направитесь в {Название города} вам понадобится пройти ТО.

    Уважаемый {Имя человека}.
    Езжайте в {Название города}. Но не забывайте, что согласно
    договору {айди договора} вы обслуживаетесь у нас.
    Ваша {Название Сервиса}.*/
 public static void main(String[] args) {
     Servis servis = new Servis("Шаловливая компрессия");
     servis.readyForService(new Contract(112233,
             new Human("Siarhei",
                     new Auto("Renault",2000,13000,14000,23000)))
     ,new City("Киев",7000));
 }
}
