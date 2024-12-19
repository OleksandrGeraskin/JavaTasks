package JavaLabs.Lab9;

import java.util.Scanner;

public class lab9_2
{
    public static String processSentence(String sentence)
    {
        if (sentence == null)
        {
            throw new NullPointerException("Введене речення не може бути null");        //Перевірка на коректність речення
        }

        if (sentence.isEmpty())
        {
            throw new IllegalArgumentException("Введене речення не може бути порожнім");
        }

        String[] parts = sentence.split(" ");       //Розбиваємо речення на слова
        StringBuilder result = new StringBuilder();

        for (String part : parts)
        {
            if (part.matches("[a-zA-Z]+"))              //Перевірка чи слово складається тільки з літер
            {
                result.append(part.toUpperCase());              //Змінюємо на великі літері підходящі слова
            }
            else
            {
                result.append(part);            //Не змінюємо інші слова
            }
            result.append(" ");                 //Додаємо пробіл між словами
        }

        return result.toString().trim();        //Повертаємо зміненне речення з видаленим пробілом
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть речення: ");          //Вводимо речення
        String input = scanner.nextLine();

        try
        {
            String result = processSentence(input);
            System.out.println("Змінене речення: " + result);   //Вивід перетворенного речення
        }
        catch (Exception e)
        {
            System.out.println("Помилка: " + e.getMessage());   //Вивід помилок
        }
        scanner.close();
    }
}