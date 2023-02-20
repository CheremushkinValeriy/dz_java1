/*В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, 
используя StringBuilder. Значения null не включаются в запрос.*/

package javaprojects;

public class Dz05 {
    public static void main(String[] args) {
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(str); //выводим в консоль оригинальную строку

        StringBuilder builder = new StringBuilder(); //добавляем изменяемую строку
        builder.append("SELECT * FROM students WHERE"); //добавляетм первый элемент в StringBuilder

        str = str.replaceAll("[{}]", ""); //удаляем из оригинальной строки скобки
        boolean isFirst = true; //объявляем булевую перееменную

        String[] newStr = str.split(", ");//разбиваем оригинальную строку на массив строк

        for (String word : newStr) { // цикл forin
            String[] keyValue = word.split(":"); //разбиваем массив строк по символу :
            String key = keyValue[0]; //присваиваем переменной значание ключа
            key = key.substring(1, key.length() - 1); //убираем скобки из значения ключа
            String value = keyValue[1];//присваиваем переменной значание переменной

            if (value.equals("\"null\""))//если значение переменной = null 
                continue; // продолжи
            if (!isFirst)
                builder.append("AND"); //добавить AND если isFirst = false
            builder.append(String.format(" %s = %s ", key, value));
            isFirst = false;
        }
        builder.append(";");
        System.out.println(builder.toString());
    }
}
