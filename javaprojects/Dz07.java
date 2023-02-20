/*В файле содержится строка с данными:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/

package javaprojects;

public class Dz07 {

    public static void main(String[] args) {
        String input = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        input = clip(input); // убирает квадратные скобки
        String[] students = input.split(", ");
        for (String student : students) {
            student = clip(student);
            System.out.println(student);
            String[] keyValues = student.split(",");
            String name = "", grade = "", subject = "";
            for (String keyValue : keyValues) {
                String[] keyValueParts = keyValue.split(":");
                String key = clip(keyValueParts[0]);
                String value = keyValueParts[1];

                if (key.equals("фмилия"))
                    name = value;
                else if (key.equals("оценка"))
                    grade = value;
                else if (key.equals("предмет"))
                    subject = value;
                else
                    throw new IllegalStateException("Не понял что за поле");
            }
            System.out.printf("Студент %s получил %s 5 по предмету %s.", name, grade, subject);
        }
    }

    private static String clip(String str) {
        return str.substring(1, str.length() - 1);
    }
}
