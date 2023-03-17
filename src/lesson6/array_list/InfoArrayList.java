package lesson6.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class InfoArrayList {
    public static void main(String[] args) {
        // ArrayList это класс наследуемый от интерфейса List.
        //Это автоматически расширяемый массив, который может содержать элементы любого типа
        //Но в одном ArrayList могут находится только однотипные элементы
        //Мы не можем указывать примитивыне типы данных при создании ArrayList.
        //только их одноименные классы обертки
        //ArrayList<int> list = new ArrayList<>();   //Неправильная запись
        ArrayList<Integer> list = new ArrayList<>();

        //Один из вариантов прямой инициализации значений ArrayList
        /*ArrayList<Integer> list2 = new ArrayList(Arrays.asList(23, 22, 11, 10));
        System.out.println(list2);*/

        //add() - добавление элемента в ArrayList
        list.add(25);
        list.add(245);
        System.out.println(list);
        //System.out.println(Arrays.toString(list.toArray())); //можно конечно и так, но не нужно :)

        //toArray() возвращает массив с аналогичными элементами, как и у листа
        //Object[]arr = list.toArray();


        //Добавление элемента на место по индексу
        /*ArrayList<Integer> list2 = new ArrayList(Arrays.asList(23, 22, 11, 10));
        System.out.println(list2);
        list2.add(0, 2222);
        System.out.println(list2);*/

        //remove() - удаление элемента по индексу
        /*ArrayList<Integer> list2 = new ArrayList(Arrays.asList(23, 22, 11, 10,12,13,13,13,13,13));
        list2.remove(3);
        System.out.println(list2);*/

        //remove() - удаление элемента по значению
        /*ArrayList<String> list3 = new ArrayList(Arrays.asList("QA", "AQA", "Developer", "DevOps"));
        list3.remove("Developer");
        System.out.println(list3);*/

        //set() - позволяет заместить элемент по указанному индексу
        /*ArrayList<Integer> list4 = new ArrayList(Arrays.asList(44, 212, 31, 3));
        list4.set(2, 44);
        System.out.println(list4);*/

        //get(0) - получение элемента по индексу
        ArrayList<String> list3 = new ArrayList(Arrays.asList("QA", "AQA", "Developer", "DevOps"));
        System.out.println(list3.get(2));

        //indexOf() - получение индекса объекта
        System.out.println(list3.indexOf("DevOps"));

        //size() возвращает количество элементов в листе
        /*ArrayList<Integer> list5 = new ArrayList<>(20);
        System.out.println(list5.size());
        list5.add(5);
        System.out.println(list5.size());
        System.out.println(list3.size());*/

        //indexOf() - если элемент встречается в листе то возвращается индекс,
        //если не встречается, то возвращает -1
        /*ArrayList<String> list5 = new ArrayList(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday"));
        System.out.println(list5.indexOf("Tuesday"));
        System.out.println(list5.indexOf("Friday"));*/

        //contains() - возвращает true, если указанный элемент встречается в листе
        //в противном случае false
        ArrayList<String> list5 = new ArrayList(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday"));
        System.out.println(list5.contains("Tuesday"));
        System.out.println(list5.contains("Friday"));

        //ensureCapacity() - устанавливает по возможности минимально допустимую емкость, но не влияет на текущий размер листа
        //по умолчанию емкость листа 10.
        //Можно задавать емкость при инициализации
        ArrayList<Integer> ints = new ArrayList<>(50);
        ints.add(2);
        ints.trimToSize();

        list5.ensureCapacity(2);
        System.out.println(list5);


        //trimToSize() - обрезает емкость экземпляра ArrayList до текущего размера.
        /*list5.trimToSize();*/
    }
}
