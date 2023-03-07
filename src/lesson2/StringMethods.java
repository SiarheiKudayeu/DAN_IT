package lesson2;

public class StringMethods {
    public static void main(String[] args) {
        //valueOf -возвращает строковое представление
        //значений примитивных типов.
        int w =3;
        System.out.println(String.valueOf(w));

        // символы экранирования \n, \", \', \b
        System.out.println("Пробел   \b\b\nпробел");

        //Все методы класса String не изменяют строку, а возвращают ссылку на новый объект
        //конкатенация
        /*String name = "Cергей";
        String surname = "Kudayeu";
        String result = name.concat(surname);
        System.out.println(result);*/

        //charAt – возвращает символ из строки по указанному индексу;
        /*String string = "Новейшая строка";
        System.out.println(string.charAt(0));*/

        //length – возвращает количество символов в строке.
/*        String string = "Новейшая строка";
        System.out.println(string.length());*/

        //isEmpty – есди строка пустая возвращает истину,
        //если нет - ложь.
        /*String string = "Новейшая строка";
        String string1 = "";
        boolean a = string.isEmpty();
        boolean b = string1.isEmpty();
        System.out.println(b);*/

        //contains – возвращает истину, если в строке
        //хотя бы раз встречается указанная строка.
        /*String string = "Testing is my favourite job";
        boolean contains = string.contains("Testing");
        System.out.println(contains);*/

        //startsWith – возвращает истину, если указанный символ или строка
        // совпадают с началом строки.
        //endsWith – аналогично со startsWith только наоборот .
        /*String string = "Testing is my favourite job";
        boolean a = string.startsWith("Te");
        boolean b = string.endsWith("ob");
        System.out.println(a+ " "+ b);*/

        //toLowerCase – возвращае строку в нижнем регистре.
        //toUpperCase – возвращает строку, в верхнем регистре.
        /*String string = "Testing is my favourite job";
        System.out.println(string.toLowerCase());*/

        //indexOf – ищет указанный символ начиная с начала строки.
        //Возвращает индекс первого найденого по порядку совпадающего символа.
        //если совпадений нет, возвращает -1
        //lastIndexOf ищет с конца
        /*String string = "Testing is my favourite job";
        System.out.println(string.indexOf('w'));*/

        //substring – вырезает указанный промежуток символов
        //возвращает новую строку
        String string = "Testing, is my favourite job";
        String[]strings = string.split(" ");
        System.out.println(strings[2]);
        String string2 = string+"\b";
        System.out.println(string2);


        //replace – возвращает строку, заменяя указанные символы или строки.
       /* String string = "Testing is my favourite job";
        string.replace("favourite", "not favourite");
        System.out.println(string.replace("favourite", "not favourite"));*/

    }

}
