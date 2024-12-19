package JavaLabs.Lab9;

import java.util.Scanner;

public class lab9_1
{
    public static int hexStringToInt(String input)
    {
        if (input == null)          //Перевірка вірності вводу числа
        {
            throw new NullPointerException("Введене число не може бути null");
        }

        if (input.isEmpty())
        {
            throw new IllegalArgumentException("Введене число не може бути порожнім");
        }

        try             //Перетворення в десяткове
        {
            return Integer.parseInt(input, 16);
        }
        catch (NumberFormatException e)         //Перевірка коректності числа
        {
            throw new IllegalArgumentException("Некоректне шістнадцяткове число: " + input);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть шістнадцяткове число: ");         //Ввід числа
        String input = scanner.nextLine();

        try
        {
            int result = hexStringToInt(input);             //Вивід десяткового числа
            System.out.println("Десятичне значення: " + result);
        }
        catch (Exception e)             //Якщо є помилка
        {
            System.out.println("Помилка: " + e.getMessage());
        }
        scanner.close();
    }
}