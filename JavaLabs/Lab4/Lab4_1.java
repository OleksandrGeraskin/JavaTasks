package JavaLabs.Lab4;

public class Lab4_1
{
    public static int countNegatives(int[] array)
    {
        int count = 0;
        for (int num : array)       //Підрахунок від'ємних чисел
        {
            if (num < 0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int[] array1 = {-1, 2, -3, 4, 0};
        int[] array2 = {0, 0, 0};
        int[] array3 = {-5, -6, -7};

        System.out.println("Кількість від’ємних елементів у масиві 1: " + countNegatives(array1));
        System.out.println("Кількість від’ємних елементів у масиві 2: " + countNegatives(array2));
        System.out.println("Кількість від’ємних елементів у масиві 3: " + countNegatives(array3));
    }
}